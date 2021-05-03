package com.server.data;


/**
 * {@link Service} with hard-coded input data.
 */
public class ExampleService implements Service {
	
	/**
	 * Reads next record from input
	 */
	public String getMessage() {
		return "Hello Spring DI!";	
	}

}
