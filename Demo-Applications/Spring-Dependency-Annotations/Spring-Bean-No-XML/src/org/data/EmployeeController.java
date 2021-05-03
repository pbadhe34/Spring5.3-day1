package org.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeController {

	@Autowired
    EmployeeManager manager;
     
    public EmployeeDTO createNewEmployee()
    {
    	System.out.println("EmployeeController.createNewEmployee()");
        return manager.createNewEmployee();
    }
}

