package interior.model.dto;

public class ProductDTO {
	private String pname;
	private int price;
	private String standard;
	private int priority;
	private String color;
	
	public ProductDTO()	{}

	public ProductDTO(String pname, int price, String standard, int priority, String color) {
		super();
		this.pname = pname;
		this.price = price;
		this.standard = standard;
		this.priority = priority;
		this.color = color;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "ProductDTO [pname=" + pname + ", price=" + price + ", standard=" + standard + ", priority=" + priority
				+ ", color=" + color + "]";
	}
	
}
