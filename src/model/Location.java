package model;

import model.tasktype.NormalTask;

import java.util.ArrayList;

public enum Location{

    HOME("Home"),
    SCHOOL("School"),
    WORK("Work");

    private String displayName;

    Location(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    void suggestTask(ToDoList toDoList){
        System.out.println("May we suggest you to do: ");
        ArrayList<NormalTask> normalTasks = toDoList.specialList.get(this);
        for (NormalTask n: normalTasks){
            System.out.println(n.getName());
        }
    }
}


