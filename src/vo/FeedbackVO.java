package vo;

import java.io.Serializable;

public class FeedbackVO implements Serializable {
	private int feedbackId;
	private String feedbackTitle;
	private String feedbackDesc;

	private LoginVO feedbackTo;
	private LoginVO feedbackFrom;
	
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getFeedbackTitle() {
		return feedbackTitle;
	}
	public void setFeedbackTitle(String feedbackTitle) {
		this.feedbackTitle = feedbackTitle;
	}
	public String getFeedbackDesc() {
		return feedbackDesc;
	}
	public void setFeedbackDesc(String feedbackDesc) {
		this.feedbackDesc = feedbackDesc;
	}
	public LoginVO getFeedbackTo() {
		return feedbackTo;
	}
	public void setFeedbackTo(LoginVO feedbackTo) {
		this.feedbackTo = feedbackTo;
	}
	public LoginVO getFeedbackFrom() {
		return feedbackFrom;
	}
	public void setFeedbackFrom(LoginVO feedbackFrom) {
		this.feedbackFrom = feedbackFrom;
	}
	


}
