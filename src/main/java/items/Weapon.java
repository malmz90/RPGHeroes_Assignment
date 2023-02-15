package items;

public class Weapon extends Item {
    private int weaponDamage;
    private WeaponType weaponType;

    public Weapon (String name, int reqLvl, WeaponType wpnType, int wpnDamage ) {
        super(name,reqLvl,Slot.Weapon);
        this.weaponType = wpnType;
        this.weaponDamage = wpnDamage;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
