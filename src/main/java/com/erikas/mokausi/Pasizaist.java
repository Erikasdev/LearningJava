package com.erikas.mokausi;

import javax.swing.JOptionPane.*;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Pasizaist {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        String name = showInputDialog("What is your name?");
        showMessageDialog(null, "You entered: " + name);

        int age = Integer.parseInt(showInputDialog("How old are you?"));
        showMessageDialog(null, "Your age is: " + age);






    }
}
