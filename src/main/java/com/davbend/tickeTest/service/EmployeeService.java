package com.davbend.tickeTest.service;

import com.davbend.tickeTest.dao.EmployeeDAO;
import com.davbend.tickeTest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeService
{
        @Autowired
        private EmployeeDAO employeeDAO;

        public Collection<Employee> getEmployees()
        {
            return employeeDAO.getEmployees();
        }

        public Employee getEmployeeByID(int id)
        {
            return employeeDAO.getEmployeeByID(id);
        }
}

