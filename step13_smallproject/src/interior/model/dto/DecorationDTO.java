package interior.model.dto;

public class DecorationDTO {
	private int pnum;
	private String decorationPname;
	private int decorationPrice;
	private String decorationStandard;
	private String decorationColor;
	private int decorationPriority;
	
	public DecorationDTO() {}

	public DecorationDTO(int pnum, String decorationPname, int decorationPrice, String decorationStandard,
			String decorationColor, int decorationPriority) {
		super();
		this.pnum = pnum;
		this.decorationPname = decorationPname;
		this.decorationPrice = decorationPrice;
		this.decorationStandard = decorationStandard;
		this.decorationColor = decorationColor;
		this.decorationPriority = decorationPriority;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	public String getDecorationPname() {
		return decorationPname;
	}

	public void setDecorationPname(String decorationPname) {
		this.decorationPname = decorationPname;
	}

	public int getDecorationPrice() {
		return decorationPrice;
	}

	public void setDecorationPrice(int decorationPrice) {
		this.decorationPrice = decorationPrice;
	}

	public String getDecorationStandard() {
		return decorationStandard;
	}

	public void setDecorationStandard(String decorationStandard) {
		this.decorationStandard = decorationStandard;
	}

	public String getDecorationColor() {
		return decorationColor;
	}

	public void setDecorationColor(String decorationColor) {
		this.decorationColor = decorationColor;
	}

	public int getDecorationPriority() {
		return decorationPriority;
	}

	public void setDecorationPriority(int decorationPriority) {
		this.decorationPriority = decorationPriority;
	}

	@Override
	public String toString() {
		return "DecorationDTO [pnum=" + pnum + ", decorationPname=" + decorationPname + ", decorationPrice="
				+ decorationPrice + ", decorationStandard=" + decorationStandard + ", decorationColor="
				+ decorationColor + ", decorationPriority=" + decorationPriority + "]";
	}
	
	
	
	
	
}
