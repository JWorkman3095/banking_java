package com.maxtrain.bootcamp.banking;

public class Savings extends Account {
	
	private double interestRate = .12;
	
	//method called public
	public void calculateAndPayInterest(int months) throws Exception {
		if(months <= 0) {
			throw new Exception("Months must be greater than 0");
		}
		var interestToBePaid = getBalance() * (getInterestRate() / 12) * months;
		try {
		deposit(interestToBePaid);
		} catch(Exception ex) {}
	}
	
	//const
	public Savings(String description) {
		// sets out acct number
		super(description);
		//adds 10000 to increase that number for the account number
		setAccountNo(getAccountNo() + 10000);
	}
	
	public double getInterestRate() {
		return this.interestRate;
		
	}
	public void setInterestRate(double interestRate) throws Exception {
		if(interestRate < 0 ) {
			throw new Exception("interest rate cannot be negative");
		}
		this.interestRate = interestRate;
		
	}
}
