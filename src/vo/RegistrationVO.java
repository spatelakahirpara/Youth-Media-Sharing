package vo;

import java.io.Serializable;

public class RegistrationVO implements Serializable{

	private int reg_id;
	
	private String first_name;
	private String last_name;
	private String user_name;
	private String email;
	private String password;
	private String address;
	private CityVO cityvo;
	private StateVO statevo;
	private CountryVO countryvo;
	
	
	public int getReg_id() {
		return reg_id;
	}
	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}
	
		public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CityVO getCityvo() {
		return cityvo;
	}
	public void setCityvo(CityVO cityvo) {
		this.cityvo = cityvo;
	}
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
	
}
