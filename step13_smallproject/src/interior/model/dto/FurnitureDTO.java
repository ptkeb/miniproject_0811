package interior.model.dto;

public class FurnitureDTO {
	private int pnum;
	private String furniturePname;
	private int furniturePrice;
	private String furnitureStandard;
	private String furnitureColor;
	private int furniturePriority;
	
	public FurnitureDTO() {}
	
	public FurnitureDTO(int pnum, String furniturePname, int furniturePrice, String furnitureStandard,
			String furnitureColor, int furniturePriority) {
		super();
		this.pnum = pnum;
		this.furniturePname = furniturePname;
		this.furniturePrice = furniturePrice;
		this.furnitureStandard = furnitureStandard;
		this.furnitureColor = furnitureColor;
		this.furniturePriority = furniturePriority;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	public String getFurniturePname() {
		return furniturePname;
	}

	public void setFurniturePname(String furniturePname) {
		this.furniturePname = furniturePname;
	}

	public int getFurniturePrice() {
		return furniturePrice;
	}

	public void setFurniturePrice(int furniturePrice) {
		this.furniturePrice = furniturePrice;
	}

	public String getFurnitureStandard() {
		return furnitureStandard;
	}

	public void setFurnitureStandard(String furnitureStandard) {
		this.furnitureStandard = furnitureStandard;
	}

	public String getFurnitureColor() {
		return furnitureColor;
	}

	public void setFurnitureColor(String furnitureColor) {
		this.furnitureColor = furnitureColor;
	}

	public int getFurniturePriority() {
		return furniturePriority;
	}

	public void setFurniturePriority(int furniturePriority) {
		this.furniturePriority = furniturePriority;
	}



	@Override
	public String toString() {
		return "FurnitureDTO [pnum=" + pnum + ", furniturePname=" + furniturePname + ", furniturePrice="
				+ furniturePrice + ", furnitureStandard=" + furnitureStandard + ", furnitureColor=" + furnitureColor
				+ ", furniturePriority=" + furniturePriority + "]";
	}
	
	
	
	
	
}
