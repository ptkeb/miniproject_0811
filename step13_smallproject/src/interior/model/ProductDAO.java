package interior.model;

import java.sql.SQLException;
import java.util.ArrayList;

import interior.model.dto.DecorationDTO;
import interior.model.dto.ElectronicsDTO;
import interior.model.dto.FurnitureDTO;
import interior.model.dto.SeasonalityDTO;

public class ProductDAO {
	public static boolean addProduct(int pnum, Object product) throws SQLException{
		pnum = pnum % 1000;
		if (pnum == 1) {
			return FurnitureDAO.addFurniture((FurnitureDTO)product);
		}
		else if (pnum == 2) {
			return ElectronicsDAO.addElectronics((ElectronicsDTO)product);
		}
		else if (pnum == 3) {
			return SeasonalityDAO.addSeasonality((SeasonalityDTO)product);
		}
		else if (pnum == 4){
			return DecorationDAO.addDecoration((DecorationDTO)product);
		}
		else {
			return false;
		}	
	}

	
	public static boolean updateProduct(int pnum, String major) throws SQLException{
		pnum = pnum % 1000;
		if (pnum == 1) {
			return FurnitureDAO.updateFurniture(pnum,major);
		}
		else if (pnum == 2) {
			return ElectronicsDAO.updateElectronics(pnum,major);
		}
		else if (pnum == 3) {
			return SeasonalityDAO.updateSeasonality(pnum,major);
		}
		else if (pnum == 4){
			return DecorationDAO.updateDecoration(pnum,major);
		}
		else {
			return false;
		}	
	}


	
	
	public static boolean deleteProduct(int pnum) throws SQLException{
		pnum = pnum % 1000;
		if (pnum == 1) {
			return FurnitureDAO.deleteFurniture(pnum);
		}
		else if (pnum == 2) {
			return ElectronicsDAO.deleteElectronics(pnum);
		}
		else if (pnum == 3) {
			return SeasonalityDAO.deleteSeasonality(pnum);
		}
		else if (pnum == 4) {
			return DecorationDAO.deleteDecoration(pnum);
		}
		else {
			return false;
		}	
	}


	
	
	
	public static Object getProduct(int pnum) throws SQLException{
		pnum = pnum % 1000;
		if (pnum == 1) {
			return FurnitureDAO.getFurniture(pnum);
		}
		else if (pnum == 2) {
			return ElectronicsDAO.getElectronics(pnum);
		}
		else if (pnum == 3) {
			return SeasonalityDAO.getSeasonality(pnum);
		}
		else if (pnum == 4) {
			return DecorationDAO.getDecoration(pnum);
		}
		else {
			return null;
		}	
	}
	
	
	
//	public static Object getAllProduct() throws SQLException{
//		ArrayList<FurnitureDTO> A1 = new ArrayList<>();
//		A1.addAll(FurnitureDAO.getAllFurniture());
//		
//		A1.addAll(ElectronicsDAO.getAllElectronics());
//		
//		A1.addAll(SeasonalityDAO.getAllSeasonality());
//		
//		A1.addAll(DecorationDAO.getAllDecoration());
//		
//		return A1;
//		
//	}
//	
//	
}
