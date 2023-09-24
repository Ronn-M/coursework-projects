package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grade {
    private JButton gradeButton;
    private JButton switchButton;
    private JPanel GradePanel;
    private JLabel Icon;

    String FinalEvaluationStr;
    String response;


    public Grade() {
        switchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                response = JOptionPane.showInputDialog("Pick a number 1, 2 and 3");

                if (response == null) {
                    JOptionPane.showMessageDialog(null, "you clicked the cancel button");
                    System.exit(0);
                } else if (response.equals("")) {
                    JOptionPane.showMessageDialog(null, "you must make an entry in the input box ");
                    System.exit(0);
                }

                switch (Integer.parseInt(response)) {

                    case 1:
                        JOptionPane.showMessageDialog(null, "you have entered number 1");
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, "you have entered number 2");
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "you have entered number 3");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Invalid Input");

                }
                System.exit(0);

            }

        });

        gradeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Midterm, FinalGrade, Research;

                Midterm = Integer.parseInt(JOptionPane.showInputDialog("ENTER MIDTERM GRADE:"));
                FinalGrade = Integer.parseInt(JOptionPane.showInputDialog("ENTER FINAL GRADE:"));
                Research = Integer.parseInt(JOptionPane.showInputDialog("ENTER RESEARCH GRADE:"));

                int FinalEvaluation = 1;

                switch (FinalEvaluation) {
                    case 1:

                        int FinalAverage = (Midterm + FinalGrade + Research) / 3;

                        if (FinalAverage >= 93)
                            FinalEvaluationStr = "A";
                        else if (FinalAverage < 93 && FinalAverage >= 85)
                            FinalEvaluationStr = "B";
                        else if (FinalAverage < 85 && FinalAverage >= 78)
                            FinalEvaluationStr = "C";
                        else if (FinalAverage < 78 && FinalAverage >= 70)
                            FinalEvaluationStr = "D";
                        else if (FinalAverage < 70)
                            FinalEvaluationStr = "E";

                        JOptionPane.showMessageDialog(null, "INTERMEDIATE PROGRAMMING\n\n" +
                                        "MIDTERM GRADE: " + Midterm + "\n" +
                                        "FINAL GRADE: " + FinalGrade + "\n" +
                                        "RESEARCH GRADE: " + Research + "\n" +
                                        "FINAL AVERAGE: " + FinalAverage + "\n" +
                                        "FINAL EVALUATION: " + FinalEvaluationStr,
                                "INTERMEDIATE PROGRAMMING", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Grade");
        frame.setContentPane(new Grade().GradePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}


