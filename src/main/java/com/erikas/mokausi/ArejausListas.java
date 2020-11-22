package com.erikas.mokausi;

import java.util.ArrayList;

public class ArejausListas {
    public static void main(String[] args) {

        ArrayList<String> vardai = new ArrayList<String>();
        vardai.add("Erikas");
        vardai.add("Ieva");
        vardai.add("Toras");
        vardai.add("Valdas");


        vardai.remove(1);
        vardai.add(1, "Diana");

        for (String listas : vardai) {
            System.out.println(listas);
        }



    }
}
