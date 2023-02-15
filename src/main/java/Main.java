
import heroes.HeroAttributes;
import heroes.Warrior;
import items.*;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Voldemort");
        System.out.println(warrior);
        System.out.println(warrior.getLevelAttributes());
        System.out.println(warrior.getName());
        warrior.levelUp();
        System.out.println(warrior.getLevelAttributes());
        System.out.println("tse" + warrior.getLevel());

        Weapon weapon = new Weapon("manSlayer", 4, WeaponType.Axes, 24 );
        System.out.println(weapon);
        System.out.println(weapon.getSlot());

        Armor armor = new Armor("LeatherPants",4,Slot.Legs, new HeroAttributes(1,3,1),ArmorType.Leather );
        System.out.println(armor);
    }
}