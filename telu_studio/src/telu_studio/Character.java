package telu_studio;
 
public class Character {
    private String name;
    private int health;
    private int mp;
    private int xp;
    private int maxXP;
    private String item;
    private String status;
    
    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        
        this.mp = 50;
        this.xp = 0;
        this.maxXP = 300;
        this.item = "(Belum ada item)";
        this.status = "BELUM LAYAK TINGGAL";
    }
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }
    public void addXP(int value) {
        xp += value;
    }
    public void addMP(int value) {
        mp += value;
    }
    public void takeMP(int value) {
        mp -= value;
        if (mp < 0) {
            mp = 0;
        }
    }
    public void setItem(String item) {
        this.item = item;
    }
    public String getItem() {
        if (item.equals("")) {
            item = "(Belum ada item)";
        }
        return item;
    }
    public void useItem(String itemName) {
        if (item.equals(itemName)) {
            item = "";
            System.out.println("Item " + itemName + " telah digunakan.");
        } 
    }
    public String getStatusPlayer() {
        if (xp >= maxXP) {
            status = "LAYAK TINGGAL";
        } else {
            status = "BELUM LAYAK TINGGAL";
        }
        return status;
    }
    // Getters sederhana
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getXP() {
        return xp;
    }

    public int getMP() {
        return mp;
    }

    public int getMaxXP() {
        return maxXP;
    }

    //untuk menampilkan status player
    public void showStatus() {
        System.out.println("+-----------------------------+");
        System.out.println(">>> STATUS " + name.toUpperCase());
        System.out.println("+-----------------------------+");
        System.out.println("Health : " + health);
        System.out.println("MP     : " + mp);
        System.out.println("XP     : " + xp + "/" + maxXP);
        System.out.println("Status : " + getStatusPlayer());
        if (item.isEmpty()) {
        System.out.println("Item: (tidak ada)");
    } else {
        String itemList = String.join(", ", item);
        System.out.println("Item: " + itemList);
    }
        System.out.println("+-----------------------------+");
    }
}
