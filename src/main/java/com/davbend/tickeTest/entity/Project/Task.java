package com.davbend.tickeTest.entity.Project;

import java.util.List;

public class Task
{
    private int idTask;
    private String description;
    private String status;
    private String deadline;
    private List<Integer> DEVsAssigned;

    public Task(int idTask, String description, String deadline)
    {
        this.idTask = idTask;
        this.description = description;
        this.status = "Not Assigned";
        this.deadline = deadline;
    }

    public int getIdTask()
    {
        return  idTask;
    }
    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getDeadline()
    {
        return deadline;
    }

    public void setDeadline(String deadline)
    {
        this.deadline = deadline;
    }

    public List<Integer> getDEVsAssigned()
    {
        return DEVsAssigned;
    }

    public void setDEVsAssigned(List<Integer> DEVsAssigned)
    {
        if(this.DEVsAssigned.isEmpty())
        {
            this.DEVsAssigned = DEVsAssigned;
        }
        else
        {
            this.DEVsAssigned.addAll(DEVsAssigned);
        }
    }
}