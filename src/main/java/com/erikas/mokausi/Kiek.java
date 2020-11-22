package com.erikas.mokausi;

import javax.swing.*;
import java.util.Random;



public class Kiek {
    public static void main(String[] args){
        Random random = new Random();
        int checkNumber = random.nextInt(100)+1;
        int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        int counter = 1;
        for (int number = checkNumber; number != userNumber; number = checkNumber) {
            checkNumber = random.nextInt(100)+1;
            System.out.println("Randomized number: " + number + " is not equal to " + userNumber);
            counter++;
        }
            JOptionPane.showMessageDialog(null, "Program failed: " + counter + " times");











    }
}
