package interior.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import interior.model.dto.PurchaseListDTO;
import interior.model.dto.WishlistDTO;
import interior.model.util.DBUtil;

public class PurchaseListDAO {
	private static Properties sql = DBUtil.getSql();

	public static boolean addPurchaseList(WishlistDTO el) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(sql.getProperty("addPurchaseList"));

			pstmt.setInt(1, el.getPnum());
			pstmt.setString(2, el.getName());
			pstmt.setInt(3, el.getPrice());

			int result = pstmt.executeUpdate();

			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	public static boolean deletePurchaseList(int pnum) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getProperty("deletePurchaseList"));
			pstmt.setInt(1, pnum);
			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	public static PurchaseListDTO getPurchaseList(int pnum) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		PurchaseListDTO purchaseList = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getProperty("getPurchaseList"));
			pstmt.setInt(1, pnum);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				purchaseList = new PurchaseListDTO(rset.getInt(1), rset.getString(2), rset.getInt(3));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return purchaseList;
	}

	public static ArrayList<PurchaseListDTO> getAllPurchaseList() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<PurchaseListDTO> list = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from purchaselist");
			rset = pstmt.executeQuery();

			list = new ArrayList<PurchaseListDTO>();
			while (rset.next()) {
				list.add(new PurchaseListDTO(rset.getInt(1), rset.getString(2), rset.getInt(3)));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}

}
