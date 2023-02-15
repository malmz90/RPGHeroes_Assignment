package heroes;

import items.ArmorType;
import items.WeaponType;

import java.util.ArrayList;
import java.util.Arrays;

public class Mage extends Hero {
    public Mage(String name) {
        super(name, new HeroAttributes(1,1,8));
        validWeaponTypes = new ArrayList<>(Arrays.asList(WeaponType.Staffs,WeaponType.Wands));
        validArmorTypes = new ArrayList<>(Arrays.asList(ArmorType.Cloth));
    }

    @Override
    public void levelUp() {
        levelAttributes.addAttributes(1,1,5);
        super.levelUp();
    }
}
