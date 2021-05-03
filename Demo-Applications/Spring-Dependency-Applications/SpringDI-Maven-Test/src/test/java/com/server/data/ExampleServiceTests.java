package com.server.data;

import com.server.data.ExampleService;
import junit.framework.TestCase;

public class ExampleServiceTests extends TestCase {

	private ExampleService service = new ExampleService();
	
	public void testReadOnce() throws Exception {
		assertEquals("Hello Spring DI!", service.getMessage());
	}

}
