package vo;

import java.sql.Time;
import java.util.Date;

public class ComplainVO {
	private int complainId;
	private String complainName;
	private String complainDescription;
	private String replaycomplainDescription;
	
	private Date complainDate;
	private Time complainTime;
	private String status;
	private LoginVO complainTo;
	private LoginVO complainFrom;
	


	
	public int getComplainId() {
		return complainId;
	}
	public void setComplainId(int complainId) {
		this.complainId = complainId;
	}
	public String getComplainName() {
		return complainName;
	}
	public void setComplainName(String complainName) {
		this.complainName = complainName;
	}
	public String getComplainDescription() {
		return complainDescription;
	}
	public void setComplainDescription(String complainDescription) {
		this.complainDescription = complainDescription;
	}
	public String getReplaycomplainDescription() {
		return replaycomplainDescription;
	}
	public void setReplaycomplainDescription(String replaycomplainDescription) {
		this.replaycomplainDescription = replaycomplainDescription;
	}
	public Date getComplainDate() {
		return complainDate;
	}
	public void setComplainDate(Date complainDate) {
		this.complainDate = complainDate;
	}
	public Time getComplainTime() {
		return complainTime;
	}
	public void setComplainTime(Time complainTime) {
		this.complainTime = complainTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LoginVO getComplainTo() {
		return complainTo;
	}
	public void setComplainTo(LoginVO complainTo) {
		this.complainTo = complainTo;
	}
	public LoginVO getComplainFrom() {
		return complainFrom;
	}
	public void setComplainFrom(LoginVO complainFrom) {
		this.complainFrom = complainFrom;
	}
		
	
}
