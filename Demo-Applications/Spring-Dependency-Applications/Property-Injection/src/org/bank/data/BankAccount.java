package org.bank.data;

public class BankAccount {
   public int readBalanceForUser(String id) {
	   System.out.println("BankAccount.readBalanceForUser()");
	   return (id.length() + 1000)/interestRate;
   }
   
   private int interestRate;

public void setInterestRate(int interestRate) {
	this.interestRate = interestRate;
}
   
}
