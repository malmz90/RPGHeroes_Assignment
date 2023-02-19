package heroes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    Warrior warrior;
    @BeforeEach
    public void setup() {
        warrior = new Warrior("War");
    }

    @Test
    public void testGetName_returnsExpectedName(){
        Assertions.assertEquals(warrior.getName(),"War");
    }
    @Test
    public void testGetLevel_returnsExpectedLevel() {
        Assertions.assertEquals(warrior.getLevel(),1);
    }

    @Test
    public void testGetTotalAttributes_ReturnsExpectedAttributes() {
        HeroAttributes expectedAttributes = new HeroAttributes(5,2,1);
        HeroAttributes actualAttributes = warrior.getTotalAttributes();
        assertEquals(expectedAttributes, actualAttributes);
    }
    @Test
    public void testLevelUp_returnsCorrectAttributes() {

        HeroAttributes expected = new HeroAttributes(8,4,2);

        warrior.levelUp();
        HeroAttributes actual = warrior.getTotalAttributes();

        assertEquals(expected,actual);
    }

}