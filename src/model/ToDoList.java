package model;

import exceptions.MaxTaskException;
import exceptions.TooManyTaskException;
import model.listcomponent.Messages;
import model.listcomponent.UserOptions;
import model.loadsave.LoadSave;
import model.loadsave.Loadable;
import model.loadsave.Saveable;
import model.observer.TaskSaver;
import model.tasktype.ATask;
import model.tasktype.NormalTask;
import model.tasktype.UrgentTask;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;


public final class ToDoList extends Observable implements Saveable, Loadable {
    public ArrayList<ATask> listTasks = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);
    public int MAX_TASK = 5;
    public Map<Location,ArrayList<NormalTask>> specialList = new HashMap<>();
    private LocalDate DueDate;

    public ToDoList() {
        addObserver(new TaskSaver());
    }

    public void run() throws IOException, MaxTaskException {
        startrun();
        String command;

        try {
            LoadSave.load2(this);
        } catch (TooManyTaskException e) {
            e.printStackTrace();
        } finally {
            Messages.startOption(MAX_TASK);
        }
        label:
        while (true) {
            command = scanner.nextLine();
            switch (command) {
                case "add":
                    UserOptions.addt(this);
                    break;
                case "remove":
                    UserOptions.removet(this);
                    break;
                case "view":
                    UserOptions.viewt(listTasks);
                    break;
                case "parse":
                    setChanged();
                    notifyObservers();
                    ReadWebPageEx readWebPageEx = new ReadWebPageEx();
                    readWebPageEx.needurl(loadurl());
                    readWebPageEx.urlread();
                    break;
                case "quit":
                    UserOptions.quit(this);
                    break label;
            }
        }
        System.out.println("Thank You for using the Task Manager!");
    }

    private void startrun() {
        String command = "";
        NormalTask study = new NormalTask("Study", DueDate);
        NormalTask workHard = new NormalTask("work hard", DueDate);
        addLocation(Location.HOME);
        addLocation(Location.SCHOOL);
        addLocation(Location.WORK);

        addNormalTask(Location.HOME, study);
        addNormalTask(Location.SCHOOL, study);

        addNormalTask(Location.SCHOOL, workHard);
        addNormalTask(Location.HOME, workHard);
        addNormalTask(Location.WORK, workHard);

        Location.HOME.suggestTask(this);
    }

    public int countTasks() {
        return listTasks.size();
    }

    public void save() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("outputfile.txt", "UTF-8");
        for (ATask task : listTasks) {
            writer.print(task.getName() + "," + task.getDueDate() + "," + task.getPriority() + "\n");
        }
        writer.close();
    }


    public PrintWriter getWriter(PrintWriter printWriter) {
        return printWriter;
    }



    public void load() throws IOException, TooManyTaskException {
        List<String> lines = Files.readAllLines(Paths.get("outputfile.txt"));
        if (!(lines.size() <= MAX_TASK)){
            throw new TooManyTaskException("You have too many tasks!");
        }
        for (String line : lines){
            ArrayList<String> partsOfLine = splitOnComma(line);
            if (Integer.parseInt(partsOfLine.get(2)) == 0){
                ATask aTask = new UrgentTask(partsOfLine.get(0),LocalDate.parse(partsOfLine.get(1)));
                aTask.setPriority();
 //               aTask.decorateTask(aTask.getName());
                listTasks.add(aTask);
            } else if (Integer.parseInt(partsOfLine.get(2)) == 1){
                ATask aTask = new NormalTask(partsOfLine.get(0),LocalDate.parse(partsOfLine.get(1)));
                aTask.setPriority();
//                aTask.decorateTask(aTask.getName());
                listTasks.add(aTask);
            }
        }
    }

    public String loadurl() throws IOException{
        List<String> lines = Files.readAllLines(Paths.get("urlfile"));
        return lines.get(0);
    }

    public String getATask (int i){
        return String.valueOf(listTasks.get(i)+","+listTasks.get(i).getDueDate());

    }

    public ArrayList<String> splitOnComma(String line){
        String[] splits = line.split(",");
        return new ArrayList<>(Arrays.asList(splits));
    }


    private void addLocation(Location location) {
        specialList.put(location, new ArrayList<>());
    }


    private void addNormalTask(Location l, NormalTask normalTask){
        ArrayList<NormalTask> normalTasks = specialList.get(l);
        normalTasks.add(normalTask);
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "listTasks=" + listTasks +
                ", scanner=" + scanner +
                ", MAX_TASK=" + MAX_TASK +
                ", specialList=" + specialList +
                ", DueDate=" + DueDate +
                '}';
    }
}

