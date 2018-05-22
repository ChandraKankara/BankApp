package com.nisum.api.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class Bank {
	@Id
	private String id;
	private String name;
	private String bankType;
	private String desc;
	private String licenceNumeber;
	
	private List<Branch> branches;
	private List<ATM> atm;
	//private Address address;
	private boolean isActive;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private Date updatedby;
	
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
	
	public List<ATM> getAtm() {
		return atm;
	}
	public void setAtm(List<ATM> atm) {
		this.atm = atm;
	}
	/*public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
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
	/*public Bank(String id, String name, String bankType, String desc, String licenceNumeber, List<Branch> branches,
			Address address, boolean isActive, Date createdDate, String createdBy, Date updatedDate, Date updatedby,
			List<Notes> reasons) {
		super();
		this.id = id;
		this.name = name;
		this.bankType = bankType;
		this.desc = desc;
		this.licenceNumeber = licenceNumeber;
		this.branches = branches;
		this.address = address;
		this.isActive = isActive;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedby = updatedby;
		this.reasons = reasons;
	}
	
	 @Override
	    public String toString() {
	    	ObjectMapper mapper = new ObjectMapper();
	    	
	    	String jsonString = "";
			try {
				mapper.enable(SerializationFeature.INDENT_OUTPUT);
				jsonString = mapper.writeValueAsString(this);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			
	    	return jsonString;
	    }*/

	
}
