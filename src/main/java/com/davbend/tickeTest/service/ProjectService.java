package com.davbend.tickeTest.service;

import com.davbend.tickeTest.dao.ProjectDAO;
import com.davbend.tickeTest.entity.Project.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProjectService
{
    @Autowired
    private ProjectDAO projectDAO;

    public Collection<Project> getProjects()
    {
        return projectDAO.getProjects();
    }

    public Project getProjectByID(int id)
    {
        return projectDAO.getProjectByID(id);
    }
}
