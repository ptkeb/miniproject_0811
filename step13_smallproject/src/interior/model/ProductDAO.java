package interior.model;

import java.sql.SQLException;
import java.util.ArrayList;

import interior.model.dto.DecorationDTO;
import interior.model.dto.ElectronicsDTO;
import interior.model.dto.FurnitureDTO;
import interior.model.dto.SeasonalityDTO;

public class ProductDAO {
	public static boolean addProduct(int pnum, Object product) throws SQLException{
		if (pnum / 1000 == 1) {
			return FurnitureDAO.addFurniture((FurnitureDTO)product);
		}
		else if (pnum / 1000 == 2) {
			return ElectronicsDAO.addElectronics((ElectronicsDTO)product);
		}
		else if (pnum / 1000 == 3) {
			return SeasonalityDAO.addSeasonality((SeasonalityDTO)product);
		}
		else if (pnum / 1000 == 4){
			return DecorationDAO.addDecoration((DecorationDTO)product);
		}
		else {
			return false;	// 찾으시는 값이 없습니다 로 반환하는 메소드
		}	
	}

	
	public static boolean updateProduct(int pnum, String major) throws SQLException{
		if (pnum / 1000 == 1) {
			return FurnitureDAO.updateFurniture(pnum,major);
		}
		else if (pnum / 1000 == 2) {
			return ElectronicsDAO.updateElectronics(pnum,major);
		}
		else if (pnum / 1000 == 3) {
			return SeasonalityDAO.updateSeasonality(pnum,major);
		}
		else if (pnum / 1000 == 4){
			return DecorationDAO.updateDecoration(pnum,major);
		}
		else {
			return false;	// 찾으시는 값이 없습니다 로 반환하는 메소드
		}	
	}


	public static boolean deleteProduct(int pnum) throws SQLException{
		if (pnum / 1000 == 1) {
			return FurnitureDAO.deleteFurniture(pnum);
		}
		else if (pnum / 1000 == 2) {
			return ElectronicsDAO.deleteElectronics(pnum);
		}
		else if (pnum / 1000 == 3) {
			return SeasonalityDAO.deleteSeasonality(pnum);
		}
		else if (pnum / 1000 == 4) {
			return DecorationDAO.deleteDecoration(pnum);
		}
		else {
			return false;	// 찾으시는 값이 없습니다 로 반환하는 메소드
		}	
	}


	public static Object getProduct(int pnum) throws SQLException{
		if (pnum / 1000 == 1) {
			return FurnitureDAO.getFurniture(pnum);
		}
		else if (pnum / 1000 == 2) {
			return ElectronicsDAO.getElectronics(pnum);
		}
		else if (pnum / 1000 == 3) {
			return SeasonalityDAO.getSeasonality(pnum);
		}
		else if (pnum / 1000 == 4) {
			return DecorationDAO.getDecoration(pnum);
		}
		else {
			return null;	// 찾으시는 값이 없습니다 로 반환하는 메소드
		}	
	}
	
	public static Object getThatProduct(String category) throws SQLException{
		if (category == "Furniture" ) {
			return FurnitureDAO.getAllFurniture();
		
		} else if (category == "Electronics" ) {
			return ElectronicsDAO.getAllElectronics();
		
		} else if (category == "Seasonality" ) {
			return SeasonalityDAO.getAllSeasonality();
		
		} else if (category == "Decoration" ) {
			return DecorationDAO.getAllDecoration();
			
		} else {
			return null;	// 찾으시는 값이 없습니다 로 반환하는 메소드
		}
	}
	
	
	public static Object getAllProduct() throws SQLException{
		ArrayList a1 = new ArrayList();
		
		a1.addAll(FurnitureDAO.getAllFurniture());
		
		a1.addAll(ElectronicsDAO.getAllElectronics());
		
		a1.addAll(SeasonalityDAO.getAllSeasonality());
		
		a1.addAll(DecorationDAO.getAllDecoration());
		
		return a1;
		
	}
	
	
	
}
