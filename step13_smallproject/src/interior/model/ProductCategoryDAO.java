package interior.model;


import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import interior.model.dto.ProductCategoryDTO;
import interior.model.dto.ProductDTO;
import interior.model.util.DBUtil;

public class ProductCategoryDAO {
private static Properties sql = DBUtil.getSql();
	
	public static boolean addProductCategory(ProductCategoryDTO productCategory) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			
			pstmt = con.prepareStatement(sql.getProperty("addActivist"));
			
			pstmt.setString(1, productCategory.getPname());
			pstmt.setString(2, productCategory.getCategory());
			
			int result = pstmt.executeUpdate();
		
			if(result == 1){
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}
	
	public static boolean updateProductCategory(String Pname, String Category) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			
			pstmt.setString(1, Pname);
			pstmt.setString(2, Category);
			
			int result = pstmt.executeUpdate();
			if(result == 1){
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}
	
	public static boolean deleteProductCategory(String Pname) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("delete from ProductCategory");
			
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
	
	public static ProductCategoryDTO getProduct(String Pname) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ProductCategoryDTO productCategory = null;
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select pname from ProductCategory");
			pstmt.setString(1, Pname);
			rset = pstmt.executeQuery();
			if(rset.next()){
				productCategory = new ProductCategoryDTO(rset.getString(1), rset.getString(2));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return productCategory;
	}
	
	public static ArrayList<ProductCategoryDTO> getAllActivists() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<ProductCategoryDTO> list = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from ProductCategory");
			rset = pstmt.executeQuery();
			
			list = new ArrayList<ProductCategoryDTO>();
			while(rset.next()){
				list.add(new ProductCategoryDTO(rset.getString(1), rset.getString(2)));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}

}
