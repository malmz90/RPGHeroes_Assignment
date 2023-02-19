package heroes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RogueTest {

    Rogue rogue;
    @BeforeEach
    public void setup() {
        rogue = new Rogue("Rang");
    }

    @Test
    public void testGetName_returnsExpectedName(){
        Assertions.assertEquals(rogue.getName(),"Rang");
    }
    @Test
    public void testGetLevel_returnsExpectedLevel() {
        Assertions.assertEquals(rogue.getLevel(),1);
    }

    @Test
    public void testGetTotalAttributes_ReturnsExpectedAttributes() {
        HeroAttributes expectedAttributes = new HeroAttributes(2,6,1);
        HeroAttributes actualAttributes = rogue.getTotalAttributes();
        assertEquals(expectedAttributes, actualAttributes);
    }
    @Test
    public void testLevelUp_returnsCorrectAttributes() {

        HeroAttributes expected = new HeroAttributes(3,10,2);

        rogue.levelUp();
        HeroAttributes actual = rogue.getTotalAttributes();

        assertEquals(expected,actual);
    }

}