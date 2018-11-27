package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListGui extends SetUpUI{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Darvey's To-Do List");
        frame.setContentPane(new ToDoListGui().myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    {
        setup();
    }

    public JComponent $$$getRootComponent$$$() {
        return myPanel;
    }

    public ToDoListGui() {
        String taskName = inputTask.getText();
        addButton.addActionListener(new ActionListener() {
            int counter = 1;

            @Override
            public void actionPerformed(ActionEvent e) {

                if (counter == 1) {
                    resultTask1.setText(inputTask.getText());
                    counter++;
                    myPanel.revalidate();
                    myPanel.repaint();
                } else if (counter == 2) {
                    resultTask2.setText(inputTask.getText());
                    counter++;
                    myPanel.revalidate();
                    myPanel.repaint();
                } else if (counter == 3) {
                    resultTask3.setText(inputTask.getText());
                    counter++;
                    myPanel.revalidate();
                    myPanel.repaint();
                } else if (counter == 4) {
                    resultTask4.setText(inputTask.getText());
                    counter++;
                    myPanel.revalidate();
                    myPanel.repaint();
                } else if (counter == 5) {
                    resultTask5.setText(inputTask.getText());
                    counter++;
                    myPanel.revalidate();
                    myPanel.repaint();
                }
            }
        });

        deleteTaskButton.addActionListener(new ActionListener() {
            String removeString = "";

            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputTask.getText().equals("1")) {
                    myPanel.remove(resultTask1);
                    myPanel.revalidate();
                    myPanel.repaint();
                } else if (inputTask.getText().equals("2")) {
                    myPanel.remove(resultTask2);
                    myPanel.revalidate();
                    myPanel.repaint();
                } else if (inputTask.getText().equals("3")) {
                    myPanel.remove(resultTask3);
                    myPanel.revalidate();
                    myPanel.repaint();
                } else if (inputTask.getText().equals("4")) {
                    myPanel.remove(resultTask4);
                    myPanel.revalidate();
                    myPanel.repaint();
                } else if (inputTask.getText().equals("5")) {
                    myPanel.remove(resultTask5);
                    myPanel.revalidate();
                    myPanel.repaint();
                }

            }
        });
    }


}
