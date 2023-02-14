package heroes;

public class Rogue extends Hero{
    public Rogue(String name) {
        super(name, new HeroAttributes(2,6,1));
    }

    @Override
    public void levelUp() {
        levelAttributes.addAttributes(1,4,1);
        super.levelUp();
    }


}
