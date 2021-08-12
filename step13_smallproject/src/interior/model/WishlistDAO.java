package interior.model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import interior.model.dto.WishlistDTO;
import interior.model.util.DBUtil;

public class WishlistDAO {
	
	private static Properties sql = DBUtil.getSql();
	
	public static boolean addDecoration(WishlistDTO wishlist) throws SQLException {
	Connection con = null;
	PreparedStatement pstmt = null;
	try {
		con = DBUtil.getConnection();
		
		pstmt = con.prepareStatement(sql.getProperty("insert into withlist values(?, ?"));

		pstmt.setInt(1, wishlist.getPnum());
		pstmt.setInt(2, wishlist.getPrice());
		int result = pstmt.executeUpdate();

		if (result == 1) {
			return true;
		}
	} finally {
		DBUtil.close(con, pstmt);
	}
	return false;
}
	public static WishlistDTO getWishlist(int wishlistNum) throws SQLException {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rset = null;
	WishlistDTO wishlist = null;

	try {
		con = DBUtil.getConnection();
		pstmt = con.prepareStatement(sql.getProperty("select * from wishlist where withlistNum=?"));
		pstmt.setInt(1, wishlistNum);
		rset = pstmt.executeQuery();
		if (rset.next()) {
			wishlist = new WishlistDTO(rset.getInt(1), rset.getInt(2), rset.getString(3));
		}
	} finally {
		DBUtil.close(con, pstmt, rset);
	}
	return wishlist;
}
	// pnum, price
	// sql - delete from activist where activist_id=?
	public static boolean deleteWishlist(int wishlistNum) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getProperty("delete from wishlist where decorationNum=?"));
			pstmt.setInt(1, wishlistNum);
			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}
	
	// pnum으로 해당 제품 모든 정보 반환
	public static ArrayList<WishlistDTO> getAllWishlist() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<WishlistDTO> list = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getProperty("select * from wishlist"));
			rset = pstmt.executeQuery();

			list = new ArrayList<WishlistDTO>();
			while (rset.next()) {
				list.add(new WishlistDTO(rset.getInt(1), rset.getInt(2), rset.getString(3)));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}
	
}
