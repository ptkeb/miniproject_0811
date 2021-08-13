//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//
//DTO 타입별로 새로운 메소드를 만들어 각각의 DTO타입을 넣어주면 알아서 작동할수있게 구성
//각 메소드들을 전부 DTO별로 분리
//
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//
//

package interior.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import interior.model.dto.DecorationDTO;
import interior.model.dto.ElectronicsDTO;
import interior.model.dto.FurnitureDTO;
import interior.model.dto.ProductDTO;
import interior.model.dto.SeasonalityDTO;

public class ProductDAO {

	public static boolean addProduct(int pnum, Object product) throws SQLException {
		if (pnum / 1000 == 1) {
			return FurnitureDAO.addFurniture((FurnitureDTO) product);
		} else if (pnum / 1000 == 2) {
			return ElectronicsDAO.addElectronics((ElectronicsDTO) product);
		} else if (pnum / 1000 == 3) {
			return SeasonalityDAO.addSeasonality((SeasonalityDTO) product);
		} else if (pnum / 1000 == 4) {
			return DecorationDAO.addDecoration((DecorationDTO) product); // <<< arraylist<decoDTO>
		}

		else {
			return false; // 찾으시는 값이 없습니다 로 반환하는 메소드
		}
	}

	public static boolean updateProduct(int pnum, String major) throws SQLException {
		if (pnum / 1000 == 1) {
			return FurnitureDAO.updateFurniture(pnum, major);
		} else if (pnum / 1000 == 2) {
			return ElectronicsDAO.updateElectronics(pnum, major);
		} else if (pnum / 1000 == 3) {
			return SeasonalityDAO.updateSeasonality(pnum, major);
		} else if (pnum / 1000 == 4) {
			return DecorationDAO.updateDecoration(pnum, major);
		} else {
			return false; // 찾으시는 값이 없습니다 로 반환하는 메소드
		}
	}

	public static boolean deleteProduct(int pnum) throws SQLException {
		if (pnum / 1000 == 1) {
			return FurnitureDAO.deleteFurniture(pnum);
		} else if (pnum / 1000 == 2) {
			return ElectronicsDAO.deleteElectronics(pnum);
		} else if (pnum / 1000 == 3) {
			return SeasonalityDAO.deleteSeasonality(pnum);
		} else if (pnum / 1000 == 4) {
			return DecorationDAO.deleteDecoration(pnum);
		} else {
			return false; // 찾으시는 값이 없습니다 로 반환하는 메소드
		}
	}

	public static Object getProduct(int pnum) throws SQLException {
		if (pnum / 1000 == 1) {
			return FurnitureDAO.getFurniture(pnum);
		} else if (pnum / 1000 == 2) {
			return ElectronicsDAO.getElectronics(pnum);
		} else if (pnum / 1000 == 3) {
			return SeasonalityDAO.getSeasonality(pnum);
		} else if (pnum / 1000 == 4) {
			return DecorationDAO.getDecoration(pnum);
		} else {
			return null; // 찾으시는 값이 없습니다 로 반환하는 메소드
		}
	}

	public static ArrayList getThatProduct(String category) throws SQLException {
		if (category == "Furniture") {
			return (ArrayList) FurnitureDAO.getAllFurniture();

		} else if (category == "Electronics") {
			return (ArrayList) ElectronicsDAO.getAllElectronics();

		} else if (category == "Seasonality") {
			return (ArrayList) SeasonalityDAO.getAllSeasonality();

		} else if (category == "Decoration") {
			return (ArrayList) DecorationDAO.getAllDecoration();

		} else {
			return null; // 찾으시는 값이 없습니다 로 반환하는 메소드
		}
	}

	public static ArrayList getAllProduct() throws SQLException {
		ArrayList a1 = new ArrayList();

		a1.addAll(FurnitureDAO.getAllFurniture());

		a1.addAll(ElectronicsDAO.getAllElectronics());

		a1.addAll(SeasonalityDAO.getAllSeasonality());

		a1.addAll(DecorationDAO.getAllDecoration());

		return a1;

	}

	public static ArrayList<ProductDTO> PackList(int pnum, String pname, int price, String standard, String color,
			int priority) {
		ArrayList<ProductDTO> b1 = new ArrayList<ProductDTO>();
		ProductDTO b2 = new ProductDTO(pnum, pname, price, standard, color, priority);
		b1.add(b2);

		return b1;
	}

	public static ArrayList<ProductDTO> PackDTO(ArrayList array) {
		int sizea = array.size();
		Iterator<?> a1 = array.iterator();
//			while (sizea == 0) {
		ProductDTO a2 = (ProductDTO) a1.next();
//				PackList(a2.getProductPnum(),a2.getProductPname(),a2.getProductPrice(),a2.getProductStandard(),a2.getProductColor(),a2.getProductPriority());
//				sizea= sizea-1;
//			}
		return PackList(a2.getProductPnum(), a2.getProductPname(), a2.getProductPrice(), a2.getProductStandard(),
				a2.getProductColor(), a2.getProductPriority());
	}

}
