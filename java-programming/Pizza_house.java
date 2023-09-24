package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pizza_house {

    private JRadioButton medium$850RadioButton;
    private JCheckBox blackOlivesCheckBox;
    private JCheckBox mushroomsCheckBox;
    private JCheckBox cheeseCheckBox;
    private JCheckBox greenPepperCheckBox;
    private JRadioButton large$1000RadioButton;
    private JRadioButton small$650RadioButton;
    private JRadioButton thinCrustRadioButton;
    private JRadioButton mediumCrustRadioButton;
    private JRadioButton panRadioButton;
    private JButton processSelectionButton;
    private JTextArea Output;
    private JLabel ToppingLabel;
    private JPanel PizzaPanel;
    private JButton newOrderButton;


    public Pizza_house() {
        processSelectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Output.setText("");

                String PizzaType = " ", PizzaSize = " ", Toppings = " ", Pan = "Pan", Large = "Large", Medium = "Medium",
                       Thin = "Thin Crust", Small = "Small", BlackOlives = "BlackOlives ", Mushroom = "Mushroom ",
                       Cheese = "Cheese ", GreenPepper = "GreenPepper ";

                double AmountDue = 0, LargePizza, MediumPizza, SmallPizza;

                if (large$1000RadioButton.isSelected()) {

                    PizzaType += Large;
                    LargePizza = 10.00;
                    AmountDue += 0 + LargePizza;


                }


                if (medium$850RadioButton.isSelected()) {

                    PizzaType += Medium;
                    MediumPizza = 8.50;
                    AmountDue += 0 + MediumPizza;

                }


                if (small$650RadioButton.isSelected()) {

                    PizzaType += Small;
                    SmallPizza = 6.50;
                    AmountDue += 0 + SmallPizza;

                }


                if (thinCrustRadioButton.isSelected()) {

                    PizzaSize += Thin;

                }


                if (mediumCrustRadioButton.isSelected()) {

                    PizzaSize += Medium + " Crust";

                }


                if (panRadioButton.isSelected()) {

                    PizzaSize += Pan;

                }


                if (cheeseCheckBox.isSelected()) {

                    Toppings += Cheese;
                    AmountDue += 1.5;


                }


                if (greenPepperCheckBox.isSelected()) {

                    Toppings += GreenPepper;
                    AmountDue += 1.5;


                }


                if (blackOlivesCheckBox.isSelected()) {

                    Toppings += BlackOlives;
                    AmountDue += 1.5;

                }


                if (mushroomsCheckBox.isSelected()) {

                    Toppings += Mushroom;
                    AmountDue += 1.5;

                }

                Output.append("Pizza Type: " + PizzaType + "\n" + "Pizza Size: " + PizzaSize + "\n" + "Toppings: "
                        + Toppings + "\n" + "Amount Due: " + AmountDue);
            }

        });


        thinCrustRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (thinCrustRadioButton.isSelected()) {

                    mediumCrustRadioButton.setSelected(false);
                    panRadioButton.setSelected(false);

                }
            }
        });
        mediumCrustRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (mediumCrustRadioButton.isSelected()) {

                    thinCrustRadioButton.setSelected(false);
                    panRadioButton.setSelected(false);

                }
            }
        });
        panRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (panRadioButton.isSelected()) {

                    mediumCrustRadioButton.setSelected(false);
                    thinCrustRadioButton.setSelected(false);

                }
            }
        });
        small$650RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (small$650RadioButton.isSelected()) {

                    medium$850RadioButton.setSelected(false);
                    large$1000RadioButton.setSelected(false);

                }
            }
        });
        medium$850RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (medium$850RadioButton.isSelected()) {

                    small$650RadioButton.setSelected(false);
                    large$1000RadioButton.setSelected(false);

                }
            }
        });
        large$1000RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (large$1000RadioButton.isSelected()) {

                    medium$850RadioButton.setSelected(false);
                    small$650RadioButton.setSelected(false);

                }
            }
        });

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Grade");
        frame.setContentPane(new Pizza_house().PizzaPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}