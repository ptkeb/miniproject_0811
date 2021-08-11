package interior.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import interior.model.dto.ProductDTO;
import interior.model.util.DBUtil;

public class ProductDAO {
	private static Properties sql = DBUtil.getSql();
	
	public static boolean addProduct(ProductDTO product) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			
			pstmt = con.prepareStatement(sql.getProperty("addActivist"));
			
			pstmt.setString(1, product.getPname());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getStandard());
			pstmt.setInt(4, product.getPriority());
			pstmt.setString(5, product.getColor());
			
			int result = pstmt.executeUpdate();
		
			if(result == 1){
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}
	
	public static boolean updateProduct(String Pname, int Price, String Standard, int Priority, String Color) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			
			pstmt.setString(1, Pname);
			pstmt.setInt(2, Price);
			pstmt.setString(3, Standard);
			pstmt.setInt(4, Priority);
			pstmt.setString(5, Color);
			
			int result = pstmt.executeUpdate();
			if(result == 1){
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}
	
	public static boolean deleteProduct(String Pname) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getProperty("deleteActivist"));
			
			pstmt.setString(1, Pname);
			
			int result = pstmt.executeUpdate();
			if(result == 1){
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}
	
	public static ProductDTO getProduct(String Pname) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ProductDTO product = null;
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getProperty("getActivist"));
			pstmt.setString(1, Pname);
			rset = pstmt.executeQuery();
			if(rset.next()){
				product = new ProductDTO(rset.getString(1), rset.getInt(2), rset.getString(3), rset.getInt(4), rset.getString(5));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return product;
	}
	
	public static ArrayList<ProductDTO> getAllActivists() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<ProductDTO> list = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getProperty("getAllActivists"));
			rset = pstmt.executeQuery();
			
			list = new ArrayList<ProductDTO>();
			while(rset.next()){
				list.add(new ProductDTO(rset.getString(1), rset.getInt(2), rset.getString(3), rset.getInt(4), rset.getString(5)));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}
}
