package com.maxtrain.bootcamp.banking;

public class Account {
	
	private static int nextAccountNo = 1;
	
	//field (like a property)
	private int accountNo;
	private String description;
	private double balance;
	
	public void deposit(double amount) throws Exception {
		if (amount <= 0) {
			throw new Exception("Amount must be GT zero!");
		}
		//double sum = amount + getBalance();
		setBalance(getBalance() + amount);		
	}	
	public void withdraw(double amount)  throws Exception {
			if (amount <= 0) {
				throw new Exception("Amount must be GT zero!");
			}
			if (amount > getBalance()) {
				throw new Exception("Insuff funds!");
			}
			setBalance(getBalance() - amount);
	}
	
	public void transfer(double amount, Account toAccount) throws Exception {
		this.withdraw(amount);
		toAccount.deposit(amount);	
		
	}
	public String toString() {
		var message = "accountNo        = " + this.getAccountNo() + "\n"
				    + "description      = " + this.getDescription() + "\n"
				    + "balance          = " + this.getBalance();
		return message;
	}
	
	//default Constructor
	public Account() {		
	}
	// construct that sets the description
	public Account(String description) {
		this.setAccountNo(this.nextAccountNo++);
		this.setDescription(description);
		try {
		this.setBalance(0);
		} catch(Exception ex){}				
	}	
	// getter
 	public int getAccountNo() {
		return accountNo;
	}
 	
	// setter
 	//set private so no one outside access access and change or modify
	protected void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) throws Exception {
		if (balance < 0) {
			throw new Exception("Balance must be GTE Zero");
		}
		this.balance = balance;
	}
	
}
