package com.davbend.tickeTest.entity.Project;

import java.util.ArrayList;

public class Project
{
    private int idProject;
    private String nameProject;
    private int PMAssigned;
    private ArrayList<Task> tasks;

    public Project(){}

    public Project(String nameProject, ArrayList<Task> tasks)
    {
        this.nameProject = nameProject;
        this.tasks = tasks;
    }

    public int getIdProject()
    {
        return idProject;
    }

    public String getNameProject()
    {
        return nameProject;
    }

    public void setNameProject(String nameProject)
    {
        this.nameProject = nameProject;
    }

    public int getPMAssigned()
    {
        return PMAssigned;
    }

    public void setPMAssigned(int PMAssigned)
    {
        this.PMAssigned = PMAssigned;
    }

    public ArrayList<Task> getTasks()
    {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks)
    {
        if(this.tasks.isEmpty())
        {
            this.tasks = tasks;
        }
        else
        {
            this.tasks.addAll(tasks);
        }
    }
}
