package ui;

import javax.swing.*;
import java.awt.*;

public class SetUpUI{
    protected JCheckBox a1CheckBox;
    protected JCheckBox a2CheckBox;
    protected JCheckBox a3CheckBox;
    protected JCheckBox a4CheckBox;
    protected JCheckBox a5CheckBox;
    protected JProgressBar progressBar1;
    protected JTextField inputTask;
    protected JPanel myPanel;
    protected JButton addButton;
    protected JLabel resultTask1;
    protected JButton deleteTaskButton;
    protected JLabel resultTask2;
    protected JLabel resultTask3;
    protected JLabel resultTask4;
    protected JLabel resultTask5;

    public SetUpUI(){

    }

    protected void setup(){
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
        deleteTaskButton.setText("Clear Task");
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
        Font a1CheckBoxFont = this.$$$getFont$$$("Bodoni Ornaments", -1, -1, a1CheckBox.getFont());
        if (a1CheckBoxFont != null) a1CheckBox.setFont(a1CheckBoxFont);
        a1CheckBox.setForeground(new Color(-9850949));
        a1CheckBox.setText("1");
        myPanel.add(a1CheckBox, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a2CheckBox = new JCheckBox();
        Font a2CheckBoxFont = this.$$$getFont$$$("Bodoni Ornaments", -1, -1, a2CheckBox.getFont());
        if (a2CheckBoxFont != null) a2CheckBox.setFont(a2CheckBoxFont);
        a2CheckBox.setForeground(new Color(-9850949));
        a2CheckBox.setText("2");
        myPanel.add(a2CheckBox, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a3CheckBox = new JCheckBox();
        Font a3CheckBoxFont = this.$$$getFont$$$("Bodoni Ornaments", -1, -1, a3CheckBox.getFont());
        if (a3CheckBoxFont != null) a3CheckBox.setFont(a3CheckBoxFont);
        a3CheckBox.setForeground(new Color(-9850949));
        a3CheckBox.setText("3");
        myPanel.add(a3CheckBox, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a4CheckBox = new JCheckBox();
        Font a4CheckBoxFont = this.$$$getFont$$$("Bodoni Ornaments", -1, -1, a4CheckBox.getFont());
        if (a4CheckBoxFont != null) a4CheckBox.setFont(a4CheckBoxFont);
        a4CheckBox.setForeground(new Color(-9850949));
        a4CheckBox.setText("4");
        myPanel.add(a4CheckBox, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a5CheckBox = new JCheckBox();
        Font a5CheckBoxFont = this.$$$getFont$$$("Bodoni Ornaments", -1, -1, a5CheckBox.getFont());
        if (a5CheckBoxFont != null) a5CheckBox.setFont(a5CheckBoxFont);
        a5CheckBox.setForeground(new Color(-9850949));
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


}
