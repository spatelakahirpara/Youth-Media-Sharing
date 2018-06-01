package vo;

import java.io.Serializable;

public class CityVO implements Serializable{
	private int city_id;
	
	private String city_name;
	private String city_desc;
	private StateVO statevo;
	private CountryVO countryvo;
	
	public StateVO getStatevo() {
		return statevo;
	}
	public void setStatevo(StateVO statevo) {
		this.statevo = statevo;
	}
	public CountryVO getCountryvo() {
		return countryvo;
	}
	public void setCountryvo(CountryVO countryvo) {
		this.countryvo = countryvo;
	}
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getCity_desc() {
		return city_desc;
	}
	public void setCity_desc(String city_desc) {
		this.city_desc = city_desc;
	}
	
}
