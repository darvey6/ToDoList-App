package ui;

import exceptions.MaxTaskException;
import model.ToDoList;
import model.listcomponent.Messages;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        displayInitialMessage();
        ToDoList toDoList = new ToDoList();
        try {
            toDoList.run();
        } catch (MaxTaskException e) {
            e.printStackTrace();
        } finally {
            try {
                toDoList.run();
            } catch (MaxTaskException e) {
                e.printStackTrace();
            }
        }

    }

    private static void displayInitialMessage() {
        Messages.welcomeMessage();



    }


}
