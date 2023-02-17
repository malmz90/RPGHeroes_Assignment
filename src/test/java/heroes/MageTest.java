package heroes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {
    Mage mage;
    @BeforeEach
    public void setup() {
        mage = new Mage("Sorc");
    }

    @Test
    public void testGetName_returnsExpectedName(){
        Assertions.assertEquals(mage.getName(),"Sorc");
    }
    @Test
    public void testGetLevel_returnsExpectedLevel() {
        Assertions.assertEquals(mage.getLevel(),1);
    }

    @Test
    public void testGetTotalAttributes_ReturnsExpectedAttributes() {
        HeroAttributes expectedAttributes = new HeroAttributes(1,1,8);
        HeroAttributes actualAttributes = mage.getTotalAttributes();
        assertEquals(expectedAttributes, actualAttributes);
    }
    @Test
    public void testLevelUp_returnsCorrectAttributes() {

        HeroAttributes expected = new HeroAttributes(1+1,1+1,8+5);

        mage.levelUp();
        HeroAttributes actual = mage.getTotalAttributes();

        assertEquals(expected,actual);
    }




/*    @Test
    void levelUp() {
    }

    @Test
    void getDamageAttribute() {
    }*/
}