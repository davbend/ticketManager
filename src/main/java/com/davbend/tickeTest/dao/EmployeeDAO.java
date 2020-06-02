package com.davbend.tickeTest.dao;

import com.davbend.tickeTest.entity.CEO;
import com.davbend.tickeTest.entity.Employee;
import com.davbend.tickeTest.entity.Team.DEV;
import com.davbend.tickeTest.entity.Team.PM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDAO
{
    @Autowired
    private static Map<Integer, Employee> employees;

    static
    {
        employees = new HashMap<Integer, Employee>();
        employees.put(1, new CEO("Carlo"));

        employees.put(2, new PM("Marco"));
        employees.put(3, new DEV("Maria"));
        employees.put(4, new DEV("Luca"));
        employees.put(5, new DEV("Sara"));

        employees.put(6, new PM("Susanna"));
        employees.put(7, new DEV("Alberto"));
        employees.put(8, new DEV("Dario"));
        employees.put(9, new DEV("Nicola"));
    }

    public Collection<Employee> getEmployees()
    {
        return employees.values();
    }

    public Employee getEmployeeByID(int id)
    {
        return employees.get(id);
    }

}
