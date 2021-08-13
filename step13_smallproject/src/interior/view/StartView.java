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
		System.out.println("***** 모든 제품 검색 *****"); //1
		ArrayList<ProductDTO> allInteriorProduct = InteriorProjectController.getAllInteriorProducts();
		System.out.println(allInteriorProduct); // 한줄씩 출력?
		
		
//		System.out.println("*****상품 한 개 검색 *****"); //2
//		ArrayList<ProductDTO> productOne = InteriorProjectController.getOneProduct(4031); // 에러나니깐 나중에.
//		System.out.println(productOne); // cast error
//
		System.out.println("******상품검색 (카테고리 별)*******"); //3
		Object productByCategory = InteriorProjectController.getThatProduct("Electronics");
		System.out.println(productByCategory);
	
		
		System.out.println("*******상품정보 수정 후 검색******"); // 3.5
		boolean updateProduct = InteriorProjectController.updateProduct(1011,"책상테스트");
		System.out.println(updateProduct);
		Object productByCategory1 = InteriorProjectController.getThatProduct("Furniture");
		System.out.println(productByCategory1);
//		//+ 상품 하나 검색 1011번
		
//		System.out.println("*******장바구니 상품 추가******");
//		WishlistDTO Wishlist = InteriorProjectController.addWishlist(1011);
		
//		
//		System.out.println("*******상품 검색(장바구니)******"); //4 
//		WishlistDTO purchaseList = InteriorProjectController.chooseWishlist(1011);
//		System.out.println(purchaseList);
		
//		
//		
//		System.out.println("******상품 검색(구매 리스트)****"); // 5
//		PurchaseListDTO choosePurchased = InteriorProjectController.choosePurchased(1011);
//		
//		System.out.println("장바구니 물품 구매");
//		ArrayList<ProductDTO> choosePurchased1 = InteriorProjectController.purchaseAllWishlist();
//		
//		System.out.println("******구매 확인*********");  //6
//		boolean confirmPurchased2 = (boolean) InteriorProjectController.confirmPurchased();
//		
//		System.out.println("****장바구니 리스트 지우기*****");  // 7
//		boolean deletePurchaseList = InteriorProjectController.deleteWishlist(1011);
//		
//		System.out.println("*******구매 리스트 호출*******");  // 8
//		ArrayList<ProductDTO> callPurchasedList = InteriorProjectController.callPurchasedList();
//		
//		System.out.println("*******전체 로그 호출*******");   //9
//		ArrayList<Product> callAllLogs = InteriorProjectController.callAllLogs("")  // 나중에 로그파일 통합후 진행
		
//		ArrayList<ProductDTO> a1 = ProductDAO.PackDTO((ArrayList) InteriorProjectController.getThatProduct("Furniture"));
//		System.out.println(InteriorProjectController.getThatProduct("Furniture"));
//		System.out.println(a1);
		
	}

}