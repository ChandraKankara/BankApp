package com.nisum.api.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Bank {
	private String id;
	private String name;
	private String bankType;
	private String desc;
	private String licenceNumeber;
	@DBRef
	private List<Branch> branches;
	@DBRef
	private Address address;
	private boolean isActive;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private Date updatedby;
	@DBRef
	private List<Notes> reasons;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getLicenceNumeber() {
		return licenceNumeber;
	}
	public void setLicenceNumeber(String licenceNumeber) {
		this.licenceNumeber = licenceNumeber;
	}
	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
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
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Date getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(Date updatedby) {
		this.updatedby = updatedby;
	}
	public List<Notes> getReasons() {
		return reasons;
	}
	public void setReasons(List<Notes> reasons) {
		this.reasons = reasons;
	}
	
	
	
}
