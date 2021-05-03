package com.db;

public class MyDriver implements Driver {
	
	public MyDriver(String url)
	{
		System.out.println("MyDriver.MyDriver(URL)");
	}
	
	public MyDriver()
	{
		this("jdbc:mydb://local");
		System.out.println("MyDriver.MyDriver()");
	}
	
	/* (non-Javadoc)
	 * @see com.db.Driver#connect()
	 */
	@Override
	public void connect()
	{
		System.out.println("MyDriver.connect()");
	}

}
