package model.tasktype;

import java.time.LocalDate;
import java.util.List;

public class NormalTask extends ATask {
    private List<UrgentTask> urgentTasks;

    public NormalTask(String name, LocalDate dueDate) {
        super(name, dueDate);
    }

    @Override
    public void setPriority() {
        this.priority = 1;
    }

    @Override
    public void decorateTask(String name) {
        this.name = "~" + name + "~";
    }

    public void decorateTask(){
        this.name = name + ".";
    }



    public void addUrgentTasks(UrgentTask u){
        if (!urgentTasks.contains(u)){
            urgentTasks.add(u);
            u.addNormalTask(this);
        }
    }


}
