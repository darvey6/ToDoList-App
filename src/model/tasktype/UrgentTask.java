package model.tasktype;


import model.tasktype.ATask;
import model.tasktype.NormalTask;

import java.time.LocalDate;
import java.util.List;

public class UrgentTask extends ATask {
    private List<NormalTask> normalTasks;



    public UrgentTask(String name, LocalDate dueDate) {
        super(name, dueDate);
    }

    public void addNormalTask(NormalTask n){
        if (!normalTasks.contains(n)){
            normalTasks.add(n);
            n.addUrgentTasks(this);
        }
    }

    @Override
    public void setPriority() {
        this.priority = 0;
    }

    @Override
    public void decorateTask(String name) {
        this.name = "!" + name + "!";
    }
}
