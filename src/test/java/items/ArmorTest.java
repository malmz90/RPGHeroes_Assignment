package items;

import heroes.HeroAttributes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmorTest {
    Armor armor;

    @BeforeEach
    public void setup() {
        armor = new Armor("MailPants",1,Slot.Legs, new HeroAttributes(3,2,1),ArmorType.Mail );
    }

    @Test
    public void testGetName_returnsExpectedName(){
        Assertions.assertEquals(armor.getName(),"MailPants");
    }
    @Test
    public void testGetRequiredLevel_returnsExpectedLevel(){
        Assertions.assertEquals(armor.getRequiredLevel(),1);
    }

    @Test
    public void testGetArmorType_returnsExpectedType(){
        Assertions.assertEquals(armor.getArmorType(),ArmorType.Mail);
    }
    @Test
    public void testGetSlot_returnsExpectedSlot(){
        Assertions.assertEquals(armor.getSlot(), Slot.Legs);
    }

    @Test
    public void testGetArmorAttributes_returnsExpectedAttributes(){
        Assertions.assertEquals(armor.getArmorAttributes().getStrength(), 3);
        Assertions.assertEquals(armor.getArmorAttributes().getDexterity(), 2);
        Assertions.assertEquals(armor.getArmorAttributes().getIntelligence(), 1);
    }

}