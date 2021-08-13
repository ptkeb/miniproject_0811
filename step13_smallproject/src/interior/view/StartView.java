package interior.view;

import java.sql.SQLException;
import java.util.ArrayList;

import interior.controller.InteriorProjectController;
import interior.model.ProductDAO;
import interior.model.dto.FurnitureDTO;
import interior.model.dto.ProductDTO;
import interior.model.dto.PurchaseListDTO;
import interior.model.dto.WishlistDTO;
import interior.view.EndView;

public class StartView {

	public static void main(String[] args) {
		System.out.println("***** ��� ��ǰ �˻� *****"); //1
		ArrayList<ProductDTO> allInteriorProduct = InteriorProjectController.getAllInteriorProducts();
		System.out.println(allInteriorProduct); // ���پ� ���?
		
		
//		System.out.println("*****��ǰ �� �� �˻� *****"); //2
//		ArrayList<ProductDTO> productOne = InteriorProjectController.getOneProduct(4031); // �������ϱ� ���߿�.
//		System.out.println(productOne); // cast error
//
		System.out.println("******��ǰ�˻� (ī�װ� ��)*******"); //3
		Object productByCategory = InteriorProjectController.getThatProduct("Electronics");
		System.out.println(productByCategory);
	
		
		System.out.println("*******��ǰ���� ���� �� �˻�******"); // 3.5
		boolean updateProduct = InteriorProjectController.updateProduct(1011,"å���׽�Ʈ");
		System.out.println(updateProduct);
		Object productByCategory1 = InteriorProjectController.getThatProduct("Furniture");
		System.out.println(productByCategory1);
//		//+ ��ǰ �ϳ� �˻� 1011��
		
//		System.out.println("*******��ٱ��� ��ǰ �߰�******");
//		WishlistDTO Wishlist = InteriorProjectController.addWishlist(1011);
		
//		
//		System.out.println("*******��ǰ �˻�(��ٱ���)******"); //4 
//		WishlistDTO purchaseList = InteriorProjectController.chooseWishlist(1011);
//		System.out.println(purchaseList);
		
//		
//		
//		System.out.println("******��ǰ �˻�(���� ����Ʈ)****"); // 5
//		PurchaseListDTO choosePurchased = InteriorProjectController.choosePurchased(1011);
//		
//		System.out.println("��ٱ��� ��ǰ ����");
//		ArrayList<ProductDTO> choosePurchased1 = InteriorProjectController.purchaseAllWishlist();
//		
//		System.out.println("******���� Ȯ��*********");  //6
//		boolean confirmPurchased2 = (boolean) InteriorProjectController.confirmPurchased();
//		
//		System.out.println("****��ٱ��� ����Ʈ �����*****");  // 7
//		boolean deletePurchaseList = InteriorProjectController.deleteWishlist(1011);
//		
//		System.out.println("*******���� ����Ʈ ȣ��*******");  // 8
//		ArrayList<ProductDTO> callPurchasedList = InteriorProjectController.callPurchasedList();
//		
//		System.out.println("*******��ü �α� ȣ��*******");   //9
//		ArrayList<Product> callAllLogs = InteriorProjectController.callAllLogs("")  // ���߿� �α����� ������ ����
		
//		ArrayList<ProductDTO> a1 = ProductDAO.PackDTO((ArrayList) InteriorProjectController.getThatProduct("Furniture"));
//		System.out.println(InteriorProjectController.getThatProduct("Furniture"));
//		System.out.println(a1);
		
	}

}