package vo;

public class StateVO {
	private int state_id;
		
	private String state_name;
	private String state_desc;
	private CountryVO countryvo;
	
	public CountryVO getCountryvo() {
		return countryvo;
	}
	public void setCountryvo(CountryVO countryvo) {
		this.countryvo = countryvo;
	}
	public int getState_id() {
		return state_id;
	}
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getState_desc() {
		return state_desc;
	}
	public void setState_desc(String state_desc) {
		this.state_desc = state_desc;
	}
	

}
