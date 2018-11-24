package model.listcomponent;

import exceptions.MaxTaskException;
import model.ToDoList;
import model.listcomponent.Messages;
import model.tasktype.ATask;
import model.tasktype.NormalTask;
import model.tasktype.UrgentTask;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.ArrayList;

public class UserOptions {
    public static void removet(ToDoList toDoList) {
        System.out.println("select the task to remove");
        int command3 = Integer.parseInt(toDoList.scanner.nextLine());
        System.out.println("Removing task");
        toDoList.listTasks.remove(toDoList.listTasks.get(command3 - 1));
        Messages.countTaskMessage(toDoList);
        for (ATask t : toDoList.listTasks) {
            System.out.println(t.getName() + String.valueOf(t.getDueDate()));
        }
        return;
    }

    public static void addt(ToDoList toDoList) throws MaxTaskException {
        System.out.println("You have selected Add, please add the task to complete");
        String command2 = toDoList.scanner.nextLine();
        String dueDate;
        LocalDate myDate;
        while(true) {
            try {
                System.out.println("Please enter a due date for the task YYYY-MM-DD");
                dueDate = toDoList.scanner.nextLine();
                myDate = LocalDate.parse(dueDate);
            } catch (Exception e) {
                System.out.println("Please Enter Due Date in Valid Format");
                continue;
            }
            break;
        }
        System.out.println("Enter the priority of the task, 0 = urgent, 1 = normal");
        String priority = toDoList.scanner.nextLine();
        if (!(toDoList.listTasks.size() < toDoList.MAX_TASK)) {
            throw new MaxTaskException("Too Many Task!, Remove a Task");
        } else if (Integer.parseInt(priority) == 0) {
            UrgentTask urgentTask = new UrgentTask(command2, myDate);
            urgentTask.setPriority();
            urgentTask.decorateTask(urgentTask.name);
            toDoList.listTasks.add(urgentTask);
            System.out.println("adding task");
            Messages.countTaskMessage(toDoList);
        } else if (Integer.parseInt(priority) == 1) {
            NormalTask normalTask = new NormalTask(command2, myDate);
            normalTask.setPriority();
            normalTask.decorateTask(normalTask.name);
            normalTask.decorateTask();
            toDoList.listTasks.add(normalTask);
            System.out.println("adding task");
            Messages.countTaskMessage(toDoList);
        }
        return;
    }

    public static void quit(ToDoList toDoList) throws UnsupportedEncodingException {
        try {
            toDoList.save();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void viewt(ArrayList<ATask> listTasks) {
        for (ATask t : listTasks) {
            System.out.println("Task: " + t.getName() + " Due: " + String.valueOf(t.getDueDate()) + " Priority: " + String.valueOf(t.getPriority()));
        }
    }
}
