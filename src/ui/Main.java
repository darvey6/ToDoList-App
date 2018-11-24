package ui;

import exceptions.MaxTaskException;
import model.ToDoList;
import model.listcomponent.Messages;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.io.IOException;

public class Main extends JPanel implements ListSelectionListener{

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("To-Do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new Main();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
        }


    public static void main(String[] args) throws IOException {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
//        displayInitialMessage();
//        ToDoList toDoList = new ToDoList();
//        try {
//            toDoList.run();
//        } catch (MaxTaskException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                toDoList.run();
//            } catch (MaxTaskException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }

    private static void displayInitialMessage() {
        Messages.welcomeMessage();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}
