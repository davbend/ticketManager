package com.davbend.tickeTest.entity.Team;

import com.davbend.tickeTest.entity.Employee;

public class PM extends TeamMember
{
    //Progetto

    public PM() {}

    public PM(String nameEmployee)
    {
        super(nameEmployee);
        this.setRole("PM");
    }
}
