package tests;

import exceptions.TooManyTaskException;
import model.ToDoList;
import model.loadsave.LoadSave;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.fail;


public class LoadExceptionTest {
    ToDoList toDoList;


    @BeforeEach
    public void Setup(){
        toDoList = new ToDoList();
    }


    @Test
    public void loadExceptionNotThrownTest() {
        try {
            LoadSave.load2(toDoList);
        } catch (TooManyTaskException | IOException e) {
            fail("fail");
        }
    }

    @Test
    public void loadExceptionTooManyTest2() {
        try {
            toDoList.load();
            fail("fail");
        } catch (TooManyTaskException | IOException e) {

        }
    }


    @Test
    public void loadExceptionTest() {
        try {
            toDoList.save();
        } catch (IOException e) {
            fail("fail");
        }
    }

}


