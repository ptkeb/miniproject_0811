package interior.model.dto;

public class ProductDTO {
	private int productPnum;
	private String productPname;
	private int productPrice;
	private String productColor;
	private int productPriority; 
	
	

	public ProductDTO() {}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. ��ǰ ���� : ");
		builder.append(productPnum);
		builder.append("2. ��ǰ �� : ");
		builder.append(productPname);
		builder.append("3. ��ǰ ����  : ");
		builder.append(productPrice);
		builder.append("4. ��ǰ ����  : ");
		builder.append(productColor);
		builder.append("5. ��ǰ �켱���� : ");
		builder.append(productPriority);
		return builder.toString();
	}
	
}
