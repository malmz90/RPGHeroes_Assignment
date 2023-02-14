package heroes;

public class Ranger extends Hero{

    public Ranger(String name){
        super(name, new HeroAttributes(1,7,1));
    }

    @Override
    public void levelUp() {
        levelAttributes.addAttributes(1,5,1);
        super.levelUp();
    }
}
