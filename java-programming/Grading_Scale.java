package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SchoolBook_Grading_Scale {
    private JButton SCHOOLBOOKGRADINGSCALEButton;
    private JPanel SbGS;

    String GradeSymbol;
    double  GradeScore;


    public SchoolBook_Grading_Scale() {
        SCHOOLBOOKGRADINGSCALEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int     Midterm,
                        FinalGrade,
                        Prelim;

                Midterm = Integer.parseInt(JOptionPane.showInputDialog("ENTER PRELIM GRADE:"));
                FinalGrade = Integer.parseInt(JOptionPane.showInputDialog("ENTER MIDTERM GRADE:"));
                Prelim = Integer.parseInt(JOptionPane.showInputDialog("ENTER FINAL GRADE:"));

                int Percent = (Midterm + FinalGrade + Prelim) / 3;

                switch (Percent) {
                    case 100:
                    case 99:
                    case 98:

                        GradeSymbol = "A";
                        GradeScore = 4.00;

                        JOptionPane.showMessageDialog(null, "GRADE: " + GradeScore + "    " + "LETTER%: " + GradeSymbol + "    " + "MINIMUM%: " + Percent);
                        System.exit(0);

                        break;


                    case 97:
                    case 96:
                    case 95:

                        GradeSymbol = "B";
                        GradeScore = 3.75;

                        JOptionPane.showMessageDialog(null, "GRADE: " + GradeScore + "    " + "LETTER%: " + GradeSymbol + "    " + "MINIMUM%: " + Percent);
                        System.exit(0);

                        break;

                    case 94:
                    case 93:
                    case 92:

                        GradeSymbol = "C";
                        GradeScore = 3.50;

                        JOptionPane.showMessageDialog(null, "GRADE: " + GradeScore + "    " + "LETTER%: " + GradeSymbol + "    " + "MINIMUM%: " + Percent);
                        System.exit(0);

                        break;

                    case 91:
                    case 90:
                    case 89:

                        GradeSymbol = "D";
                        GradeScore = 3.25;

                        JOptionPane.showMessageDialog(null, "GRADE: " + GradeScore + "    " + "LETTER%: " + GradeSymbol + "    " + "MINIMUM%: " + Percent);
                        System.exit(0);

                        break;

                    case 88:
                    case 87:
                    case 86:

                        GradeSymbol = "E";
                        GradeScore = 3.00;

                        JOptionPane.showMessageDialog(null, "GRADE: " + GradeScore + "    " + "LETTER%: " + GradeSymbol + "    " + "MINIMUM%: " + Percent);
                        System.exit(0);

                        break;

                    case 85:
                    case 84:
                    case 83:

                        GradeSymbol = "F";
                        GradeScore = 2.75;

                        JOptionPane.showMessageDialog(null, "GRADE: " + GradeScore + "    " + "LETTER%: " + GradeSymbol + "    " + "MINIMUM%: " + Percent);
                        System.exit(0);

                        break;

                    case 82:
                    case 81:
                    case 80:

                        GradeSymbol = "G";
                        GradeScore = 2.50;

                        JOptionPane.showMessageDialog(null, "GRADE: " + GradeScore + "    " + "LETTER%: " + GradeSymbol + "    " + "MINIMUM%: " + Percent);
                        System.exit(0);

                        break;

                    case 79:
                    case 78:
                    case 77:

                        GradeSymbol = "H";
                        GradeScore = 2.25;

                        JOptionPane.showMessageDialog(null, "GRADE: " + GradeScore + "    " + "LETTER%: " + GradeSymbol + "    " + "MINIMUM%: " + Percent);
                        System.exit(0);

                        break;

                    case 76:
                    case 75:
                    case 74:

                        GradeSymbol = "I";
                        GradeScore = 2.00;

                        JOptionPane.showMessageDialog(null, "GRADE: " + GradeScore + "    " + "LETTER%: " + GradeSymbol + "    " + "MINIMUM%: " + Percent);
                        System.exit(0);

                        break;

                    case 73:
                    case 72:
                    case 71:

                        GradeSymbol = "J";
                        GradeScore = 1.75;

                        JOptionPane.showMessageDialog(null, "GRADE: " + GradeScore + "    " + "LETTER%: " + GradeSymbol + "    " + "MINIMUM%: " + Percent);
                        System.exit(0);

                        break;


                    case 70:
                    case 69:
                    case 68:

                        GradeSymbol = "K";
                        GradeScore = 1.50;

                        JOptionPane.showMessageDialog(null, "GRADE: " + GradeScore + "    " + "LETTER%: " + GradeSymbol + "    " + "MINIMUM%: " + Percent);
                        System.exit(0);

                        break;

                    case 67:
                    case 66:
                    case 65:
                    case 64:

                        GradeSymbol = "L";
                        GradeScore = 1.25;

                        JOptionPane.showMessageDialog(null, "GRADE: " + GradeScore + "    " + "LETTER%: " + GradeSymbol + "    " + "MINIMUM%: " + Percent);
                        System.exit(0);

                        break;

                    case 63:
                    case 62:
                    case 61:
                    case 60:

                        GradeSymbol = "M";
                        GradeScore = 1.00;

                        JOptionPane.showMessageDialog(null, "GRADE: " + GradeScore + "    " + "LETTER%: " + GradeSymbol + "    " + "MINIMUM%: " + Percent);
                        System.exit(0);

                        break;
                }

                if (Percent < 60)

                    GradeSymbol = "N";
                    GradeScore = 0.0;

                    JOptionPane.showMessageDialog(null, "GRADE: " + GradeScore + "    " + "LETTER%: " + GradeSymbol + "    " + "MINIMUM%: " + Percent);
                    System.exit(0);

                    /*JOptionPane.showMessageDialog(null, "SCHOOLBOOK GRADING SCALE\n\n" +
                                        "PRELIM GRADE: " + Midterm + "      " +
                                        "MIDTERM GRADE: " + FinalGrade + "    " +
                                        "FINAL GRADE: " + Prelim + "    " +
                                        "GRADE: " + GradeScore + "    " +
                                        "MINIMUM%: " + Percent + "      " +
                                        "LETTER%: " + GradeSymbol,
                                "SCHOOLBOOK GRADING SCALE", JOptionPane.INFORMATION_MESSAGE);
                    */
                }

        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Grade");
        frame.setContentPane(new SchoolBook_Grading_Scale().SbGS);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}