package com.davbend.tickeTest.entity;

public class CEO extends Employee
{
    public CEO(){}

    public CEO(String nameEmployee)
    {
        super(nameEmployee);
        this.setRole("CEO");
    }

}
