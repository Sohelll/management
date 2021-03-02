package com.riskmanagement.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CreditApplication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long applicationId;
	
	private double amount;
	private double turnover;
	private int tenure;
	private boolean status;
	
	@Temporal(TemporalType.DATE)
    private Date applicationDate;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="borrowerId")
	private Borrower borrower;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="faId")
	private FinancialAnalyst financialAnalyst;
	
	@OneToMany(mappedBy = "application")
	private Set<Assets> assets;

	public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public Borrower getBorrower() {
		return borrower;
	}

	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}

	public FinancialAnalyst getFinancialAnalyst() {
		return financialAnalyst;
	}

	public void setFinancialAnalyst(FinancialAnalyst financialAnalyst) {
		this.financialAnalyst = financialAnalyst;
	}

	public Set<Assets> getAssets() {
		return assets;
	}

	public void setAssets(Set<Assets> assets) {
		this.assets = assets;
	}

	public CreditApplication(long applicationId, double amount, double turnover, int tenure, boolean status,
			Date applicationDate, Borrower borrower, FinancialAnalyst financialAnalyst, Set<Assets> assets) {
		super();
		this.applicationId = applicationId;
		this.amount = amount;
		this.turnover = turnover;
		this.tenure = tenure;
		this.status = status;
		this.applicationDate = applicationDate;
		this.borrower = borrower;
		this.financialAnalyst = financialAnalyst;
		this.assets = assets;
	}

	public CreditApplication() {
		super();
	}
	
	

}
