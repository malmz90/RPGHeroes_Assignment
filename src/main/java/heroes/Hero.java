package heroes;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import items.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Hero {

    private String name;
    private int level = 1;
    protected HeroAttributes levelAttributes;
    private HashMap<Slot, Item> equipment = new HashMap<>();
   protected  ArrayList<WeaponType> validWeaponTypes;
    protected   ArrayList<ArmorType> validArmorTypes;

    public Hero(String name, HeroAttributes attributes) {
        this.levelAttributes = attributes;
        this.name = name;
        equipment.put(Slot.Weapon,null);
        equipment.put(Slot.Head,null);
        equipment.put(Slot.Body,null);
        equipment.put(Slot.Legs,null);

    }

    public HeroAttributes getTotalAttributes() {
        HeroAttributes total = levelAttributes;

        for (Slot slot : Slot.values()) {

            if(!slot.equals(Slot.Weapon)){
                if(getArmor(slot) != null) {
                    total.addAttributes(
                            getArmor(slot).getArmorAttributes().getStrength(),
                            getArmor(slot).getArmorAttributes().getDexterity(),
                            getArmor(slot).getArmorAttributes().getIntelligence());
                }
            }}
        return total;
    }

    public void equipWeapon(Weapon weapon) throws InvalidWeaponException {

            if(!this.validWeaponTypes.contains(weapon.getWeaponType()) ){
                throw new InvalidWeaponException("You cant equip weapon of type " + weapon.getWeaponType());
            }
            if(weapon.getRequiredLevel() > this.level){
                throw new InvalidWeaponException("You are to low level to equip this weapon");
            }

            equipment.put(Slot.Weapon,weapon);

    }

    public void equipArmor(Armor armor) throws InvalidArmorException{
            if(!this.validArmorTypes.contains(armor.getArmorType())) {
                throw new InvalidArmorException("You cant equip armor of type " + armor.getArmorType());
            }
            if(armor.getRequiredLevel() > this.level){
                throw new InvalidArmorException("You are to low level to equip this piece of armor");
            }
            equipment.put(armor.getSlot(),armor);
    }
    public double damage() {
        double dmg = 0;
        if(equipment.get(Slot.Weapon) != null)
            dmg = ((Weapon)equipment.get(Slot.Weapon)).getWeaponDamage();
        return dmg * (1 + (getDamageAttribute(getTotalAttributes())/100d));

    };

    public StringBuilder display(){
        StringBuilder details = new StringBuilder("Hero details:" + "\n");
        details.append("Name: ").append(this.name).append("\n");
        details.append("Class: ").append(this.getClass().getSimpleName()).append("\n");
        details.append("Level: ").append(this.level).append("\n");
        details.append(this.levelAttributes).append("\n");
        details.append("Damage: ").append(this.damage());
        return details;
    }

   public abstract int getDamageAttribute(HeroAttributes attributes);
    public void levelUp() {
        level++;
    }

    public Weapon getWeapon(){
        return (Weapon) equipment.get(Slot.Weapon);
    }
    public Armor getArmor(Slot slot){
        return (Armor) equipment.get(slot);
    }
    public String getName() {
        return name;
    }
    public HeroAttributes getLevelAttributes() {
        return levelAttributes;
    }


    public int getLevel() {
        return level;
    }



}