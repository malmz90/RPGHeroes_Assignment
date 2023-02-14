package heroes;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name, new HeroAttributes(5,2,1));
    }

    @Override
    public void levelUp() {
        levelAttributes.addAttributes(3,2,1);
        super.levelUp();
    }


}
