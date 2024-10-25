package me.astrozdenek;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // What do we want to calculate
        String whatDoWeWantToCalculate = JOptionPane.showInputDialog("Velocity Calculator\nType v/s/t for calculating it.");

        // Main switch of the program
        switch (whatDoWeWantToCalculate) {
            case "v" -> {
                double s = Double.parseDouble(JOptionPane.showInputDialog("Now, type distance (s):"));

                double t = Double.parseDouble(JOptionPane.showInputDialog("Now, type time (t):"));

                String units = JOptionPane.showInputDialog("Choose units for the result. (optional)");

                double output = s / t;

                JOptionPane.showMessageDialog(null, "v = " + output + " " + units);
            }
            case "s" -> {
                double v = Double.parseDouble(JOptionPane.showInputDialog("Now, type velocity (v):"));

                double t = Double.parseDouble(JOptionPane.showInputDialog("Now, type time (t):"));

                String units = JOptionPane.showInputDialog("Choose units for the result. (optional)");

                double output = v * t;

                JOptionPane.showMessageDialog(null, "s = " + output  + " " + units);
            }
            case "t" -> {
                double s = Double.parseDouble(JOptionPane.showInputDialog("Now, type distance (s):"));

                double v = Double.parseDouble(JOptionPane.showInputDialog("Now, type velocity (v):"));

                String units = JOptionPane.showInputDialog("Choose units for the result. (optional)");

                double output = s / v;

                JOptionPane.showMessageDialog(null, "t = " + output + " " + units);
            }
            case null, default -> JOptionPane.showMessageDialog(null, "An error has occurred. Try again!");
        }
    }
}