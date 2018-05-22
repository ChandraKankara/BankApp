package com.nisum.api.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

public class Notes {
	private int id;
	private String reason;
	private Date commentedDate;
	private String commentedBy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getCommentedDate() {
		return commentedDate;
	}
	public void setCommentedDate(Date commentedDate) {
		this.commentedDate = commentedDate;
	}
	public String getCommentedBy() {
		return commentedBy;
	}
	public void setCommentedBy(String commentedBy) {
		this.commentedBy = commentedBy;
	}
	/*public Notes(int id, String reason, Date commentedDate, String commentedBy) {
		super();
		this.id = id;
		this.reason = reason;
		this.commentedDate = commentedDate;
		this.commentedBy = commentedBy;
	}*/
	
}
