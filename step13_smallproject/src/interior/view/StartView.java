package interior.view;

import java.util.ArrayList;

import interior.controller.InteriorProjectController;
import interior.model.ProductDAO;
import interior.model.dto.ProductDTO;
import interior.view.EndView;

public class StartView {

	public static void main(String[] args) {
		System.out.println("***** 모든 가구 검색 *****");
		ArrayList<ProductDTO> allProbonoProject = InteriorProjectController.getAllInteriorProjects();
		//EndView.interiorListView(allProbonoProject);
		System.out.println(allProbonoProject);
	
	
		System.out.println(ProductDAO.PackList(1091,"aa",2000,"bb",3));
	}
	
}


//1. 상품 목록 검색(전체) 

//2. 상품 검색(한개)
		
// 3. 상품검색(카테고리 별)
