package interior.model.dto;

public class ProductDTO {							// �ٸ� DTO�� ���� DTO���� ȣ���ؼ� ó��.
	
	private int productPnum;
	private String productPname;
	private int productPrice;
	private String productStandard;
	private String productColor;
	private int productPriority; 
//	private FurnitureDTO furniture;
//	private ElectronicsDTO electornics;
//	private SeasonalityDTO seasonality;
//	private DecorationDTO decoration;
	 
	
	public ProductDTO() {}
	
	public ProductDTO(int productPnum, String productPname, int productPrice, String productStandard,
			String productColor, int productPriority) {
		super();
		this.productPnum = productPnum;
		this.productPname = productPname;
		this.productPrice = productPrice;
		this.productStandard = productStandard;
		this.productColor = productColor;
		this.productPriority = productPriority;
	}

	public int getProductPnum() {
		return productPnum;
	}

	public void setProductPnum(int productPnum) {
		this.productPnum = productPnum;
	}

	public String getProductPname() {
		return productPname;
	}

	public void setProductPname(String productPname) {
		this.productPname = productPname;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductStandard() {
		return productStandard;
	}

	public void setProductStandard(String productStandard) {
		this.productStandard = productStandard;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public int getProductPriority() {
		return productPriority;
	}

	public void setProductPriority(int productPriority) {
		this.productPriority = productPriority;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. ��ǰ ���� : ");
		builder.append(productPnum);
		builder.append("2. ��ǰ �� : ");
		builder.append(productPname);
		builder.append("3. ��ǰ ����  : ");
		builder.append(productPrice);
		builder.append("4. ��ǰ �԰� : ");
		builder.append(productStandard);
		builder.append("5. ��ǰ ����  : ");
		builder.append(productColor);
		builder.append("6. ��ǰ �켱���� : ");
		builder.append(productPriority);
		return builder.toString();
	}
	
}
