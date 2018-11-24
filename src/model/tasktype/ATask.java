package model.tasktype;

import java.time.LocalDate;
import java.util.Objects;

public abstract class ATask{
    public String name;
    private boolean status;
    private LocalDate dueDate;
    protected Integer priority;


    public ATask(String name, LocalDate dueDate) {
        this.name = name;
        status = false;
        this.dueDate = dueDate;

    }

    public String getName() {
        return name;
    }

//    //REQUIRES: N/A
//    //MODIFIES: N/A
//    //EFFECTS: Retrieve current Status
//    public boolean getStatus() {
//        return status;
//    }
//
//    //REQUIRES: N/A
//    //MODIFIES: this
//    //EFFECTS: Changes status to False if true, and to True if false
//    public void changeStatus() {
//        status = !status;
//    }

    //REQUIRES: N/A
    //MODIFIES: N/A
    //EFFECTS: Retrieve current DueDate
    public LocalDate getDueDate() {
        return dueDate;
    }


    public String toString() {
        return name;
    }

    public Integer getPriority() {
        return priority;
    }

    public abstract void setPriority();

    public abstract void decorateTask(String name);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATask aTask = (ATask) o;
        return Objects.equals(name, aTask.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}

