package interior.view;

import java.util.ArrayList;

import interior.controller.InteriorProjectController;
import interior.model.dto.ProductDTO;
import interior.view.EndView;

public class StartView {

	public static void main(String[] args) {
		System.out.println("***** 모든 제품 검색 *****"); //1
		ArrayList<ProductDTO> allInteriorProduct = InteriorProjectController.getAllInteriorProducts();
		System.out.println(allInteriorProduct);
		
		
		System.out.println("*****상품 한 개 검색 *****"); //2
		ProductDTO productOne = InteriorProjectController.getOneProduct(4031);
		System.out.println(productOne);
		
		System.out.println("******상품검색 (카테고리 별)*******"); //3
		Object productByCategory = InteriorProjectController.getThatProduct("Electronics");

		
		System.out.println("*******상품정보 수정 후 검색******"); // 3.5
		boolean updateProduct = InteriorProjectController.updateProduct("");
		
		System.out.println("*******상품 선택 (장바구니)******"); //4 
		ArrayList<ProductDTO> purchaseList = InteriorProjectController.choosePurchase("");
		
		
		System.out.println("******상품 선택 (바로 구매)****"); // 5
		ArrayList<ProductDTO> choosePurchased = InteriorProjectController.choosePurchased("");
		
		System.out.println("장바구니 물품 구매");
		ArrayList<ProductDTO> choosePurchased = InteriorProjectController.purchaseWishlist("");
		
		System.out.println("******구매 확인*********");  //6
		ArrayList<ProductDTO> confirmPurchased = InteriorProjectController.confirmPurchased("");
		
		System.out.println("****장바구니 리스트 지우기*****");  // 7
		boolean deletePurchaseList = InteriorProjectController.deletePurchaseList("");
		
		System.out.println("*******구매 리스트 호출*******");  // 8
		ArrayList<ProductDTO> callPurchasedList = InteriorProjectController.callPurchasedList("");
		
		System.out.println("*******전체 로그 호출*******");   //9
//		ArrayList<Product> callAllLogs = InteriorProjectController.callAllLogs("")
		
	}

}
