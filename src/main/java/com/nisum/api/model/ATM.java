package com.nisum.api.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class ATM {
	private String bankId;
	private String id;
	@DBRef
	private Address address;
	private boolean isActive;
	private Date installedDate;
	private String installedBy;
	private Date changedDate;
	private Date changedBy;
	@DBRef
	private List<Notes> reasons;
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Date getInstalledDate() {
		return installedDate;
	}
	public void setInstalledDate(Date installedDate) {
		this.installedDate = installedDate;
	}
	public String getInstalledBy() {
		return installedBy;
	}
	public void setInstalledBy(String installedBy) {
		this.installedBy = installedBy;
	}
	public Date getChangedDate() {
		return changedDate;
	}
	public void setChangedDate(Date changedDate) {
		this.changedDate = changedDate;
	}
	public Date getChangedBy() {
		return changedBy;
	}
	public void setChangedBy(Date changedBy) {
		this.changedBy = changedBy;
	}
	public List<Notes> getReasons() {
		return reasons;
	}
	public void setReasons(List<Notes> reasons) {
		this.reasons = reasons;
	}
	
	
}
