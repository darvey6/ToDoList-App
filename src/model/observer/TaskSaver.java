package model.observer;

import java.util.Observable;
import java.util.Observer;

public class TaskSaver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Starting Parse");

    }
}
