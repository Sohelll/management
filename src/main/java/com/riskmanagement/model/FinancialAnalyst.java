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
public class FinancialAnalyst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long faId;
	
	@OneToOne(optional = false)
	@JoinColumn(name="userId")
	private User user;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="managerId")
	private Manager manager;
	
	@OneToMany(mappedBy = "financialAnalyst")
	private Set<CreditApplication> creditApplication;

}
