package com.maxtrain.bootcamp.banking;

public class Checking extends Account {
	
	private int numberOfChecks;
	
	//method created 3rd
	public void writeCheck(int checkNo, double amount) throws Exception {
		withdraw(amount);
		numberOfChecks++;
	}
	
	//constructor created 1st
	public Checking(String description) {
		super(description);
		this.setNumberOfChecks(0);
	}
	
	public String toString() {
		//call in parent class account the acct# balance
		return super.toString() + "\nchecks= " + numberOfChecks;
	}
	
	// getter setter 2nd on create
	public int getNumberOfhecks() {
		return this.numberOfChecks;
	}
	private void setNumberOfChecks(int numberOfChecks) {
		this.numberOfChecks = numberOfChecks;
	}
}	
