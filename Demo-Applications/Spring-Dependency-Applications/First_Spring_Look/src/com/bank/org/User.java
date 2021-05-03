package com.bank.org;

public class User {
 protected Address user_address;
 private Account user_account;
public Address getUser_address() {
	return user_address;
}
 
public Account getUser_account() {
	return user_account;
}
public void setUser_account(Account user_account) {
	this.user_account = user_account;
}

public void setUser_address(Address user_addr) {
	this.user_address = user_addr;
}
 
 
}
