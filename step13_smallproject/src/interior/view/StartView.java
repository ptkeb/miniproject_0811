package interior.view;

import java.util.ArrayList;

import interior.controller.InteriorProjectController;
import interior.model.ProductDAO;
import interior.model.dto.ProductDTO;
import interior.view.EndView;

public class StartView {

	public static void main(String[] args) {
		System.out.println("***** ��� ���� �˻� *****");
		ArrayList<ProductDTO> allProbonoProject = InteriorProjectController.getAllInteriorProjects();
		//EndView.interiorListView(allProbonoProject);
		System.out.println(allProbonoProject);
	
	
		System.out.println(ProductDAO.PackList(1091,"aa",2000,"bb",3));
	}
	
}


//1. ��ǰ ��� �˻�(��ü) 

//2. ��ǰ �˻�(�Ѱ�)
		
// 3. ��ǰ�˻�(ī�װ� ��)
