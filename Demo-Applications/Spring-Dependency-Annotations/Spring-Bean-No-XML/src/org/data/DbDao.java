package org.data;

import org.springframework.stereotype.Repository;

@Repository ("employeeDao")
public class DbDao implements EmployeeDao
{
    public EmployeeDTO createNewEmployee()
    {
    	System.out.println("DbDao.createNewEmployee()");
        EmployeeDTO emp = new EmployeeDTO();
        emp.setId(1);
        emp.setFirstName("Ashok");
        emp.setLastName("Vajpayee");
        return emp;
    }
}
