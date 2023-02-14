package heroes;

import utils.HeroAttributes;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name, new HeroAttributes(5,2,1));
    }

}
