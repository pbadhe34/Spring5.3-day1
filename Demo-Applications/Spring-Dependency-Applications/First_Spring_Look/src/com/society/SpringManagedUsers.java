package com.society;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.bank.org.User;

public class SpringManagedUsers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
				"BeanConfig.xml"));
		
		User user1 = (User) factory.getBean("userFirst");
		User user2 = (User) factory.getBean("userSecond");
		
		System.out.println("User1 balance before updation is "
				+ user1.getUser_account().getBalance());
		// Now update users
		user1.getUser_account().setBalance(768965);
		user2.getUser_address().setHouse_number(786);

		System.out.println("User1 balance is "
				+ user1.getUser_account().getBalance());
		System.out.println("User2 house number is "
				+ user1.getUser_address().getHouse_number());

	}

}
