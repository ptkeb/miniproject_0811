package interior.view;

import java.util.ArrayList;

import interior.controller.InteriorProjectController;
import interior.model.dto.ProductDTO;
import interior.view.EndView;

public class StartView {

	public static void main(String[] args) {
		System.out.println("***** 모든 가구 검색 *****");
		ArrayList<ProductDTO> allProbonoProject = InteriorProjectController.getAllInteriorProjects();
		EndView.interiorListView(allProbonoProject);

	}

}
