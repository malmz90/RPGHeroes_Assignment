package items;

import heroes.Mage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    Weapon weapon;

    @BeforeEach
    public void setup() {
       weapon = new Weapon("manSlayer", 3, WeaponType.Axes, 24 );
    }

    @Test
    public void testGetName_returnsExpectedName(){
        Assertions.assertEquals(weapon.getName(),"manSlayer");
    }

    @Test
    public void testGetRequiredLevel_returnsExpectedLevel(){
        Assertions.assertEquals(weapon.getRequiredLevel(),3);
    }

    @Test
    public void testGetWeaponType_returnsExpectedType(){
        Assertions.assertEquals(weapon.getWeaponType(),WeaponType.Axes);
    }
    @Test
    public void testGetSlot_returnsExpectedSlot(){
        Assertions.assertEquals(weapon.getSlot(), Slot.Weapon);
    }

    @Test
    public void testGetWeaponDamage_returnsExpectedDamage(){
        Assertions.assertEquals(weapon.getWeaponDamage(),24);
    }
}