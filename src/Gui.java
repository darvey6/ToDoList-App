import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    private JTextField inputTask;
    private JPanel myPanel;
    private JButton addButton;
    private JLabel resultTask1;
    private JButton deleteTaskButton;
    private JLabel resultTask2;
    private JLabel resultTask3;
    private JLabel resultTask4;
    private JLabel resultTask5;
    private JCheckBox a1CheckBox;
    private JCheckBox a2CheckBox;
    private JCheckBox a3CheckBox;
    private JCheckBox a4CheckBox;
    private JCheckBox a5CheckBox;
    private JProgressBar progressBar1;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Darvey's To-Do List");
        frame.setContentPane(new Gui().myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public Gui() {
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

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        myPanel = new JPanel();
        myPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(9, 3, new Insets(0, 0, 0, 0), -1, -1));
        myPanel.setBackground(new Color(-4475525));
        myPanel.setMinimumSize(new Dimension(250, 250));
        myPanel.setToolTipText("");
        addButton = new JButton();
        Font addButtonFont = this.$$$getFont$$$("American Typewriter", -1, -1, addButton.getFont());
        if (addButtonFont != null) addButton.setFont(addButtonFont);
        addButton.setForeground(new Color(-14173403));
        addButton.setText("Add Task");
        myPanel.add(addButton, new com.intellij.uiDesigner.core.GridConstraints(6, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        inputTask = new JTextField();
        Font inputTaskFont = this.$$$getFont$$$("Apple Chancery", -1, -1, inputTask.getFont());
        if (inputTaskFont != null) inputTask.setFont(inputTaskFont);
        inputTask.setText("");
        myPanel.add(inputTask, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        deleteTaskButton = new JButton();
        Font deleteTaskButtonFont = this.$$$getFont$$$("American Typewriter", -1, -1, deleteTaskButton.getFont());
        if (deleteTaskButtonFont != null) deleteTaskButton.setFont(deleteTaskButtonFont);
        deleteTaskButton.setForeground(new Color(-4513495));
        deleteTaskButton.setText("Clear All Tasks");
        myPanel.add(deleteTaskButton, new com.intellij.uiDesigner.core.GridConstraints(7, 2, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        resultTask2 = new JLabel();
        Font resultTask2Font = this.$$$getFont$$$("Apple Chancery", -1, -1, resultTask2.getFont());
        if (resultTask2Font != null) resultTask2.setFont(resultTask2Font);
        resultTask2.setText("Task");
        myPanel.add(resultTask2, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        resultTask3 = new JLabel();
        Font resultTask3Font = this.$$$getFont$$$("Apple Chancery", -1, -1, resultTask3.getFont());
        if (resultTask3Font != null) resultTask3.setFont(resultTask3Font);
        resultTask3.setText("Task ");
        myPanel.add(resultTask3, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        resultTask1 = new JLabel();
        Font resultTask1Font = this.$$$getFont$$$("Apple Chancery", -1, -1, resultTask1.getFont());
        if (resultTask1Font != null) resultTask1.setFont(resultTask1Font);
        resultTask1.setText("Task ");
        myPanel.add(resultTask1, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        resultTask4 = new JLabel();
        Font resultTask4Font = this.$$$getFont$$$("Apple Chancery", -1, -1, resultTask4.getFont());
        if (resultTask4Font != null) resultTask4.setFont(resultTask4Font);
        resultTask4.setText("Task ");
        myPanel.add(resultTask4, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        resultTask5 = new JLabel();
        Font resultTask5Font = this.$$$getFont$$$("Apple Chancery", -1, -1, resultTask5.getFont());
        if (resultTask5Font != null) resultTask5.setFont(resultTask5Font);
        resultTask5.setText("Task ");
        myPanel.add(resultTask5, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a1CheckBox = new JCheckBox();
        Font a1CheckBoxFont = this.$$$getFont$$$("Bodoni Ornaments", -1, 20, a1CheckBox.getFont());
        if (a1CheckBoxFont != null) a1CheckBox.setFont(a1CheckBoxFont);
        a1CheckBox.setForeground(new Color(-10842693));
        a1CheckBox.setText("1");
        myPanel.add(a1CheckBox, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a2CheckBox = new JCheckBox();
        Font a2CheckBoxFont = this.$$$getFont$$$("Bodoni Ornaments", -1, 20, a2CheckBox.getFont());
        if (a2CheckBoxFont != null) a2CheckBox.setFont(a2CheckBoxFont);
        a2CheckBox.setForeground(new Color(-10842693));
        a2CheckBox.setText("2");
        myPanel.add(a2CheckBox, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a3CheckBox = new JCheckBox();
        Font a3CheckBoxFont = this.$$$getFont$$$("Bodoni Ornaments", -1, 20, a3CheckBox.getFont());
        if (a3CheckBoxFont != null) a3CheckBox.setFont(a3CheckBoxFont);
        a3CheckBox.setForeground(new Color(-10842693));
        a3CheckBox.setHideActionText(true);
        a3CheckBox.setText("3");
        myPanel.add(a3CheckBox, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a4CheckBox = new JCheckBox();
        Font a4CheckBoxFont = this.$$$getFont$$$("Bodoni Ornaments", -1, 20, a4CheckBox.getFont());
        if (a4CheckBoxFont != null) a4CheckBox.setFont(a4CheckBoxFont);
        a4CheckBox.setForeground(new Color(-10842693));
        a4CheckBox.setSelected(true);
        a4CheckBox.setText("4");
        myPanel.add(a4CheckBox, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a5CheckBox = new JCheckBox();
        Font a5CheckBoxFont = this.$$$getFont$$$("Bodoni Ornaments", -1, 24, a5CheckBox.getFont());
        if (a5CheckBoxFont != null) a5CheckBox.setFont(a5CheckBoxFont);
        a5CheckBox.setForeground(new Color(-10842693));
        a5CheckBox.setHideActionText(true);
        a5CheckBox.setText("5");
        myPanel.add(a5CheckBox, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        progressBar1 = new JProgressBar();
        progressBar1.setBackground(new Color(-14796991));
        progressBar1.setForeground(new Color(-16777216));
        progressBar1.setIndeterminate(false);
        progressBar1.setString("0%  Done");
        progressBar1.setStringPainted(true);
        myPanel.add(progressBar1, new com.intellij.uiDesigner.core.GridConstraints(8, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return myPanel;
    }
}
