package tests;

import exceptions.TooManyTaskException;
import model.ToDoList;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLoadable {
    ToDoList toDoList = new ToDoList();

    public TestLoadable() {
    }


    @Test
    public void testSplitOnComma(){
        ArrayList<String> partsOfLine = toDoList.splitOnComma("abc,def,ghi");
        assertEquals(partsOfLine.size(),3);
        assertEquals(partsOfLine.get(0),"abc");
        assertEquals(partsOfLine.get(1),"def");
        assertEquals(partsOfLine.get(2),"ghi");



    }

    @Test
    public void testLoad() throws IOException {
        try {
            toDoList.load();
        } catch (TooManyTaskException e) {
            e.printStackTrace();
        }
        assertEquals(toDoList.getATask(0),"Do Homework,2018-12-20");
        assertEquals(toDoList.getATask(1),"Play Piano,2020-11-12");
    }



}
