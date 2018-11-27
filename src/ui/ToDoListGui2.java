package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListGui2 extends JPanel {
    private JList modelList;
    private JLabel labelToDoList;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Darvey's To-Do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new ToDoListGui2());
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
    public ToDoListGui2(){
        setLayout(new BorderLayout());
        DefaultListModel model = new DefaultListModel();
        labelToDoList = new JLabel();
        modelList = new JList();
        JScrollPane pane = new JScrollPane(modelList);
        JButton addTask = new JButton("Add Task");
        JButton removeTask = new JButton("Remove Task");
        JTextField textField = new JTextField("Type a Task To Do");


        addTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelToDoList.setText(textField.getText());
            }
        });


        removeTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelToDoList.setText(textField.getText());
            }
        });

        add(pane, BorderLayout.NORTH);
        add(textField, BorderLayout.SOUTH);
        add(addTask, BorderLayout.EAST);
        add(removeTask, BorderLayout.WEST);

    }
}
