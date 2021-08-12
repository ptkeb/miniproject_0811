package interior.model.dto;

public class ElectronicsDTO {
	private int pnum;
	private String electronicsPname;
	private int electronicsPrice;
	private String electronicsStandard;
	private String electronicsColor;
	private int electronicsPriority;
	
	public ElectronicsDTO() {}

	public ElectronicsDTO(int pnum, String electronicsPname, int electronicsPrice, String electronicsStandard,
			String electronicsColor, int electronicsPriority) {
		super();
		this.pnum = pnum;
		this.electronicsPname = electronicsPname;
		this.electronicsPrice = electronicsPrice;
		this.electronicsStandard = electronicsStandard;
		this.electronicsColor = electronicsColor;
		this.electronicsPriority = electronicsPriority;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	public String getElectronicsPname() {
		return electronicsPname;
	}

	public void setElectronicsPname(String electronicsPname) {
		this.electronicsPname = electronicsPname;
	}

	public int getElectronicsPrice() {
		return electronicsPrice;
	}

	public void setElectronicsPrice(int electronicsPrice) {
		this.electronicsPrice = electronicsPrice;
	}

	public String getElectronicsStandard() {
		return electronicsStandard;
	}

	public void setElectronicsStandard(String electronicsStandard) {
		this.electronicsStandard = electronicsStandard;
	}

	public String getElectronicsColor() {
		return electronicsColor;
	}

	public void setElectronicsColor(String electronicsColor) {
		this.electronicsColor = electronicsColor;
	}

	public int getElectronicsPriority() {
		return electronicsPriority;
	}

	public void setElectronicsPriority(int electronicsPriority) {
		this.electronicsPriority = electronicsPriority;
	}

	@Override
	public String toString() {
		return "ElectronicsDTO [pnum=" + pnum + ", electronicsPname=" + electronicsPname + ", electronicsPrice="
				+ electronicsPrice + ", electronicsStandard=" + electronicsStandard + ", electronicsColor="
				+ electronicsColor + ", electronicsPriority=" + electronicsPriority + "]";
	}
	
	

}
