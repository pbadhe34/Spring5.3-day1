package org.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service ("employeeManager")
public class EmployeeManagerService implements EmployeeManager
{
    @Autowired
    EmployeeDao dao;
     
    public EmployeeDTO createNewEmployee()
    {
        return dao.createNewEmployee();
    }
}
