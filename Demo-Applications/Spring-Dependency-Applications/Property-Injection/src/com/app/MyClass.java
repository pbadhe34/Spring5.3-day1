package com.app;

import org.bank.data.BankAccount;

public class MyClass
{
	private String someValue;
	private int data;
	
	private  BankAccount accounting;
	
   // public void setAccountingBean(BankAccount accounting) {    	
 
    public void setAccounting(BankAccount accounting) {
		this.accounting = accounting;
	}
	public String getSomeValue() {
		return someValue;
	}
	public int getData() {
		return data;
	}

	public int checkBalance() {
		int bal = accounting.readBalanceForUser(this.someValue);
		System.out.println("MyClass.checkBalance() "+bal);
		return bal;
	}

    //public void setSomevalue(String newValue)will not work
	public void setSomeValue(String newValue)
	{
		  System.out.println("Setting the property someValue");
          someValue = newValue;
	}
	public void setData(int Value)
	{
		  System.out.println("Setting the property data");
          data = Value;
	}
	public MyClass()
	{
        System.out.println("MyClass(Default) called");         
    }
        
    public String toString()
	{
        return "MyClass with "+someValue +" and "+data;
    }
}