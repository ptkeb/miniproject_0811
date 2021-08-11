package interior.model.dto;

public class ProductCategoryDTO {

	private String category;
	private String pname;
	
	public ProductCategoryDTO() {}
	
	public ProductCategoryDTO(String category, String pname) {
		super();
		this.category = category;
		this.pname = pname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public String toString() {
		return "ProductCategoryDTO [category=" + category + ", pname=" + pname + "]";
	}
	
}
