package heroes;

import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import items.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipArmWepTest {

    Mage mage;
    Armor armor;
    Weapon weapon;

    @BeforeEach
    void setUp() {
        mage = new Mage("Sorc");
    }

    @Test
    void testEquipArmor_throwsExceptionIfWrongType() {

        armor = new Armor("TarnHelm",1,Slot.Legs, new HeroAttributes(4,3,1),ArmorType.Mail );
        String expected = "You cant equip armor of type Mail";

        Exception exception = assertThrows(InvalidArmorException.class,
                () -> mage.equipArmor(armor));
        String actual = exception.getMessage();

        assertEquals(expected,actual);
    }

    @Test
    void testEquipArmor_throwsExceptionIfToLowLvl() {

        armor = new Armor("ClothHelm",5,Slot.Legs, new HeroAttributes(4,3,1),ArmorType.Cloth );
        String expected = "You are to low level to equip this piece of armor";

        Exception exception = assertThrows(InvalidArmorException.class,
                () -> mage.equipArmor(armor));
        String actual = exception.getMessage();

        assertEquals(expected,actual);
    }


    @Test
    void testEquipWeapon_throwsExceptionIfWrongType() {

        weapon = new Weapon("manSlayer", 1, WeaponType.Axes, 24 );;
        String expected = "You cant equip weapon of type Axes";

        Exception exception = assertThrows(InvalidWeaponException.class,
                () -> mage.equipWeapon(weapon));
        String actual = exception.getMessage();

        assertEquals(expected,actual);
    }

    @Test
    void testEquipWeapon_throwsExceptionIfToLowLvl() {

        weapon = new Weapon("Wand", 5, WeaponType.Wands, 24 );;
        String expected = "You are to low level to equip this weapon";

        Exception exception = assertThrows(InvalidWeaponException.class,
                () -> mage.equipWeapon(weapon));
        String actual = exception.getMessage();

        assertEquals(expected,actual);
    }


    @Test
    void testAttributesWithoutArmor() {
        HeroAttributes attributes = mage.getLevelAttributes();
        HeroAttributes attributesWithArm = mage.getTotalAttributes();

        assertEquals(attributes, attributesWithArm);
    }

    @Test
    void testAttributesWithArmor() throws InvalidArmorException {
         armor = new Armor("ClothPants",1,Slot.Legs, new HeroAttributes(4,3,10),ArmorType.Cloth );

        try {
            mage.equipArmor(armor);
        } catch (Exception ignored) {
        }
        HeroAttributes attributes = mage.getLevelAttributes();
        HeroAttributes attributesWithArm = mage.getTotalAttributes();


        attributes.addAttributes(4,3,10);
        assertEquals(attributes, attributesWithArm);
    }


}