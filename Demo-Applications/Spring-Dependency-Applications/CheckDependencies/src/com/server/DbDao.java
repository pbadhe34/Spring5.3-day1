package com.server;

import com.db.Driver;

public class DbDao {

	
	private Driver dbDriver;	
	 

	public Driver getDbDriver() {
		System.out.println("DbDao.getDbDriver()");
		return dbDriver;
	}


	public void setDbDriver(Driver dbDriver) {
		System.out.println("DbDao.setDbDriver()"); 
		this.dbDriver = dbDriver;
	}




	public DbDao()
	{
		System.out.println("DbDao()");
	}
}
