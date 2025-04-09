
package telu_studio;

import java.util.Scanner;

public class Story {
    private Scene startScene; // Awal skenario cerita
    private Character player; // Karakter pemain
    private Scanner scanner;  // Scanner untuk input pengguna

    // Konstruktor untuk inisialisasi cerita
    public Story(Scene startScene, Character player) {
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    // Metode untuk memulai cerita
    public void start() {
        System.out.println("=== PETUALANGAN " + player.getName().toUpperCase() + " ===");
        System.out.println("Ketik 'A', 'B', atau 'C' untuk membuat pilihan."); // Petunjuk pilihan
        System.out.println("Ketik 'INFO' untuk melihat status karakter.");    // Petunjuk untuk melihat info
        System.out.println("Ketik 'QUIT' untuk keluar dari permainan.");      // Petunjuk untuk keluar
        System.out.println("Tekan enter untuk memulai perjalanan...");
        scanner.nextLine();
        play(); // Memulai permainan
    }

    public void play() {
        Scene currentScene = startScene; // Mulai dari skenario awal
        String input; // Variabel untuk menyimpan input pengguna

        while (currentScene != null && player.getHealth() > 0) { // Loop selama skenario ada dan pemain masih hidup
            currentScene.displayScene(); // Tampilkan deskripsi skenario saat ini

            if (currentScene.isEndScene()) { // Jika skenario adalah akhir cerita
                endGame(); // Panggil metode endGame untuk menyelesaikan cerita
                break; // Keluar dari loop
            }

            System.out.print("\nPilihan kamu: "); // Minta input pilihan dari pengguna
            input = scanner.nextLine().trim().toUpperCase(); // Baca input dan ubah ke huruf besar

            if (input.equals("QUIT")) { // Jika pengguna mengetik "QUIT"
                System.out.println("Terima kasih telah bermain!"); // Tampilkan pesan keluar
                break; // Keluar dari loop
            } else if (input.equals("INFO")) { // Jika pengguna mengetik "INFO"
                displayPlayerInfo(); // Tampilkan informasi pemain
                System.out.println("Tekan enter untuk kembali ke skenario...");
                scanner.nextLine(); // Tunggu input selanjutnya
                continue; // Lanjutkan ke iterasi berikutnya
            }

            Scene nextScene = currentScene.makeChoice(input, player); // Proses pilihan pengguna

            if (nextScene == null) { // Jika pilihan tidak valid
                System.out.println("Pilihan tidak valid. Coba lagi."); // Beri tahu pengguna
                System.out.println("Tekan enter untuk kembali ke skenario...");
                scanner.nextLine();
            } else {
                currentScene = nextScene; // Pindah ke skenario berikutnya
            }

            if (player.getHealth() <= 0) { // Jika nyawa pemain habis
                System.out.println("\nGAME OVER! " + player.getName() + " telah kehabisan nyawa."); // Tampilkan pesan game over
                displayPlayerInfo(); // Tampilkan status pemain terakhir
            }
        }
    }
    public void endGame() {
        if (player.getXP() >= 300) {
        System.out.println("Tekan enter untuk melihat jawaban alam");
        scanner.nextLine();
        System.out.println("Cahaya sisi kanan naik perlahan… lebih berat dari bayangan.");
        System.out.println("Suara hutan berubah menjadi lantunan lembut.");
        System.out.println("Aurora menatapmu dengan tersenyum.");
        System.out.println();
        System.out.println("Aurora (pelan):");
        System.out.println("\"Kau… diterima.\"");
        player.showStatus();
        System.out.println("Tekan enter untuk melihat ending...");
        scanner.nextLine();
        System.out.println("---------------------------------------------------------------------");
        System.out.println(
            ">>> EPILOG — KEHIDUPAN BARU\n" +
            "Langkahmu melewati portal terasa ringan,\n" +
            "seolah semua beban dari kehidupan sebelumnya telah ditinggalkan.\n\n" +
            "Saat matamu terbuka, kamu berdiri di atas tanah yang subur,\n" +
            "di tengah hutan yang bersinar tenang dengan warna-warna yang tak pernah kamu lihat sebelumnya.\n" +
            "Langit biru keunguan, dedaunan mengeluarkan aroma yang menyembuhkan,\n" +
            "dan suara alam menyambutmu…\n" +
            "bukan sebagai tamu, tapi sebagai bagian dari mereka.\n\n" +
            "Di kejauhan, Aurora berdiri bersama makhluk-makhluk yang dulu kamu bantu—\n" +
            "Aurora mengangguk, lalu berkata:\n\n" +
            "\"Dunia ini tak sempurna. Tapi ia akan tumbuh bersama orang-orang yang menjaganya.\n" +
            "Sekarang… dunia ini adalah rumahmu.\"\n\n" +
            "Kamu menutup mata.\n" +
            "Mencium aroma tanah.\n" +
            "Dan untuk pertama kalinya…\n" +
            "hatimu benar-benar pulang.\n\n" +
            "|--------------------------------------------------|\n" +
            "|     TERIMA KASIH TELAH MENJALANI PERJALANAN     |\n" +
            "|         MENJADI SAHABAT BAGI ALAM INI 🌿        |\n" +
            "|--------------------------------------------------|\n\n" + 
            "🌟 Kamu kini menjadi Penjaga Hutan Cahaya 🌟" +
            "\n\n >>> Sampai jumpa di petualangan selanjutnya…"
        );
        } if (player.getXP() > 0 && player.getXP() < 300) {
            System.out.println("Tekan enter untuk melihat jawaban alam");
            scanner.nextLine();
            System.out.println("Cahaya sisi kanan bergetar… tapi tidak cukup untuk mengalahkan bayangan.");
            System.out.println("Suara hutan menjadi gemuruh, seolah kecewa.");
            System.out.println("Aurora menatapmu dengan tatapan penuh harap.");
            System.out.println();
            System.out.println("Aurora (pelan):");
            System.out.println("\"Kau… belum siap.\"");
            player.showStatus();
            System.out.println("Tekan enter untuk melihat ending...");
            scanner.nextLine();
            System.out.println("---------------------------------------------------------------------");
            System.out.println(
                ">>> EPILOG — PINTU YANG TAK TERBUKA\n" +
                "Langkahmu terhenti di depan sebuah gerbang kristal\n" +
                "yang memantulkan semua jejak perjalananmu.\n" +
                "Gerbang itu berkilau lembut…\n" +
                "namun tidak terbuka.\n\n" +
                "Aurora berdiri di sampingmu.\n" +
                "Suara lembutnya terdengar seperti angin senja:\n\n" +
                "\"Kau telah mencoba. Aku tahu itu.\"\n\n" +
                "Dia menatap ke langit—\n" +
                "yang perlahan kembali mengabur, seperti tirai yang menutup panggung cerita.\n\n" +
                "\"Tapi dunia ini…\n" +
                "tidak butuh yang sempurna.\n" +
                "Hanya yang benar-benar terhubung dengan hati mereka.\"\n\n" +
                "Kamu melihat kembali langkah-langkahmu:\n" +
                "beberapa pilihan terburu-buru,\n" +
                "beberapa kesempatan yang luput,\n" +
                "dan mungkin… beberapa rasa takut yang belum kamu hadapi.\n\n" +
                "Aurora mendekat, lalu meletakkan tangannya di dadamu.\n\n" +
                "\"Ingat ini…\n" +
                "gagal di sini bukan akhir.\n" +
                "Dunia lama masih menunggumu,\n" +
                "dengan kesempatan baru… untuk belajar kembali menyatu dengan kehidupan.\"\n\n" +
                "Gerbang tak terbuka.\n" +
                "Tapi hati kecilmu sedikit lebih sadar dari sebelumnya.\n\n" +
                "|--------------------------------------------------|\n" +
                "|           UJIAN TIDAK TERSELESAIKAN ❌          |\n" +
                "|--------------------------------------------------|\n\n" +
                "   🌱 KAMU BELUM DIANGGAP LAYAK TINGGAL DI SINI 🌱\n" +
                ">>> Cobalah lagi. Belajarlah lagi. Hubungkan kembali."
            );
        } else {
            System.exit(0); // Menghentikan program
        }
    } 
    private void displayPlayerInfo() {
        System.out.println("\n=== STATUS " + player.getName().toUpperCase() + " ===");
        System.out.println("Health: " + player.getHealth());
        System.out.println("XP: " + player.getXP());
        System.out.println("MP: " + player.getMP());
        System.out.println("Status: " + player.getStatusPlayer());
        if (player.getItem() == "") {
            System.out.println("Item: (tidak ada)");
        } else {
            String itemList = String.join(", ", player.getItem());
            System.out.println("Item: " + itemList);
        }
        System.out.println("========================");
    }
}

