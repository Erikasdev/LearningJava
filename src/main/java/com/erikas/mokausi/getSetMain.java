package com.erikas.mokausi;

public class getSetMain {
    public static void main(String[] args) {




        getSet1 friend = new getSet1("Ieva", 30, "female");

        friend.setAge(13);


        System.out.println(friend.getGender());
        System.out.println(friend.getAge());
        System.out.println(friend.getName());


    }
}
