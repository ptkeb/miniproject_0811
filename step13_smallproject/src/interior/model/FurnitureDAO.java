package interior.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import interior.model.dto.FurnitureDTO;
import interior.model.util.DBUtil;

public class FurnitureDAO {
	private static Properties sql = DBUtil.getSql();
	
	public static boolean addFurniture(FurnitureDTO furniture) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try{
			con = DBUtil.getConnection();
			
			pstmt = con.prepareStatement(sql.getProperty("addFurniture"));
			
			pstmt.setInt(1, furniture.getPnum());
			pstmt.setString(2, furniture.getFurniturePname());
			pstmt.setInt(3, furniture.getFurniturePrice());
			pstmt.setString(4, furniture.getFurnitureStandard());
			pstmt.setString(5, furniture.getFurnitureColor());
			pstmt.setString(6, furniture.getFurnitureColor());
			
			int result = pstmt.executeUpdate();
		
			if(result == 1){
				return true;
			}
		}finally{
			DBUtil.close(con, pstmt);
		}
		return false;
	}

		public static boolean updateFurniture(String pnum, String major) throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			try{
				con = DBUtil.getConnection();
				
				pstmt = con.prepareStatement(sql.getProperty("updateFurniture"));
				pstmt.setString(1, major);
				pstmt.setString(2, pnum);
				
				int result = pstmt.executeUpdate();
				if(result == 1){
					return true;
				}
			}finally{
				DBUtil.close(con, pstmt);
			}
			return false;
		}

		public static boolean deleteFurniture(String pnum) throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(sql.getProperty("deleteFurniture"));
				pstmt.setString(1, pnum);
				int result = pstmt.executeUpdate();
				if(result == 1){
					return true;
				}
			}finally{
				DBUtil.close(con, pstmt);
			}
			return false;
		}
	
		public static FurnitureDTO getFurniture(String pnum) throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			FurnitureDTO Furniture = null;
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(sql.getProperty("getFurniture"));
				pstmt.setString(1, pnum);
				rset = pstmt.executeQuery();
				if(rset.next()){
					Furniture = new FurnitureDTO(rset.getInt(1), rset.getString(2), rset.getInt(3), rset.getString(4), rset.getString(5), rset.getInt(6));
				}
			}finally{
				DBUtil.close(con, pstmt, rset);
			}
			return Furniture;
		}

		public static ArrayList<FurnitureDTO> getAllActivists() throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			ArrayList<FurnitureDTO> list = null;
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(sql.getProperty("getAllFurniture"));
				rset = pstmt.executeQuery();
				
				list = new ArrayList<FurnitureDTO>();
				while(rset.next()){
					list.add(new FurnitureDTO(rset.getInt(1), rset.getString(2), rset.getInt(3), rset.getString(4), rset.getString(5), rset.getInt(6)));
				}
			}finally{
				DBUtil.close(con, pstmt, rset);
			}
			return list;
		}
}