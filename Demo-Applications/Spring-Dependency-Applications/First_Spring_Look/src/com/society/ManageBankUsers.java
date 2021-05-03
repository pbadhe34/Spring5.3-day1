package com.society;

import com.bank.org.Account;
import com.bank.org.Address;
import com.bank.org.Branch;
import com.bank.org.User;

public class ManageBankUsers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Create the dependent objects for each user
		//user addresses
		Address adr1 = new Address();
		adr1.setHouse_number(124);
		adr1.setLocation("Sadashiv Path,Pune");
		//another address object
		Address adr2 = new Address();
		adr2.setHouse_number(111);
		adr2.setLocation("Kasba Path,Pune");
		
		//Branch addresses
		
		Address a1 = new Address();
		a1.setHouse_number(29);
		a1.setLocation("Kothrud,Pune");
		
		Address a2 = new Address();
		a2.setHouse_number(115);
		a2.setLocation("Station,Pune");
		
		//Branch Objects
		Branch br1 = new Branch();
		br1.setAddress(a1);
		br1.setContact(2345);
		
		Branch br2 = new Branch();
		br2.setAddress(a2);
		br2.setContact(1156);
		
		
		//Account objects
		Account ac1 = new Account();
		ac1.setBankLocation(br1);
		 
		
		Account ac2 = new Account();
		ac2.setBankLocation(br2);
		//share the branch between account objects
		Account ac3 = new Account();
		ac3.setBankLocation(br2);
		
		//Create user objects and add dependencies to them	
		
		User user1 = new User();
		user1.setUser_account(ac1);
		user1.getUser_account().setNumber(1256);
		user1.getUser_account().setBalance(10000.55);
		user1.setUser_address(adr2);
		
		User user2 = new User();
		user2.setUser_account(ac3);
		user2.getUser_account().setNumber(5612);
		user2.getUser_account().setBalance(50500);
		user2.setUser_address(adr1);
		
		//Do some transactions on Users
		user1.getUser_account().setBalance(11111.125);
		user2.getUser_address().setLocation("Mumbai");
		user2.getUser_address().setHouse_number(167);
		
		System.out.println("User1 balance is   "+user1.getUser_account().getBalance());
		
		System.out.println("User2 address location is   "+user2.getUser_address().getLocation());
				
		 

	}

}
