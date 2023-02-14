
import heroes.Warrior;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Voldemort");
        System.out.println(warrior);
        System.out.println(warrior.getLevelAttributes());
        System.out.println(warrior.getName());
        warrior.levelUp();
        System.out.println("tse" + warrior.getLevel());
    }
}