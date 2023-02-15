package heroes;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import items.*;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Hero {

    private String name;
    private int level = 1;
    protected HeroAttributes levelAttributes;
    private HashMap<Slot, Item> equipment = new HashMap<>();
   protected  ArrayList<WeaponType> validWeaponTypes;
    protected   ArrayList<ArmorType> validArmorTypes;

    public Hero(String name,HeroAttributes attributes) {
        this.name = name;
        this.levelAttributes = attributes;
        equipment.put(Slot.Weapon,null);
        equipment.put(Slot.Head,null);
        equipment.put(Slot.Body,null);
        equipment.put(Slot.Legs,null);

    }

    public void equipWeapon(Weapon weapon) {
        try {
            if(!this.validWeaponTypes.contains(weapon.getWeaponType()) ){
                throw new InvalidWeaponException("You cant equip weapon of type " + weapon.getWeaponType());
            }
            if(weapon.getRequiredLevel() > this.level){
                throw new InvalidWeaponException("You are to low level to equip this weapon");
            }

            equipment.put(Slot.Weapon,weapon);

        } catch (InvalidWeaponException e) {
            System.out.println(e);
        }

    }

    public void equipArmor(Armor armor){
        try {
            if(!this.validArmorTypes.contains(armor.getArmorType())) {
                throw new InvalidArmorException("You cant equip armor of type " + armor.getArmorType());
            }
            if(armor.getRequiredLevel() > this.level){
                throw new InvalidArmorException("You are to low level to equip this piece of armor");
            }
            equipment.put(armor.getSlot(),armor);

        } catch (InvalidArmorException e) {
            System.out.println(e);
        }
    }


    public void levelUp() {
        level++;
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