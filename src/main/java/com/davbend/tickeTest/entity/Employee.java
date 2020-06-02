package com.davbend.tickeTest.entity;

public class Employee
{
    private String nameEmployee;
    private String role;

    public Employee() {}

    public Employee(String nameEmployee)
    {
        this.nameEmployee = nameEmployee;
    }

    public String getNameEmployee()
    {
        return nameEmployee;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String r)
    {
        role = r;
    }
}