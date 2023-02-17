package heroes;

import items.ArmorType;
import items.WeaponType;

import java.util.ArrayList;
import java.util.Arrays;

public class Rogue extends Hero{
    public Rogue(String name) {
        super(name, new HeroAttributes(2,6,1));
        validWeaponTypes = new ArrayList<>(Arrays.asList(WeaponType.Swords,WeaponType.Daggers));
        validArmorTypes = new ArrayList<>(Arrays.asList(ArmorType.Leather,ArmorType.Mail));
    }

    @Override
    public void levelUp() {
        levelAttributes.addAttributes(1,4,1);
        super.levelUp();
    }

    @Override public int getDamageAttribute(HeroAttributes attributes) {
        return attributes.getDexterity();
    }
}
