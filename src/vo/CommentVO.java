package vo;

import java.io.Serializable;



public class CommentVO implements Serializable {
    
	private int comment_id;
    private String email_id;
    private String user_name;
   
	private FileUploadVO video_id;
	private String comment_desc;
	
    public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}
	 public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public FileUploadVO getVideo_id() {
		return video_id;
	}
	public void setVideo_id(FileUploadVO video_id) {
		this.video_id = video_id;
	}
	public String getComment_desc() {
		return comment_desc;
	}
	public void setComment_desc(String comment_desc) {
		this.comment_desc = comment_desc;
	}
	
}
