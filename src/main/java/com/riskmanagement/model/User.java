package com.riskmanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// TODO implement lombok annotation
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;


	private Role role;
	
	private String fName;
	private String lName;
	private String email;
	private String password;
	private long aadharNumber;
	private boolean isActive;
	private long phoneNumber;
	
	@Temporal(TemporalType.DATE)
    private Date creationDate;
	
	@Temporal(TemporalType.DATE)
    private Date dateOfBirth;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "User [id=" + userId + ", role=" + role + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", password=" + password + ", aadharNumber=" + aadharNumber + ", isActive=" + isActive
				+ ", phoneNumber=" + phoneNumber + ", creationDate=" + creationDate + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}

	public User(long userId, Role role, String fName, String lName, String email, String password, long aadharNumber,
			boolean isActive, long phoneNumber, Date creationDate, Date dateOfBirth) {
		this.userId = userId;
		this.role = role;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.aadharNumber = aadharNumber;
		this.isActive = isActive;
		this.phoneNumber = phoneNumber;
		this.creationDate = creationDate;
		this.dateOfBirth = dateOfBirth;
	}
	
	public User() {
		
	}

}
