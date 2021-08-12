package interior.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import interior.model.ProductDAO;
import interior.model.dto.ProductDTO;
import interior.view.EndView;

public class InteriorProjectController {
	
//모든 인테리어 정보 검색 - select * from dept;
//	public void selectAll() {
//		Connection con = null;
//		Statement stmt = null;
//		ResultSet rset = null;
//
//		try {
//			con = DBUtil.getConnection();
//			stmt = con.createStatement();
//			
//			rset = stmt.executeQuery("select * from product");
//
//			while (rset.next()) {
//				System.out.println(rset.getString("pname") + "/" 
//								+ rset.getInt("price") + "/"
//								+ rset.getString("standard") + "/"
//								+ rset.getString("priority") + "/"
//								+ rset.getString("color"));
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.close(con, stmt, rset);
//		}
//	}
	public static ArrayList<ProductDTO> getAllProductCategory(){
		ArrayList<ProductDTO> allProject = null;
		try{			
			allProject = ProductDAO.getAllProductCategory();			
		}catch(SQLException s){
			s.printStackTrace();
			EndView.showError("모든 가구 검색시 에러 발생");
		}
		return allProject;
	}

//	지정된 인테리어소품 검색
	public void selectOne(String v1, String v2) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;

		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();

			rset = stmt.executeQuery("select * from "+ v1 + " product where "+ v2 +" ");

			if (rset.next()) {
				System.out.println(rset.getString("pname") + "/" 
						+ rset.getInt("price") + "/"
						+ rset.getString("standard") + "/"
						+ rset.getString("priority") + "/"
						+ rset.getString("color"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, stmt, rset);
		}
	}

}
