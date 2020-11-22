package fileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args){


        try {
            FileWriter writer = new FileWriter("emails.txt");
            String[] names = {"Erikas", "Ieva", "Toras", "Valdas", "Diana", "Angele"};
            int emailCount = 0;


            for (String email : names) {
                Random random = new Random();
                int randomNumber = random.nextInt(9999) + 1000;
                emailCount++;
                String generatedEmail;
                generatedEmail = emailCount + ". " + email + randomNumber + "@gmail.com";
                System.out.println(generatedEmail);
                writer.write(generatedEmail + "\n");

            }
            writer.close();

        }

            catch (IOException e) {
                e.printStackTrace();
            }







    }
}
