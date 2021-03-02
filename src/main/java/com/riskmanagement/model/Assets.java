package com.riskmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Assets {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long assetId;
	
	private String type;
	private double value;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="applicationId")
	private CreditApplication application;

	public long getAssetId() {
		return assetId;
	}

	public void setAssetId(long assetId) {
		this.assetId = assetId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public CreditApplication getApplication() {
		return application;
	}

	public void setApplication(CreditApplication application) {
		this.application = application;
	}

	public Assets(long assetId, String type, double value, CreditApplication application) {
		super();
		this.assetId = assetId;
		this.type = type;
		this.value = value;
		this.application = application;
	}

	public Assets() {
		super();
	}
	
	

}
