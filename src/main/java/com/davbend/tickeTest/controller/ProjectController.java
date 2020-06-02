package com.davbend.tickeTest.controller;

import com.davbend.tickeTest.entity.Project.Project;
import com.davbend.tickeTest.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/project")
public class ProjectController
{
    @Autowired
    private ProjectService projectService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Project> getProjects()
    {
        return projectService.getProjects();
    }

    @RequestMapping(value ="/{id}",method = RequestMethod.GET)
    public Project getProjectByID(@PathVariable("id") int id)
    {
        return projectService.getProjectByID(id);
    }
}
