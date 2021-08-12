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
		//����
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

		//����
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


		//���� 
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
		
		//Electronics ���̵�� �ش� Electronics ��� ���� �˻�
		//��ȯ���� ������ ��ü �Ǵ� null �Ǵ� ����
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

		//��� ���κ��� �˻�
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



