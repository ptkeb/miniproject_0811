package interior.model.dto;

public class SeasonalityDTO {
	private int pnum;
	private String seasonalityPname;
	private int seasonalityPrice;
	private String seasonalityStandard;
	private String seasonalityColor;
	private int seasonalityPriority;
	
	
	public SeasonalityDTO() {}


	public SeasonalityDTO(int pnum, String seasonalityPname, int seasonalityPrice, String seasonalityStandard,
			String seasonalityColor, int seasonalityPriority) {
		super();
		this.pnum = pnum;
		this.seasonalityPname = seasonalityPname;
		this.seasonalityPrice = seasonalityPrice;
		this.seasonalityStandard = seasonalityStandard;
		this.seasonalityColor = seasonalityColor;
		this.seasonalityPriority = seasonalityPriority;
	}


	public int getPnum() {
		return pnum;
	}


	public void setPnum(int pnum) {
		this.pnum = pnum;
	}


	public String getSeasonalityPname() {
		return seasonalityPname;
	}


	public void setSeasonalityPname(String seasonalityPname) {
		this.seasonalityPname = seasonalityPname;
	}


	public int getSeasonalityPrice() {
		return seasonalityPrice;
	}


	public void setSeasonalityPrice(int seasonalityPrice) {
		this.seasonalityPrice = seasonalityPrice;
	}


	public String getSeasonalityStandard() {
		return seasonalityStandard;
	}


	public void setSeasonalityStandard(String seasonalityStandard) {
		this.seasonalityStandard = seasonalityStandard;
	}


	public String getSeasonalityColor() {
		return seasonalityColor;
	}


	public void setSeasonalityColor(String seasonalityColor) {
		this.seasonalityColor = seasonalityColor;
	}


	public int getSeasonalityPriority() {
		return seasonalityPriority;
	}


	public void setSeasonalityPriority(int seasonalityPriority) {
		this.seasonalityPriority = seasonalityPriority;
	}


	@Override
	public String toString() {
		return "SeasonalityDTO [pnum=" + pnum + ", seasonalityPname=" + seasonalityPname + ", seasonalityPrice="
				+ seasonalityPrice + ", seasonalityStandard=" + seasonalityStandard + ", seasonalityColor="
				+ seasonalityColor + ", seasonalityPriority=" + seasonalityPriority + "]";
	}
	
	
	
	
	

}
