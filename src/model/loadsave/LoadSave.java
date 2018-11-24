package model.loadsave;

import exceptions.TooManyTaskException;
import model.ToDoList;
import model.tasktype.ATask;
import model.tasktype.NormalTask;
import model.tasktype.UrgentTask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LoadSave {
    public static void load2(ToDoList toDoList) throws IOException, TooManyTaskException {
        List<String> lines = Files.readAllLines(Paths.get("inputfile.txt"));
        if (!(lines.size() <= toDoList.MAX_TASK)) {
            throw new TooManyTaskException("You have too many tasks!");
        }
        for (String line : lines) {
            ArrayList<String> partsOfLine = toDoList.splitOnComma(line);
            if (Integer.parseInt(partsOfLine.get(2)) == 0) {
                ATask aTask = new UrgentTask(partsOfLine.get(0), LocalDate.parse(partsOfLine.get(1)));
                aTask.setPriority();
                //               aTask.decorateTask(aTask.getName());
                toDoList.listTasks.add(aTask);
            } else if (Integer.parseInt(partsOfLine.get(2)) == 1) {
                ATask aTask = new NormalTask(partsOfLine.get(0), LocalDate.parse(partsOfLine.get(1)));
                aTask.setPriority();
//                aTask.decorateTask(aTask.getName());
                toDoList.listTasks.add(aTask);
            }
        }
    }
}
