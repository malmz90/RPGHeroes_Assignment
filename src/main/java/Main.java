
import heroes.HeroAttributes;
import heroes.Warrior;
import items.*;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Voldemort");

        warrior.levelUp();

        Weapon weapon = new Weapon("manSlayer", 6, WeaponType.Axes, 24 );

        Armor armor = new Armor("LeatherPants",1,Slot.Legs, new HeroAttributes(1,3,1),ArmorType.Mail );
        System.out.println(armor.getSlot());
        warrior.equipWeapon(weapon);
        warrior.equipArmor(armor);
        System.out.println(warrior);
    }
}