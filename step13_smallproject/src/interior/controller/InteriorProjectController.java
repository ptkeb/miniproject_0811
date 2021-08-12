package interior.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;

import interior.model.ProductDAO;
import interior.model.PurchaseListDAO;
import interior.model.WishlistDAO;
import interior.model.dto.ProductDTO;
import interior.model.dto.PurchaseListDTO;
import interior.model.dto.WishlistDTO;
import interior.view.EndView;


public class InteriorProjectController {
	
//��� ���׸��� ���� �˻� - select * from dept;
	public static ArrayList<ProductDTO> getAllInteriorProducts(){
		ArrayList<ProductDTO> allProduct = null;
		try{			
			allProduct = ProductDAO.getAllProduct();			
		}catch(SQLException s){
			s.printStackTrace();
			EndView.showError("��� ������Ʈ �˻��� ���� �߻�");
		}
		return allProduct;
	}
	
	public static ArrayList<ProductDTO> getOneProduct(int pnum) {
		ArrayList<ProductDTO> product = null;
		try {
			product = (ArrayList<ProductDTO>) ProductDAO.getProduct(pnum);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�߸��� �����Դϴ�.");
			return null;
		}
		return product;
	}

	public static Object getThatProduct(String string) {
		ArrayList<ProductDTO> product = null;
		try {
			product = ProductDAO.getThatProduct(string);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}

	public static boolean updateProduct(int pnum, String major) {
		try {
			if(ProductDAO.updateProduct(pnum, major) == true) {
				System.out.println("���� ����");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static WishlistDTO choosePurchase(int pnum) {
		WishlistDTO product = null;
		try {
			product = WishlistDAO.getWishlist(pnum);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static PurchaseListDTO choosePurchased(int pnum) {
		PurchaseListDTO product = null;
		try {
			product = PurchaseListDAO.getPurchaseList(pnum);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void confirmPurchased() {
		System.out.println("==========yes or no==========");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(in.readLine());
			if (st.nextToken() == "yes") {
				purchaseAllWishlist();
			}else if (st.nextToken() == "no") {
				System.out.println("�������� �ʽ��ϴ�");
			}else {
				System.out.println("yes�� no�� �Է����ּ���");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<ProductDTO> purchaseAllWishlist() {
		ArrayList<WishlistDTO> product = null;
		try {
			product = WishlistDAO.getAllWishlist();
			if (product != null) {
				for (WishlistDTO el : product) {
					PurchaseListDAO.addPurchaseList(el);
				}
			}
		} catch (SQLException e) {
					e.printStackTrace();
		}
		return null;
	}

	public static boolean deleteWishlist(int pnum) {
		WishlistDTO product = null;
			try {
				WishlistDAO.deleteWishlist(pnum);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return false;
	}

	public static ArrayList<ProductDTO> callPurchasedList() {
		ArrayList<ProductDTO> product = null;
			try {
				WishlistDAO.getAllWishlist();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
}
