package interior.view;
import java.util.ArrayList;
import interior.model.dto.ProductDTO;

public class EndView {
	//��� ������Ʈ ��� ������ ���
	public static void interiorListView(ArrayList allinteriorProject){
		int length = allinteriorProject.size();
		if( length != 0 ){
			for(int index = 0; index < length; index++){			
				System.out.println("�˻����� " + (index+1) + " - " + allinteriorProject.get(index));
			}
		}
	}
	
	//Ư�� ������Ʈ ��� �� ���� ���
	public static void projectView(Object project){
		System.out.println(project);		
	}
	
	//��� DTO ���� ����ϴ� �޼ҵ�
	public static void allView(Object object){
		System.out.println(object);
	}
	
	//���� ��Ȳ ���
	public static void showError(String message){
		System.out.println(message);		
	
	}

}
