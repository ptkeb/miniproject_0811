package interior.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import interior.model.dto.SeasonalityDTO;
import interior.model.util.DBUtil;

public class SeasonalityDAO {
	private static Properties sql = DBUtil.getSql();
		
	public static boolean addSeasonality(SeasonalityDTO seasonality) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try{
			con = DBUtil.getConnection();
			
			pstmt = con.prepareStatement(sql.getProperty("addSeasonality"));
			
			pstmt.setInt(1, seasonality.getPnum());
			pstmt.setString(2, seasonality.getSeasonalityPname());
			pstmt.setInt(3, seasonality.getSeasonalityPrice());
			pstmt.setString(4, seasonality.getSeasonalityStandard());
			pstmt.setString(5, seasonality.getSeasonalityColor());
			pstmt.setInt(6, seasonality.getSeasonalityPriority());
			
			int result = pstmt.executeUpdate();
		
			if(result == 1){
				return true;
			}
		}finally{
			DBUtil.close(con, pstmt);
		}
		return false;
	}

		public static boolean updateSeasonality(String pnum, String major) throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			try{
				con = DBUtil.getConnection();
				
				pstmt = con.prepareStatement(sql.getProperty("updateSeasonality"));
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

		public static boolean deleteSeasonality(String pnum) throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(sql.getProperty("deleteSeasonality"));
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
	
		public static SeasonalityDTO getSeasonality(String pnum) throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			SeasonalityDTO Seasonality = null;
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(sql.getProperty("getSeasonality"));
				pstmt.setString(1, pnum);
				rset = pstmt.executeQuery();
				if(rset.next()){
					Seasonality = new SeasonalityDTO(rset.getInt(1), rset.getString(2), rset.getInt(3), rset.getString(4), rset.getString(5), rset.getInt(6));
				}
			}finally{
				DBUtil.close(con, pstmt, rset);
			}
			return Seasonality;
		}

		public static ArrayList<SeasonalityDTO> getAllSeasonality() throws SQLException{
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			ArrayList<SeasonalityDTO> list = null;
			try{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(sql.getProperty("getAllSeasonality"));
				rset = pstmt.executeQuery();
				
				list = new ArrayList<SeasonalityDTO>();
				while(rset.next()){
					list.add(new SeasonalityDTO(rset.getInt(1), rset.getString(2), rset.getInt(3), rset.getString(4), rset.getString(5), rset.getInt(6)));
				}
			}finally{
				DBUtil.close(con, pstmt, rset);
			}
			return list;
		}
}

