package heroes;

public class HeroAttributes {

    private int strength;
    private int dexterity;
    private int intelligence;

    public HeroAttributes(int str, int dex, int intel){
        this.strength=str;
        this.dexterity=dex;
        this.intelligence=intel;
    }

    public void addAttributes(int str, int dex, int intel) {
        this.strength += str;
        this.dexterity += dex;
        this.intelligence += intel;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    @Override
    public String toString() {
        return  + this.strength + " " + this.dexterity + " " + this.intelligence;
    }

}
