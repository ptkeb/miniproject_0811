package interior.model.dto;

public class WishlistDTO {
	private int pnum;
	
	private int price;
	
	private String name;
	
	public WishlistDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WishlistDTO(int pnum, int price, String name) {
		super();
		this.pnum = pnum;
		this.price = price;
		this.name = name;
	}
	
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "WithlistDTO [pnum=" + pnum + ", price=" + price + ", name=" + name +" ]";
	}
	
}

