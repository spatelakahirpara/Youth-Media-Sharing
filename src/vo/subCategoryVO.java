package vo;

import java.io.Serializable;

public class subCategoryVO implements Serializable{
	private int subcat_id;

	private String subcat_name;
	private String subcat_desc;
	private categoryvo categoryvo;
	
	public int getSubcat_id() {
		return subcat_id;
	}
	public void setSubcat_id(int subcat_id) {
		this.subcat_id = subcat_id;
	}
	public String getSubcat_name() {
		return subcat_name;
	}
	public void setSubcat_name(String subcat_name) {
		this.subcat_name = subcat_name;
	}
	public String getSubcat_desc() {
		return subcat_desc;
	}
	public void setSubcat_desc(String subcat_desc) {
		this.subcat_desc = subcat_desc;
	}
	public categoryvo getCategoryvo() {
		return categoryvo;
	}
	public void setCategoryvo(categoryvo categoryvo) {
		this.categoryvo = categoryvo;
	}
	
	
}
