package com.bank.org;

public class Account {
  private String id;
  private int number;
  private double balance;
  private Branch bankLocation;
  
public Branch getBankLocation() {
	return bankLocation;
}
public void setBankLocation(Branch bankLocation) {
	this.bankLocation = bankLocation;
}
public String getId() {
	return id;
}
public void setId(String new_id) {
	this.id = new_id;
}
public int getNumber() {
	return number;
}
public void setNumber(int num) {
	this.number = num;
}
public double getBalance() {
	return balance;
}
public void setBalance(double amount) {
	this.balance = amount;
}
  
}
