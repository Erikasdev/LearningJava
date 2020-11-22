package OOP;

public class Character {

    String race;
    String profession;
    String faction;
    int level;


    Character(String race, String profession, String faction, int level){
        this.race = race;
        this.profession = profession;
        this.faction = faction;
        this.level = level;
    }

    void attack() {
        System.out.println(this.race + " " + this.profession + " starts attacking!");
    }

    void death() {
        System.out.println(this.race + " " + this.profession + " dies");
    }

    void levelUp() {
        System.out.println(this.profession + " " + this.level + " just leveled up to level: " + (this.level+1));
    }







}
