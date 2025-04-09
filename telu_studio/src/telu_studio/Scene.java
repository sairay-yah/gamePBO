
package telu_studio;

import java.util.Scanner;

public class Scene {
    // Atribut untuk mendeskripsikan adegan dan pilihan-pilihannya
    private String description;
    private String choiceA;
    private String choiceB;
    private String choiceC;

    // Referensi ke adegan berikutnya berdasarkan pilihan
    private Scene nextSceneA;
    private Scene nextSceneB;
    private Scene nextSceneC;

    // Atribut untuk damage, poin pengalaman, item, dan magic points untuk setiap pilihan
    private int damageA;
    private int damageB;
    private int damageC;
    private int XPA;
    private int XPB;
    private int XPC;
    private String itemA;
    private String itemB;
    private String itemC;
    private int MPA;
    private int MPB;
    private int MPC;

    // Konstruktor untuk menginisialisasi semua atribut adegan
    public Scene(String description, 
                 String choiceA, Scene nextSceneA, int damageA, int XPA, String itemA, int MPA,
                 String choiceB, Scene nextSceneB, int damageB, int XPB, String itemB, int MPB,
                 String choiceC, Scene nextSceneC, int damageC, int XPC, String itemC, int MPC) {
        this.description = description; // Deskripsi adegan
        this.choiceA = choiceA;         // Pilihan A
        this.choiceB = choiceB;         // Pilihan B
        this.choiceC = choiceC;         // Pilihan C
        this.nextSceneA = nextSceneA;   // Adegan berikutnya jika memilih A
        this.nextSceneB = nextSceneB;   // Adegan berikutnya jika memilih B
        this.nextSceneC = nextSceneC;   // Adegan berikutnya jika memilih C
        this.damageA = damageA;         // Damage yang diterima jika memilih A
        this.damageB = damageB;         // Damage yang diterima jika memilih B
        this.damageC = damageC;         // Damage yang diterima jika memilih C
        this.XPA = XPA;                 // XP yang diperoleh jika memilih A
        this.XPB = XPB;                 // XP yang diperoleh jika memilih B
        this.XPC = XPC;                 // XP yang diperoleh jika memilih C
        this.itemA = itemA;             // Item yang diperoleh jika memilih A
        this.itemB = itemB;             // Item yang diperoleh jika memilih B
        this.itemC = itemC;             // Item yang diperoleh jika memilih C
        this.MPA = MPA;                 // Magic Points yang digunakan jika memilih A
        this.MPB = MPB;                 // Magic Points yang digunakan jika memilih B
        this.MPC = MPC;                 // Magic Points yang digunakan jika memilih C
    }

 //Menampilkan deskripsi adegan saat ini dan pilihan yang tersedia ke konsol.
 //Jika sebuah pilihan (A, B, atau C) tidak null, maka akan ditampilkan sebagai opsi.
 //Selain itu, meminta pengguna untuk mengetik "INFO" untuk melihat status karakter.
    public void displayScene() {
        System.out.println("\n" + description);
        if (choiceA != null) {
            System.out.println("A. " + choiceA);
        }
        if (choiceB != null) {
            System.out.println("B. " + choiceB);
        }
        if (choiceC != null) {
            System.out.println("C. " + choiceC);
        }
        if (!isEndScene()){
            System.out.println("(Ketik INFO untuk melihat status karakter)");
        }
    }
    public Scene makeChoice(String choice, Character player) {
        // Mengubah input pilihan menjadi huruf besar untuk konsistensi
        switch (choice.toUpperCase()) {
            case "A":
                // Jika ada damage pada pilihan A, kurangi HP pemain
                if (damageA > 0) {
                    System.out.println("Kamu mengalami " + damageA + " damage.");
                    player.takeDamage(damageA);
                }
                // Jika ada XP pada pilihan A, tambahkan XP ke pemain
                if (XPA > 0) {
                    System.out.println("Kamu mendapatkan " + XPA + " pengalaman!");
                    player.addXP(XPA);
                }
                if (XPA < 0) {
                    player.addXP(XPA);
                }
                // Jika ada item pada pilihan A, tambahkan item ke inventaris pemain
                if (itemA != null) {
                    System.out.println("Kamu mendapatkan item: " + itemA);
                    player.setItem(itemA);
                }
                // Jika ada MP yang digunakan pada pilihan A, kurangi MP pemain
                if (MPA > 0) {
                    System.out.println("Kamu menggunakan " + MPA + " MP!");
                    player.takeMP(MPA);
                }
                // Kembalikan adegan berikutnya untuk pilihan A
                return nextSceneA;
            case "B":
                // Jika ada damage pada pilihan B, kurangi HP pemain
                if (damageB > 0) {
                    System.out.println("Kamu mengalami " + damageB + " damage.");
                    player.takeDamage(damageB);
                }
                // Jika ada XP pada pilihan B, tambahkan XP ke pemain
                if (XPB > 0) {
                    System.out.println("Kamu mendapatkan " + XPB + " pengalaman!");
                    player.addXP(XPB);
                }
                if (XPB < 0) {
                    player.addXP(XPB);
                }
                // Jika ada item pada pilihan B, tambahkan item ke inventaris pemain
                if (itemB != null) {
                    System.out.println("Kamu mendapatkan item: " + itemB);
                    player.setItem(itemB);
                }
                // Jika ada MP yang digunakan pada pilihan B, kurangi MP pemain
                if (MPB > 0) {
                    System.out.println("Kamu menggunakan " + MPB + " MP!");
                    player.takeMP(MPB);
                }
                // Kembalikan adegan berikutnya untuk pilihan B
                return nextSceneB;
            case "C":
                // Jika ada damage pada pilihan C, kurangi HP pemain
                if (damageC > 0) {
                    System.out.println("Kamu mengalami " + damageC + " damage.");
                    player.takeDamage(damageC);
                }
                // Jika ada XP pada pilihan C, tambahkan XP ke pemain
                if (XPC > 0) {
                    System.out.println("Kamu mendapatkan " + XPC + " pengalaman!");
                    player.addXP(XPC);
                }
                if (XPC < 0) {
                    player.addXP(XPC);
                }
                // Jika ada item pada pilihan C, tambahkan item ke inventaris pemain
                if (itemC != null) {
                    System.out.println("Kamu mendapatkan item: " + itemC);
                    player.setItem(itemC);
                }
                // Jika pilihan C memiliki kondisi khusus, jalankan logika tambahan
                if ("Gunakan 'Biji Cahaya Kecil' di dekat akar pohon itu".equals(choiceC)) {
                    System.out.println("Kamu menggunakan Biji Cahaya Kecil untuk membantu tanaman tumbuh!");
                    System.out.println("Tanaman tumbuh dan memberikan kamu 20 XP!");
                    player.addXP(20); // Tambahkan XP tambahan
                    player.useItem("Biji Cahaya Kecil"); // Gunakan item dari inventaris
                }
                // Jika ada MP yang digunakan pada pilihan C, kurangi MP pemain
                if (MPC > 0) {
                    System.out.println("Kamu menggunakan " + MPC + " MP!");
                    player.takeMP(MPC);
                }
                // Kembalikan adegan berikutnya untuk pilihan C
                return nextSceneC;
            default:
                // Jika input tidak valid, kembalikan null
                return null;
        }
    }

    // Getter untuk memeriksa apakah scene ini adalah scene akhir
    public boolean isEndScene() {      
        return nextSceneA == null && nextSceneB == null && nextSceneC == null;
    }
}
