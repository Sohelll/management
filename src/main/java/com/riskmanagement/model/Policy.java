package com.riskmanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Policy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long policyId;
	
	private String policyName;
	private boolean status;
	private String description;

	@Temporal(TemporalType.DATE)
    private Date creationDate;
	
	@Temporal(TemporalType.DATE)
    private Date lastModifiedDate;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="managerId")
	private Manager manager;

	public long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Policy(long policyId, String policyName, boolean status, String description, Date creationDate,
			Date lastModifiedDate, Manager manager) {
		this.policyId = policyId;
		this.policyName = policyName;
		this.status = status;
		this.description = description;
		this.creationDate = creationDate;
		this.lastModifiedDate = lastModifiedDate;
		this.manager = manager;
	}

	public Policy() {
	}
	
	
}
