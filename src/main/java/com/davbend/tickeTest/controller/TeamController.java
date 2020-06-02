package com.davbend.tickeTest.controller;

import com.davbend.tickeTest.entity.Team.Team;
import com.davbend.tickeTest.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/team")
public class TeamController
{
    @Autowired
    private TeamService teamService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Team> getTeams()
    {
        return teamService.getTeams();
    }

   @RequestMapping(value ="/{id}",method = RequestMethod.GET)
    public Team getTeamsByID(@PathVariable("id") int id)
    {
        return teamService.getTeamByID(id);
    }
}
