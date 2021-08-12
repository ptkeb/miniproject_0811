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
		builder.append("1. 力前 辆幅 : ");
		builder.append(productPnum);
		builder.append("2. 力前 疙 : ");
		builder.append(productPname);
		builder.append("3. 力前 啊拜  : ");
		builder.append(productPrice);
		builder.append("4. 力前 祸惑  : ");
		builder.append(productColor);
		builder.append("5. 力前 快急鉴困 : ");
		builder.append(productPriority);
		return builder.toString();
	}
	
}
