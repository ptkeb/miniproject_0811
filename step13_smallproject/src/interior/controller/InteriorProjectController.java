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
	public static ArrayList<ProductDTO> getAllInteriorProjects(){
		ArrayList<ProductDTO> allProject = null;
		try{			
			allProject = ProductDAO.getAllInteriorProjects();			
		}catch(SQLException s){
			s.printStackTrace();
			EndView.showError("모든 프로젝트 검색시 에러 발생");
		}
		return allProject;
	}

}
