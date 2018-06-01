package vo;

import java.net.URL;

public class FileUploadVO {
	private int video_id;
	private String video_name;
	private categoryvo cat_id;
	private subCategoryVO subcat_id;
	private String video_path;
	private LoginVO loginid;	
	
	public String getVideo_path() {
		return video_path;
	}
	public LoginVO getLoginid() {
		return loginid;
	}
	public void setLoginid(LoginVO loginid) {
		this.loginid = loginid;
	}
	public void setVideo_path(String video_path) {
		this.video_path = video_path;
	}

	
	public int getVideo_id() {
		return video_id;
	}
	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}
	public String getVideo_name() {
		return video_name;
	}
	public void setVideo_name(String video_name) {
		this.video_name = video_name;
	}
	public categoryvo getCat_id() {
		return cat_id;
	}
	public void setCat_id(categoryvo cat_id) {
		this.cat_id = cat_id;
	}
	public subCategoryVO getSubcat_id() {
		return subcat_id;
	}
	public void setSubcat_id(subCategoryVO subcat_id) {
		this.subcat_id = subcat_id;
	}
	
	
	
	
	
	

}
