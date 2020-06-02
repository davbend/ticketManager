package com.davbend.tickeTest.dao;

import com.davbend.tickeTest.entity.Project.Project;
import com.davbend.tickeTest.entity.Project.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProjectDAO
{
    @Autowired
    private static Map<Integer, Project> projects;

    static
    {
        projects = new HashMap<Integer, Project>();
        ArrayList<Task> tasks1 = new ArrayList<Task>();
        Task t1 = new Task(1, "Task 1", "20-10-2020");
        Task t2 = new Task(2, "Task 2", "10-07-2021");
        Task t3 = new Task(3, "Task 3", "15-03-2020");
        tasks1.add(t1);
        tasks1.add(t2);
        tasks1.add(t3);
        Project p1 = new Project(1, "Project 1", tasks1);

        ArrayList<Task> tasks2 = new ArrayList<Task>();
        Task t4 = new Task(4, "Task 4", "05-12-2020");
        Task t5 = new Task(5, "Task 5", "14-08-2021");
        Task t6 = new Task(6, "Task 6", "19-06-2020");
        tasks2.add(t4);
        tasks2.add(t5);
        tasks2.add(t6);

        Project p2 = new Project(2,"Project 2", tasks2);
        projects.put(1, p1);
        projects.put(2,p2);
    }

    public Collection<Project> getProjects()
    {
        return projects.values();
    }

    public Project getProjectByID(int id)
    {
        return projects.get(id);
    }

}
