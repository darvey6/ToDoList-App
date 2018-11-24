//package tests;
//
//import model.tasktype.ATask;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class TestATask {
//
//    @BeforeEach
//    public void testConstructor(){}
//    ATask aTask = new ATask("abc");
//
//    @Test
//    public void testOneTask(){
//        assertFalse(aTask.getStatus());
//        assertEquals(aTask.getDueDate(), "0");
//    }
//
//    @Test
//    public void testTwoTask(){
//        assertFalse(aTask.getStatus());
//        assertEquals(aTask.getDueDate(), "0");
//
//
//        ATask aTask2 = new ATask("def");
//        assertEquals(aTask2.getDueDate(), "0");  //add second task
//        aTask2.setDueDate(12,20,2000);
//        assertEquals(aTask2.getDueDate(), "12202000");
//
//        assertEquals(aTask.getDueDate(), "0"); // check if DueDate of Task 1 has been overwritten
//    }
//
//    @Test void testChangeStatus(){
//        aTask.changeStatus();
//        assertTrue(aTask.getStatus());
//        aTask.changeStatus();
//        assertFalse(aTask.getStatus());
//    }
//
//    @Test void testSetDueDate(){
//        assertEquals(aTask.getDueDate(), "0");
//        aTask.setDueDate(12,20,2000);
//        assertEquals(aTask.getDueDate(),"12202000");
//    }
//
//    @Test void testReSetDueDate(){
//        assertEquals(aTask.getDueDate(), "0");
//        aTask.setDueDate(12,20,2000);
//        assertEquals(aTask.getDueDate(),"12202000");
//        aTask.setDueDate(06,15,2001);
//        assertEquals(aTask.getDueDate(),"06152001");
//    }
//
//
//
//}
