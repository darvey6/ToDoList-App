package model.listcomponent;

import model.ToDoList;

public class Messages {
    //REQUIRES: N/A
    //MODIFIES: toDoList
    //EFFECTS: Retrieve print out message stating current amount
    public static void countTaskMessage(ToDoList toDoList) {
        System.out.println("You currently have " + toDoList.countTasks() + " task(s).");

    }

    public static void startOption(int MAX_TASK) {
        System.out.println("Please select an option you can have " + MAX_TASK + " tasks max");
        System.out.println("Type add to add a task");
        System.out.println("Type remove to add a task");
        System.out.println("Type view to view your current tasks");
        System.out.println("Type parse to parse CS210 WebPage");
        System.out.println("Type quit to quit the program");
    }

    //REQUIRES: N/A
    //MODIFIES: N/A
    //EFFECTS: print out welcome message
    public static void welcomeMessage() {
        System.out.print("Welcome to Darvey's Task Manager!\n");
    }
}
