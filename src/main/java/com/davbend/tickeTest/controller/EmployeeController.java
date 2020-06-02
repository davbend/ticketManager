package com.davbend.tickeTest.controller;

import com.davbend.tickeTest.entity.Employee;
import com.davbend.tickeTest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Employee> getEmployees()
    {
        return employeeService.getEmployees();
    }

    @RequestMapping(value ="/{id}",method = RequestMethod.GET)
    public Employee getEmployeeByID(@PathVariable("id") int id)
    {
        return employeeService.getEmployeeByID(id);
    }

}
