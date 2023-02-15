package items;


public abstract class Item {
    public String name;
    public int requiredLevel;
    public Slot slot;

    public Item (String name, int reqLvl, Slot slot) {
        this.name = name;
        this.requiredLevel = reqLvl;
        this.slot = slot;
    }

    public Slot getSlot() {
        return slot;
    }
}
