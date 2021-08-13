package interior.view;
import java.util.ArrayList;
import interior.model.dto.ProductDTO;

public class EndView {
	//모든 프로젝트 출력 여러개 출력
	public static void interiorListView(ArrayList allinteriorProject){
		int length = allinteriorProject.size();
		if( length != 0 ){
			for(int index = 0; index < length; index++){			
				System.out.println("검색정보 " + (index+1) + " - " + allinteriorProject.get(index));
			}
		}
	}
	
	//특정 프로젝트 출력 한 개만 출력
	public static void projectView(Object project){
		System.out.println(project);		
	}
	
	//모든 DTO 정보 출력하는 메소드
	public static void allView(Object object){
		System.out.println(object);
	}
	
	//예외 상황 출력
	public static void showError(String message){
		System.out.println(message);		
	
	}

}
