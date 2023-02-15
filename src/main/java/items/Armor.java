package items;

import heroes.HeroAttributes;

public class Armor extends Item {

    private HeroAttributes armorAttributes;
    private ArmorType armorType;
    public Armor(String name, int reqLvl, Slot slot, HeroAttributes attributes, ArmorType armType) {
        super(name,reqLvl,slot);
        this.armorAttributes = attributes;
        this.armorType = armType;
    }

    public ArmorType getArmorType() {
        return armorType;
    }
}
