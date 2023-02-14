package heroes;

import utils.HeroAttributes;

public class Ranger extends Hero{

    public Ranger(String name){
        super(name, new HeroAttributes(1,7,1));
    }
}
