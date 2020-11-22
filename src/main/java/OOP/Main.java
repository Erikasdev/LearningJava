package OOP;

public class Main {
    public static void main(String[] args){

        Character character1 = new Character("Night elf", "Hunter", "Alliance", 55);
        Character character2 = new Character("Orc", "Warrior", "Horde", 20);

        Email email1 = new Email("Erikas", "Gmail");
        Email email2 = new Email("Ieva", "Yahoo");


        email1.Create();
        email1.Create();
        email2.Create();
        email2.Create();
        email2.Create();



    }
}
