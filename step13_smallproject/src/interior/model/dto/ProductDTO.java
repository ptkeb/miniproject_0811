package interior.model.dto;

public class ProductDTO {							// 다른 DTO를 상위 DTO에서 호출해서 처리.
	
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
		builder.append("1. 제품 종류 : ");
		builder.append(productPnum);
		builder.append("2. 제품 명 : ");
		builder.append(productPname);
		builder.append("3. 제품 가격  : ");
		builder.append(productPrice);
		builder.append("4. 제품 규격 : ");
		builder.append(productStandard);
		builder.append("5. 제품 색상  : ");
		builder.append(productColor);
		builder.append("6. 제품 우선순위 : ");
		builder.append(productPriority);
		return builder.toString();
	}
	
}
