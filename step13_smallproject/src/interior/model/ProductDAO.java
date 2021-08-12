package interior.model;

import java.sql.SQLException;
import java.util.ArrayList;

import interior.model.dto.DecorationDTO;
import interior.model.dto.ElectronicsDTO;
import interior.model.dto.FurnitureDTO;
import interior.model.dto.SeasonalityDTO;

public class ProductDAO {
	public static boolean addProduct(int pnum, Object product) throws SQLException{
		if (pnum == 1) {
			return FurnitureDAO.addFurniture((FurnitureDTO)product);
		}
		else if (pnum == 2) {
			return ElectronicsDAO.addElectronics((ElectronicsDTO)product);
		}
		else if (pnum == 3) {
			return SeasonalityDAO.addSeasonality((SeasonalityDTO)product);
		}
		else {
			return DecorationDAO.addDecoration((DecorationDTO)product);
		}
	}

	
	public static boolean updateProduct(int pnum, Object product) throws SQLException{
		if (pnum == 1) {
			return FurnitureDAO.addFurniture((FurnitureDTO)product);
		}
		else if (pnum == 2) {
			return ElectronicsDAO.addElectronics((ElectronicsDTO)product);
		}
		else if (pnum == 3) {
			return SeasonalityDAO.addSeasonality((SeasonalityDTO)product);
		}
		else {
			return DecorationDAO.addDecoration((DecorationDTO)product);
		}
	}

	
	
	public static boolean deleteProduct(int pnum, Object product) throws SQLException{
		if (pnum == 1) {
			return FurnitureDAO.addFurniture((FurnitureDTO)product);
		}
		else if (pnum == 2) {
			return ElectronicsDAO.addElectronics((ElectronicsDTO)product);
		}
		else if (pnum == 3) {
			return SeasonalityDAO.addSeasonality((SeasonalityDTO)product);
		}
		else {
			return DecorationDAO.addDecoration((DecorationDTO)product);
		}
	}

	
	
	
	public static boolean getProduct(int pnum, Object product) throws SQLException{
		if (pnum == 1) {
			return FurnitureDAO.addFurniture((FurnitureDTO)product);
		}
		else if (pnum == 2) {
			return ElectronicsDAO.addElectronics((ElectronicsDTO)product);
		}
		else if (pnum == 3) {
			return SeasonalityDAO.addSeasonality((SeasonalityDTO)product);
		}
		else {
			return DecorationDAO.addDecoration((DecorationDTO)product);
		}
	}
	
	
	public static Object getAllProduct() throws SQLException{
		ArrayList<FurnitureDTO> A1 = new ArrayList<>();
		A1.addAll(FurnitureDAO.getAllFurniture());
		
		A1.addAll(ElectronicsDAO.getAllElectronics());
		
		A1.addAll(SeasonalityDAO.getAllSeasonality());
		
		A1.addAll(DecorationDAO.getAllDecoration());
		
		return A1;
		
	}
	
	
}
