package com.davbend.tickeTest.entity.Team;

import java.util.ArrayList;

public class Team
{
    private String nameTeam;
    private PM prjMan;
    private ArrayList<DEV> devs;

    public Team(String nameTeam, PM prjMan, ArrayList<DEV> devs)
    {
        this.nameTeam = nameTeam;
        this.prjMan = prjMan;
        this.prjMan.setNameTeam(nameTeam);
        this.devs = devs;
        for (DEV d:devs)
        {
            d.setNameTeam(nameTeam);
        }
    }

    public String getNameTeam()
    {
        return nameTeam;
    }

    public PM getPrjMan()
    {
        return prjMan;
    }

    public ArrayList<DEV> getDevs()
    {
        return devs;
    }

}
