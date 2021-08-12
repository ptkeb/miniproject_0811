package interior.model.dto;

public class WishlistDTO {
	private int pnum;
	
	private int price;
	
	public WishlistDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WishlistDTO(int pnum, int price) {
		super();
		this.pnum = pnum;
		this.price = price;
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

	@Override
	public String toString() {
		return "WithlistDTO [pnum=" + pnum + ", price=" + price + "]";
	}
	
}
