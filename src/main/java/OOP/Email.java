package OOP;

import java.util.Random;

public class Email {

    String name;
    String emailProvider;


    Email(String name, String emailProvider){
        this.name = name;
        this.emailProvider = emailProvider;

    }
    void Create() {
        System.out.println("Creating an email with given values....");

        Random random = new Random();
        int randomized = random.nextInt(9999)+1000;

        System.out.println(this.name + randomized + "@" + this.emailProvider + ".com");
    }




}
