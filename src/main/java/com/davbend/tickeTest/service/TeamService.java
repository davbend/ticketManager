package com.davbend.tickeTest.service;

import com.davbend.tickeTest.dao.TeamDAO;
import com.davbend.tickeTest.entity.Team.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TeamService
{
    @Autowired
    private TeamDAO teamDAO;

    public Collection<Team> getTeams()
    {
        return teamDAO.getAllTeams();
    }

    public Team getTeamByID(int id)
    {
        return teamDAO.getTeamByID(id);
    }
}
