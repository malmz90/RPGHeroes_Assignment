package heroes;

import items.ArmorType;
import items.WeaponType;

import java.util.ArrayList;
import java.util.Arrays;

public class Ranger extends Hero{

    public Ranger(String name){
        super(name, new HeroAttributes(1,7,1));

        validWeaponTypes = new ArrayList<>(Arrays.asList(WeaponType.Bows));
        validArmorTypes = new ArrayList<>(Arrays.asList(ArmorType.Mail,ArmorType.Leather));
    }

    @Override
    public void levelUp() {
        levelAttributes.addAttributes(1,5,1);
        super.levelUp();
    }

    @Override public int getDamageAttribute(HeroAttributes attributes) {
        return attributes.getDexterity();
    }
}
