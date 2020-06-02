package com.davbend.tickeTest.entity.Team;

import com.davbend.tickeTest.entity.Employee;

public class TeamMember extends Employee
{
    private String nameTeam;

    public TeamMember() {}

    public TeamMember(String nameEmployee)
    {
        super(nameEmployee);
    }

    public String getNameTeam()
    {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam)
    {
        this.nameTeam = nameTeam;
    }
}
