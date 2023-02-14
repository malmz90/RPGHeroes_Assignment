package heroes;

public class Mage extends Hero {
    public Mage(String name) {
        super(name, new HeroAttributes(1,1,8));
    }

    @Override
    public void levelUp() {
        levelAttributes.addAttributes(1,1,5);
        super.levelUp();
    }
}
