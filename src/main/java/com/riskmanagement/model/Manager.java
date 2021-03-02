package com.riskmanagement.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Manager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long managerId;
	
	@OneToOne(optional = false)
	@JoinColumn(name="userId")
	private User user;
	
	@OneToMany(mappedBy = "manager")
	private Set<Borrower> borrowers;
	
	@OneToMany(mappedBy = "manager")
	private Set<FinancialAnalyst> financialAnalysts;
	
	@OneToMany(mappedBy = "manager")
	private Set<LoanDetails> loanDetails;
	
	@OneToMany(mappedBy = "manager")
	private Set<Policy> policy;

	public long getManagerId() {
		return managerId;
	}

	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Manager(long managerId, User user) {
		this.managerId = managerId;
		this.user = user;
	}

	public Manager() {
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", user=" + user + "]";
	}
	
	

}
