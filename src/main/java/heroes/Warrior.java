package heroes;

import items.ArmorType;
import items.WeaponType;

import java.util.ArrayList;
import java.util.Arrays;

public class Warrior extends Hero {

    public Warrior(String name)

    {
        super(name,new HeroAttributes(5,2,1));
        validWeaponTypes = new ArrayList<>(Arrays.asList(WeaponType.Axes,WeaponType.Hammers,WeaponType.Swords));
        validArmorTypes = new ArrayList<>(Arrays.asList(ArmorType.Mail,ArmorType.Plate));
    }

    @Override
    public void levelUp() {
        levelAttributes.addAttributes(3,2,1);
        super.levelUp();
    }

    @Override public int getDamageAttribute(HeroAttributes attributes) {
        return attributes.getStrength();
    }
}
