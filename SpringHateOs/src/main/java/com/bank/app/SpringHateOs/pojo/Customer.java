package com.bank.app.SpringHateOs.pojo;



import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public  class Customer {
	@Id
	private String customerId;
	private String customerName;
	/*private long contactNumber;
	private String emailId;
	
	private String nationality;
	private String gender;
	private long balance;
	private static int custId;
	
	

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public static int getCustId() {
		return custId;
	}

	public static void setCustId(int custId) {
		Customer.custId = custId;
	}

	public Customer(String customerId, String customerName, long contactNumber, String emailId, String nationality,
			String gender, long balance) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.nationality = nationality;
		this.gender = gender;
		this.balance = balance;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", emailId=" + emailId + ", nationality=" + nationality + ", gender=" + gender
				+ ", balance=" + balance + "]";
	}

	*/
	public String getCustomerId() {
		return customerId;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	public Customer(String customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
