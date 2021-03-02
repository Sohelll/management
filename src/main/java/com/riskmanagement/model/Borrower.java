package com.riskmanagement.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Borrower {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long borrowerId;
	
	private String companyName;
	private String panNumber;
	
	private String street;
	private String city;
	private String state;
	private String country;
	private int pinCode;
	
	@OneToOne(optional = false)
	@JoinColumn(name="userId")
	private User user;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="managerId")
	private Manager manager;
	
	@OneToMany(mappedBy = "borrower")
	private Set<LoanDetails> loanDetails;
	
	@OneToMany(mappedBy = "borrower")
	private Set<CreditApplication> creditApplication;

	public long getBorrowerId() {
		return borrowerId;
	}

	public void setBorrowerId(long borrowerId) {
		this.borrowerId = borrowerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Borrower(long borrowerId, String companyName, String panNumber,String street, String city, String state, String country,
			int pinCode, User user, Manager manager) {
		this.borrowerId = borrowerId;
		this.companyName = companyName;
		this.panNumber = panNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
		this.user = user;
		this.manager = manager;
	}

	public Borrower() {
	}

	@Override
	public String toString() {
		return "Borrower [borrowerId=" + borrowerId + ", companyName=" + companyName + ", panNumber=" + panNumber
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", pinCode=" + pinCode + ", user="
				+ user + ", manager=" + manager + "]";
	}
	

}
