package interior.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import interior.model.dto.ElectronicsDTO;
import interior.model.util.DBUtil;

public class ElectronicsDAO {
	private static Properties sql = DBUtil.getSql();
		//저장
		public static boolean addElectronics(ElectronicsDTO Electronics) throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(sql.getProperty("addElectronics"));
				pstmt.setInt(1, Electronics.getPnum());
				pstmt.setString(2, Electronics.getElectronicsPname());
				pstmt.setInt(3, Electronics.getElectronicsPrice());
				pstmt.setString(4, Electronics.getElectronicsStandard());
				pstmt.setString(5, Electronics.getElectronicsColor());
				pstmt.setInt(6, Electronics.getElectronicsPriority());
				
				int result = pstmt.executeUpdate();
			
				if(result == 1){
					return true;
				}
			}finally{
				DBUtil.close(con, pstmt);
			}
			return false;
		}

		//수정
		public static boolean updateElectronics(int pnum, String major) throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(sql.getProperty("updateElectronics"));
				pstmt.setInt(1, pnum);
				pstmt.setString(2, major);
				
				int result = pstmt.executeUpdate();
				if(result == 1){
					return true;
				}
			}finally{
				DBUtil.close(con, pstmt);
			}
			return false;
		}


		//삭제 
		public static boolean deleteElectronics(int pnum) throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(sql.getProperty("deleteElectronics"));
				pstmt.setInt(1, pnum);
				int result = pstmt.executeUpdate();
				if(result == 1){
					return true;
				}
			}finally{
				DBUtil.close(con, pstmt);
			}
			return false;
		}
		
		//Electronics 아이디로 해당 Electronics 모든 정보 검색
		//반환값은 생성된 객체 또는 null 또는 예외
		public static ElectronicsDTO getElectronics(int pnum) throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			ElectronicsDTO Electronics = null;
			
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(sql.getProperty("getElectronics"));
				pstmt.setInt(1, pnum);
				rset = pstmt.executeQuery();
				
				if(rset.next()){
					Electronics = new ElectronicsDTO(rset.getInt(1), rset.getString(2), rset.getInt(3), rset.getString(4), rset.getString(5), rset.getInt(6)
);
				}
			}finally{
				DBUtil.close(con, pstmt, rset);
			}
			return Electronics;
		}

		//모든 프로보노 검색
		public static ArrayList<ElectronicsDTO> getAllElectronics() throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			ArrayList<ElectronicsDTO> list = null;
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(sql.getProperty("getAllElectronics"));
				rset = pstmt.executeQuery();
				
				list = new ArrayList<ElectronicsDTO>();
				while(rset.next()){
					list.add(new ElectronicsDTO(rset.getInt(1), rset.getString(2), rset.getInt(3), rset.getString(4), rset.getString(5), rset.getInt(6)
) );
				}
			}finally{
				DBUtil.close(con, pstmt, rset);
			}
			return list;
		}
	}



