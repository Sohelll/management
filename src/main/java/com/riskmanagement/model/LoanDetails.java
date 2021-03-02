package com.riskmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class LoanDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loanId;
	
	private float rateOfInterest;
	private int noOfEMI;
	private double perEmiAmount;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="managerId")
	private Manager manager;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="borrowerId")
	private Borrower borrower;
	
	@OneToOne(optional = false)
	@JoinColumn(name="applicationId")
	private CreditApplication application;

	public long getLoanId() {
		return loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public int getNoOfEMI() {
		return noOfEMI;
	}

	public void setNoOfEMI(int noOfEMI) {
		this.noOfEMI = noOfEMI;
	}

	public double getPerEmiAmount() {
		return perEmiAmount;
	}

	public void setPerEmiAmount(double perEmiAmount) {
		this.perEmiAmount = perEmiAmount;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Borrower getBorrower() {
		return borrower;
	}

	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}

	public CreditApplication getApplication() {
		return application;
	}

	public void setApplication(CreditApplication application) {
		this.application = application;
	}

	
}
