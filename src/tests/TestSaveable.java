package tests;

import model.tasktype.ATask;
import model.tasktype.NormalTask;
import model.ToDoList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestSaveable {
    ToDoList toDoList = new ToDoList();
    ArrayList<ATask> listTasks = new ArrayList<>();
    ATask a;
    ATask b;

    @BeforeEach
    public void pre(){
         a = new NormalTask("1", LocalDate.parse("2000-10-20"));
         b = new NormalTask("2", LocalDate.parse("3000-12-25"));
    }

    @Test
    public void testSave() throws FileNotFoundException, UnsupportedEncodingException {
        listTasks.add(a);
        listTasks.add(b);
        toDoList.save();

    }

}
