package interior.model.dto;

public class PurchaseListDTO {
	private int pnum;
	private String pname;
	private int price;
	
	public PurchaseListDTO() {}
	
	public PurchaseListDTO(int pnum, String pname, int price) {
		super();
		this.pnum = pnum;
		this.pname = pname;
		this.price = price;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
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

	@Override
	public String toString() {
		return "PurchaseList [pnum=" + pnum + ", pname=" + pname + ", price=" + price + "]";
	}
	
}
