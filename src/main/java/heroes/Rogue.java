package heroes;

import utils.HeroAttributes;

public class Rogue extends Hero{
    public Rogue(String name) {
        super(name, new HeroAttributes(2,6,1));
    }
}
