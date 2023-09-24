package com.company;

import java.io.*;
import javax.swing.*;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Sales_Revenue {
    private JButton payslipButton;
    private JButton ShippingButton;
    private JPanel SalesRevenue;
    private JButton DlsudPayslipButton;

    static Scanner console = new Scanner(System.in);

    static final double GrossPay = 18282.80;
    static final double Pagibig = 100.00 ;
    static final double TaxableIncome = 18282.80 ;
    static final double WithholdingTax = 1696.23;
    static final double FacultyAssociation = 60.00;
    static final double CreditCoop = 4093.41;
    static final double arEmployees = 1720.17;
    static final double DlsudDevtCoop = 5052.00;
    static final double CEAP = 365.66;
    static final double TotalDeduction = 12987.47;
    static final double Netpay = 5195.33;

    public Sales_Revenue() {
        ShippingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double TotalPurchase = 0;
                double ShippingCharges = 0;
                double TotalCharges = 0;

                TotalPurchase = Double.parseDouble(JOptionPane.showInputDialog("ENTER THE TOTAL PURCHASE PRICE FOR SHIPPING COST AND TOTAL CHARGE:"));


               if (TotalPurchase <= 250.00 && TotalPurchase >= 0)
               {
                   ShippingCharges = 5.00;
                   TotalCharges = TotalPurchase + ShippingCharges;

                   JOptionPane.showMessageDialog(null, "*****DLSUD SALES AND SHIPPING***** \n" +
                           "\n  TOTAL PURCHASE : " + TotalPurchase +
                           "\n  SHIPPING CHARGE: " + ShippingCharges +
                           "\n  TOTAL CHARGE    : " + TotalCharges,
                           "*****DLSUD SALES AND SHIPPING*****", JOptionPane.INFORMATION_MESSAGE);
                   System.exit(0);
               }

               else if (TotalPurchase <= 500.00 && TotalPurchase >= 250.01)
               {
                   ShippingCharges = 8.00;
                   TotalCharges = TotalPurchase + ShippingCharges;

                   JOptionPane.showMessageDialog(null, "*****DLSUD SALES AND SHIPPING***** \n" +
                                   "\n  TOTAL PURCHASE : " + TotalPurchase +
                                   "\n  SHIPPING CHARGE: " + ShippingCharges +
                                   "\n  TOTAL CHARGE    : " + TotalCharges,
                           "*****DLSUD SALES AND SHIPPING*****", JOptionPane.INFORMATION_MESSAGE);
                   System.exit(0);
               }

                else if (TotalPurchase <= 1000.00 && TotalPurchase >= 500.01)
                {
                   ShippingCharges = 10.00;
                   TotalCharges = TotalPurchase + ShippingCharges;

                    JOptionPane.showMessageDialog(null, "*****DLSUD SALES AND SHIPPING***** \n" +
                                    "\n  TOTAL PURCHASE : " + TotalPurchase +
                                    "\n  SHIPPING CHARGE: " + ShippingCharges +
                                    "\n  TOTAL CHARGE    : " + TotalCharges,
                            "*****DLSUD SALES AND SHIPPING*****", JOptionPane.INFORMATION_MESSAGE);
                   System.exit(0);
                }

                else if (TotalPurchase <= 5000 && TotalPurchase >= 1000.01)
                {
                   ShippingCharges = 15.00;
                   TotalCharges = TotalPurchase + ShippingCharges;

                    JOptionPane.showMessageDialog(null, "*****DLSUD SALES AND SHIPPING***** \n" +
                                    "\n  TOTAL PURCHASE : " + TotalPurchase +
                                    "\n  SHIPPING CHARGE: " + ShippingCharges +
                                    "\n  TOTAL CHARGE    : " + TotalCharges,
                            "*****DLSUD SALES AND SHIPPING*****", JOptionPane.INFORMATION_MESSAGE);
                   System.exit(0);
                }

                else if(TotalPurchase > 5000)
                {
                   ShippingCharges = 20.00;
                   TotalCharges = TotalPurchase + ShippingCharges;

                    JOptionPane.showMessageDialog(null, "*****DLSUD SALES AND SHIPPING***** \n" +
                                    "\n  TOTAL PURCHASE : " + TotalPurchase +
                                    "\n  SHIPPING CHARGE: " + ShippingCharges +
                                    "\n  TOTAL CHARGE    : " + TotalCharges,
                            "*****DLSUD SALES AND SHIPPING*****", JOptionPane.INFORMATION_MESSAGE);
                   System.exit(0);
                }
            }
        });
        DlsudPayslipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double GrossAmount, FederalTax, StateTax, SocialSecurityTax, MedicareMedicaidTax, PensionPlan, HealthInsurance;
                String EmployeeName;


                PrintWriter outfile = null;
                try {
                    outfile = new PrintWriter( "mashava.txt");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }

                EmployeeName = JOptionPane.showInputDialog(null, "ENTER EMPLOYEE NAME: ");
                GrossAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "ENTER GROSS AMOUNT: "));


                outfile.println(EmployeeName);
                outfile.printf("EARNINGS            :\n");
                outfile.printf("BASIC RATE          : $%8.2f %n", GrossAmount);
                outfile.printf("                ...........................\n");
                outfile.printf("GROSS PAY           : $%8.2f %n", GrossPay);
                outfile.printf("PAGIBIG             : $%8.2f %n", Pagibig);
                outfile.printf("                ...........................\n");
                outfile.printf("TAXABLE INCOME      : $%8.2f %n", TaxableIncome);
                outfile.printf("                ...........................\n");
                outfile.printf("WITHHOLDING TAX     : $%8.2f %n", WithholdingTax);
                outfile.printf("FACULTY ASSOCIATION : $%8.2f %n", FacultyAssociation);
                outfile.printf("CREDIT COOP         : $%8.2f %n",CreditCoop);
                outfile.printf("A/R-EMPLOYEES       : $%8.2f %n", arEmployees);
                outfile.printf("DLSU-D DEVT COOP    : $%8.2f %n", DlsudDevtCoop);
                outfile.printf("CEAP                : $%8.2f %n", CEAP);
                outfile.printf("                ...........................\n");
                outfile.printf("TOTAL DEDUCTION     : $%8.2f %n", TotalDeduction);
                outfile.printf("                ...........................\n");
                outfile.printf("NET PAY             : $%8.2f %n", Netpay);
                outfile.printf("                ...........................\n");
                outfile.printf("                ...........................\n");
                outfile.close();

                JOptionPane.showMessageDialog(null, "PAYSLIP FOR: " + EmployeeName +
                                                "\n" + "EARNINGS             : " + "\n" +
                                                       "BASIC RATE           : " + "\n" + GrossAmount +
                                                       "GROSS PAY            : " + GrossPay +
                                                       "PAGIBIG             : " + Pagibig + "\n" +
                        "TAXABLE INCOME             : " + TaxableIncome +"\n" +
                        "WITHHOLDING TAX             : " + WithholdingTax + "\n" +
                        "FACULTY ASSOCIATION             : " + FacultyAssociation + "\n" +
                        "CREDIT COOP             : " + CreditCoop + "\n" +
                        "A/R-EMPLOYEES             : " + arEmployees + "\n" +
                        "DLSU-D DEVT COOP              : " + DlsudDevtCoop + "\n" +
                        "CEAP             : " + CEAP + "\n" +
                        "TOTAL DEDUCTION             : " + TotalDeduction + "\n" +
                        "NET PAY              : " + Netpay +"\n",
                        "*****DLSUD PAYSLIP*****", JOptionPane.INFORMATION_MESSAGE);

            }
        });
    }
    public static void main(String[] args) throws FileNotFoundException {

        JFrame frame = new JFrame("Grade");
        frame.setContentPane(new Sales_Revenue().SalesRevenue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
