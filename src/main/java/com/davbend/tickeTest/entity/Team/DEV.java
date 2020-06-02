package com.davbend.tickeTest.entity.Team;

public class DEV extends TeamMember
{
    public DEV() {}

    public DEV(String nameEmployee)
    {
        super(nameEmployee);
        this.setRole("DEV");
    }
}
