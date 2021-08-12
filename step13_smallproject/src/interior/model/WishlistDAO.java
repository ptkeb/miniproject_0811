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
			wishlist = new WishlistDTO(rset.getInt(1), rset.getInt(2));
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
				list.add(new WishlistDTO(rset.getInt(1), rset.getInt(2)));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}
	
}



//package interior.model;
//
//import java.sql.Connection;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Properties;
//
//import interior.model.dto.DecorationDTO;
//import interior.model.util.DBUtil;
//
//
//public class DecorationDAO {
//	
//	private static Properties sql = DBUtil.getSql();
//
//	
//	public static boolean addDecoration(DecorationDTO decoration) throws SQLException {
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		try {
//			con = DBUtil.getConnection();
//			
//			pstmt = con.prepareStatement("insert into decoration values(?, ?, ?, ?, ?, ?");
//
//			pstmt.setInt(1, decoration.getPnum());
//			pstmt.setString(2, decoration.getDecorationPname());
//			pstmt.setInt(3, decoration.getDecorationPrice());
//			pstmt.setString(4, decoration.getDecorationStandard());
//			pstmt.setString(5, decoration.getDecorationStandard());
//			pstmt.setInt(6, decoration.getDecorationPriority());
//
//			int result = pstmt.executeUpdate();
//
//			if (result == 1) {
//				return true;
//			}
//		} finally {
//			DBUtil.close(con, pstmt);
//		}
//		return false;
//	}
//	
//	//  update decoration set 열 = ? where pnum =? 인데 아직 보류 ! 수정 필요
//	public static boolean updateDecoration(int decorationNum, String major) throws SQLException {
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		try {
//			con = DBUtil.getConnection();
//
//			pstmt = con.prepareStatement(sql.getProperty("updateDecoration"));
//			pstmt.setString(1, major);
//			pstmt.setInt(2, decorationNum);
//
//			int result = pstmt.executeUpdate();
//			if (result == 1) {
//				return true;
//			}
//		} finally {
//			DBUtil.close(con, pstmt);
//		}
//		return false;
//	}
//	
//	public static DecorationDTO getDecoration(int decorationNum) throws SQLException {
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rset = null;
//		DecorationDTO decoration = null;
//
//		try {
//			con = DBUtil.getConnection();
//			pstmt = con.prepareStatement("select * from decoration where decorationNum=?");
//			pstmt.setInt(1, decorationNum);
//			rset = pstmt.executeQuery();
//			if (rset.next()) {
//				decoration = new DecorationDTO(rset.getInt(1), rset.getString(2), rset.getInt(3), rset.getString(4), rset.getString(5), rset.getInt(6)
//);
//			}
//		} finally {
//			DBUtil.close(con, pstmt, rset);
//		}
//		return decoration;
//	}
//	
//	
//	// sql - delete from activist where activist_id=?
//	public static boolean deleteDecoration(int decorationNum) throws SQLException {
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		try {
//			con = DBUtil.getConnection();
//			pstmt = con.prepareStatement("delete from decoration where decorationNum=?");
//			pstmt.setInt(1, decorationNum);
//			int result = pstmt.executeUpdate();
//			if (result == 1) {
//				return true;
//			}
//		} finally {
//			DBUtil.close(con, pstmt);
//		}
//		return false;
//	}
//	
//	// pnum으로 해당 제품 모든 정보 반환
//	public static ArrayList<DecorationDTO> getAllDecoration() throws SQLException {
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rset = null;
//		ArrayList<DecorationDTO> list = null;
//		try {
//			con = DBUtil.getConnection();
//			pstmt = con.prepareStatement(sql.getProperty("getAllActivists"));
//			rset = pstmt.executeQuery();
//
//			list = new ArrayList<DecorationDTO>();
//			while (rset.next()) {
//				list.add(new DecorationDTO(rset.getInt(1), rset.getString(2), rset.getInt(3), rset.getString(4), rset.getString(5), rset.getInt(6)));
//			}
//		} finally {
//			DBUtil.close(con, pstmt, rset);
//		}
//		return list;
//	}
//}