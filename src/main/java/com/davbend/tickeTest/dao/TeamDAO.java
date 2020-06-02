package com.davbend.tickeTest.dao;

import com.davbend.tickeTest.entity.CEO;
import com.davbend.tickeTest.entity.Employee;
import com.davbend.tickeTest.entity.Team.DEV;
import com.davbend.tickeTest.entity.Team.PM;
import com.davbend.tickeTest.entity.Team.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class TeamDAO
{
    @Autowired
    private static Map<Integer, Team> teams;

    static
    {
        teams = new HashMap<Integer, Team>();
        PM p1 =new PM("Marco");
        DEV d1 = new DEV("Luca");
        DEV d2 = new DEV("Mario");
        DEV d3 = new DEV("Carla");
        ArrayList<DEV> devs1 = new ArrayList<DEV>();
        devs1.add(d1);
        devs1.add(d2);
        devs1.add(d3);
        Team t1 = new Team("Team 1", p1,devs1);

        PM p2 = new PM("Chiara");
        DEV d4 = new DEV("Paolo");
        DEV d5 = new DEV("Miranda");
        ArrayList<DEV> devs2 = new ArrayList<DEV>();
        devs2.add(d4);
        devs2.add(d5);
        Team t2 = new Team("Team 2", p2,devs2);

        teams.put(1,t1);
        teams.put(2,t2);
    }

    public Collection<Team> getAllTeams()
    {
        return this.teams.values();
    }

    public Team getTeamByID(int id)
    {
        return this.teams.get(id);
    }



}
