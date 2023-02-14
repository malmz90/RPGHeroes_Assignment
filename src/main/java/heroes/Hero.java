package heroes;

import utils.HeroAttributes;

public abstract class Hero {


    public String name;
    public int level = 1;



    public HeroAttributes levelAttributes;

    public Hero(String name,HeroAttributes attributes) {
        this.name = name;
        this.levelAttributes = attributes;
    }

    public String getName() {
        return name;
    }
    public HeroAttributes getLevelAttributes() {
        return levelAttributes;
    }








}