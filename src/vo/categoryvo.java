package vo;

import java.io.Serializable;

public class categoryvo implements Serializable{

	private int cat_id;
	private String cat_name;
	private String cat_region;
	private String cat_desc;
	
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public String getCat_region() {
		return cat_region;
	}
	public void setCat_region(String cat_region) {
		this.cat_region = cat_region;
	}
	public String getCat_desc() {
		return cat_desc;
	}
	public void setCat_desc(String cat_desc) {
		this.cat_desc = cat_desc;
	}
	

}
