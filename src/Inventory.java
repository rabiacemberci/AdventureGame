import java.util.ArrayList;
import java.util.Arrays;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private ArrayList<Item> itemlist;

    public Inventory() {
        this.weapon =  new Weapon("Yumruk", -1,0,0);
        this.armor =  new Armor(-1,"Paçavra", 0,0);
        this.itemlist = new ArrayList<Item>();

    }

    public ArrayList<Item> getItemlist(){
        return itemlist;
    }

    public void setItemlist(Item item) {
        this.itemlist = itemlist;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
