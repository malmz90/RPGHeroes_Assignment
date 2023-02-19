package heroes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangerTest {
    Ranger ranger;
    @BeforeEach
    public void setup() {
        ranger = new Ranger("Rang");
    }

    @Test
    public void testGetName_returnsExpectedName(){
        Assertions.assertEquals(ranger.getName(),"Rang");
    }
    @Test
    public void testGetLevel_returnsExpectedLevel() {
        Assertions.assertEquals(ranger.getLevel(),1);
    }

    @Test
    public void testGetTotalAttributes_ReturnsExpectedAttributes() {
        HeroAttributes expectedAttributes = new HeroAttributes(1,7,1);
        HeroAttributes actualAttributes = ranger.getTotalAttributes();
        assertEquals(expectedAttributes, actualAttributes);
    }
    @Test
    public void testLevelUp_returnsCorrectAttributes() {

        HeroAttributes expected = new HeroAttributes(2,12,2);

        ranger.levelUp();
        HeroAttributes actual = ranger.getTotalAttributes();

        assertEquals(expected,actual);
    }

}