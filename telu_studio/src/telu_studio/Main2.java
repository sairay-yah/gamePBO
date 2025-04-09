package telu_studio;

import java.util.Scanner;

public class Main2 { // Biar bisa dipakai semua method

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(">>>");
        System.out.println("Ini adalah game petualangan yang menceritakan kisah seseorang yang ingin memulai hidup di dunia yang baru.");
        System.out.println("Misi kamu adalah mencapai XP 300 untuk mendapatkan kepercayaan dari alam bahwa kamu adalah sahabatnya, sebelum menjadi bagian dari dunia ini.");
        System.out.println("<<<");
        System.out.print("Masukkan nama karaktermu: ");

        String playerName = input.nextLine();
        if (playerName.isEmpty()) {
            playerName = "NPC"; // Nama default jika tidak ada input
        }
        Character player = new Character(playerName, 100); // Buat karakter
        System.out.println("=====================================");
        System.out.println("Nama karakter kamu adalah: " + playerName);
        System.out.println("Selamat datang, " + playerName + "! Petualanganmu dimulai sekarang!");
        System.out.println("Tekan Enter untuk melanjutkan...");
        input.nextLine();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("                🌲 MAGIC FOREST: AWAKENING JOURNEY 🌲               ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("HANYA YANG TERPILIH YANG DIIZINKAN UNTUK TETAP TINGGAL!!\n" +
            "\nHalo, " + playerName + ". Aku Aurora — pemandu perjalananmu di dunia yang baru ini.\n" +
            "Dunia ini tidak seperti dunia sebelumnya.\n" +
            "Di kehidupan sebelumnya...  \n" +
            "Kamu terlalu sibuk mengejar hal-hal yang tak pernah benar-benar kamu butuhkan.  \n" +
            "Kamu lupa bagaimana rasanya menyentuh tanah, merasakan angin, dan menatap langit dengan hati tenang.\n" +
            "Tapi kini, kamu diberi kesempatan kedua.\n" +
            "\nSyaratnya hanya satu:\n" +
            "Buktikan bahwa kamu adalah sahabat bagi alam ini.\n" +
            "Hutan ajaib ini akan menjadi pengujimu.\n" +
            "Jika kamu mampu bertahan, memahami, dan menghargai... maka dunia ini akan menerima kehadiranmu.\n"
        );
        System.out.println(">>> INGAT! ");
        System.out.println("Masa ujimu hanya 2 hari. Jika dalam waktu 2 hari kamu belum membuktikan bahwa dirimu layak, maka kamu akan tereliminasi.\n");
        System.out.println("Tekan Enter untuk melanjutkan...");
        input.nextLine();  
        
        // bad ending dari langit retak
       Scene badEnding = new Scene(
                "Ketidaksiapanmu untuk menerima dan melepaskan masa lalu menjadi akhir perjalananmu.\n" +
                "Kamu terjebak dalam bayanganmu sendiri, tak mampu melangkah maju.\n" +
                "Kamu terjatuh ke dalam kegelapan, dan suara-suara itu menghilang.\n" +
                "|--------------------------------------------------|\n" +
                "|           UJIAN TIDAK TERSELESAIKAN ❌          |\n" +
                "|--------------------------------------------------|\n\n" + 
                "GAME OVER!",
            null, null, 0, 0, null,0,
            null, null, 0, 0, null,0,
            null, null, 0, 0,null,0
       );

        // SCENE 12 - PENIMBANGAN JIWA 
      Scene scene12 = new Scene(
            ">>> PENIMBANGAN JIWA \n\n" +
            "Kamu melangkah ke padang rumput tenang yang ditingkahi suara lonceng angin.\n" +
            "Di tengah lapangan itu, berdiri timbangan besar dari cahaya—melayang, tidak menyentuh tanah.\n" +
            "Aurora berdiri di sisi kanan, dan di sisi kiri… sosok samar menyerupai dirimu, namun bermata gelap.\n\n" +
            "Aurora:\n" +
            "\"Ini adalah bagian akhir dari perjalananmu... sebelum hari kedua berakhir.\n" +
            "Timbangan ini akan mengukur hatimu.\n" +
            "Semua perbuatan, niat, dan perubahanmu... akan ditimbang dengan cahaya dunia ini.\"\n\n" +
            "Sosok bayangan itu melangkah naik ke timbangan sebelah kiri.\n" +
            "Kamu merasa dadamu berat... seolah kenangan-kenangan dari kehidupan lamamu ikut naik bersamanya.\n\n" +
            "Aurora:\n" +
            "\"Kamu tak bisa lari dari siapa dirimu dulu.\n" +
            "Tapi kamu bisa memilih siapa kamu hari ini.\"\n\n" +
            "Aurora mengangguk padamu.\n\n" +
            "Aurora:\n" +
            "\"Naiklah.\"\n\n" +
            "Kamu berdiri di sisi kanan timbangan… dan pelan-pelan, cahaya mulai berkumpul.\n" +
            "Daun-daun, air, hewan kecil, dan suara-suara halus dari setiap makhluk yang kamu tolong…\n" +
            "semuanya datang dan menyatu menjadi sinar lembut di sekitarmu.\n\n" +
            "Timbangan mulai bergerak…\n\n" +
            "⏳\n" +
            "⏳\n" +
            "⏳\n\n",
            null, null, 0, 0, null, 0,
            null, null, 0, 0, null, 0,
            null, null, 0, 0, null, 0     
    );

            // SCENE 11 - BUNGA TERAKHIR DAN RAHASIA AURORA
        Scene scene11 = new Scene(
           ">>> BUNGA TERAKHIR DAN RAHASIA AURORA \n\n" +
           "Malam kedua datang.\n" +
           "Kamu tiba di sebuah lembah sunyi. Udara terasa hangat,\n" +
           "dan di tengah hamparan itu, tumbuh satu bunga putih yang bersinar lembut—dikelilingi oleh batu-batu berbentuk melingkar.\n" +
           "Aurora berdiri di dekat bunga itu, diam.\n\n" +
           "Aurora (pelan):\n" +
           "\"Inilah tempat terakhir yang harus kamu datangi sebelum keputusan ditentukan.\n" +
           "Bunga ini… adalah jiwa dari hutan ini.\n" +
           "Dan juga… bagian terakhir dari diriku.\"\n\n" +
           "Kamu terdiam.\n\n" +
           "Aurora melanjutkan:\n" +
           "\"Aku bukan hanya penjaga. Aku adalah bagian dari dunia ini.\n" +
           "Dan setiap kali seseorang gagal… bagian dariku menghilang.\n" +
           "Tapi kamu... berbeda.\"\n\n" +
           "Ia berlutut di samping bunga itu, lalu menoleh padamu.\n\n" +
           "Aurora:\n" +
           "\"Sentuh bunga ini… dan biarkan alam menilai apakah kamu benar-benar layak tinggal.\n" +
           "Tapi ingat, ini bukan tentang apa yang kamu inginkan.\n" +
           "Ini tentang apa yang kamu siap lepaskan...\"\n\n" +
           "Kamu menatap bunga itu.\n" +
           "Apa yang akan kamu lakukan?",
           "Menyentuh bunga dan menyatakan tekadmu untuk hidup bersama alam, bukan menguasainya", scene12, 0, 50, null, 5,
           "Tersenyum menatap bunga dan mencoba menerima diri dan masa lalu", scene12, 0, 30, null, 0,
           "Menunduk dan berdoa dalam hati, tanpa menyentuh apapun", scene12, 0, 20, null, 0
       );

            // SCENE 10 - RINTIK HUJAN DAN BAYANGAN YANG MENARI
       Scene scene10 = new Scene(
           ">>> RINTIK HUJAN DAN BAYANGAN YANG MENARI\n\n" +
           "Kamu keluar dari lorong waktu dengan perasaan lega.\n" +
           "Langit mulai menangis. Rintik hujan turun pelan, membasahi tanah yang retak dan penuh kenangan.\n" +
           "Kamu berjalan mengikuti Aurora dalam diam, sampai tiba di sebuah lapangan terbuka—dikelilingi lingkaran batu kuno.\n" +
           "Di tengahnya… ada sosok bayangan yang menari, tubuhnya seperti kabut, gerakannya seperti angin.\n\n" +
           "Aurora:\n" +
           "\"Itu adalah refleksi dari setiap keputusan yang pernah kamu buat…\"\n" +
           "\"Dia menari dengan luka, dengan cinta, dengan semua yang kamu simpan terlalu lama.\"\n\n" +
           "Bayangan itu bergerak ke arahmu.\n" +
           "Ia menyentuh dadamu, dan tiba-tiba… semua memori muncul:\n" +
           "Ketika kamu menyakiti orang lain tanpa sadar.\n" +
           "Ketika kamu berharap dimengerti tanpa menjelaskan.\n" +
           "Ketika kamu menangis dalam diam.\n\n" +
           "Kamu tahu apa yang harus kamu lakukan.",
           "Menari bersama bayangan itu, menerima semua luka", scene11, 0, 50, null, 0,
           "Menghadapi bayangan itu dengan keberanian, tanpa rasa takut", scene11, 10, 30, null, 0,
           "Berbalik dan meninggalkan bayangan itu, memilih untuk melupakan", scene11, 0, 10, null, 0
       );

            // SCENE 9 - LORONG WAKTU DI BAWAH TANAH
       Scene scene9 = new Scene(
           ">>> LORONG WAKTU DI BAWAH TANAH\n\n" +
           "Setelah lonceng berbunyi, tanah di bawah menara mulai bergetar lembut.\n" +
           "Aurora menyentuh dinding menara dan sebuah pintu rahasia terbuka di lantai,\n" +
           "mengarah pada lorong gelap yang berkelok-kelok ke dalam bumi.\n\n" +
           "Aurora:\n" +
           "\"Di sinilah bagian terdalam dari ujianmu dimulai.\n" +
           "Kamu akan berjalan sendiri di lorong ini.\n" +
           "Tak ada aku, tak ada cahaya...\n" +
           "hanya suara dari dalam hatimu.\"\n\n" +
           "Kamu melangkah masuk.\n" +
           "Udara dingin dan tanah lembab menyelimuti setiap langkahmu.\n" +
           "Di dalam lorong itu, kamu mulai mendengar suara-suara...\n" +
           "bukan dari luar, tapi dari dalam dirimu sendiri:\n" +
           "- \"Kenapa kamu gagal dulu?\"\n" +
           "- \"Apa yang kamu cari selama ini?\"\n" +
           "- \"Apakah kamu pantas diberi kesempatan kedua?\"\n\n" +
           "Kamu berhenti sejenak di percabangan lorong.\n" +
           "Tiga jalur di depanmu — masing-masing membawa suara berbeda.\n\n" + 
           "Jalur mana yang ingin kamu ikuti?",
           "Ikuti suara lembut yang berkata: \"Kamu cukup, kamu baik-baik saja.\"", scene10, 0, 50, null, 0,
           "Ikuti suara tangis anak kecil yang berkata: \"Aku takut... tolong aku...\"", scene10, 0, 50, null, 0,
           "Ikuti suara kemarahan yang berkata: \"Buktikan bahwa kamu kuat!\"", scene10, 5, 50, null,0
       );

            // SCENE 8 - MENARA ANGIN DAN LONCENG ROH
       Scene scene8 = new Scene(
           ">>> MENARA ANGIN DAN LONCENG ROH\n\n" +
           "Kamu mulai merasa tenang.. seolah-olah beban berangsur menghilang. \n" +
           "Kamu mengikuti Aurora menaiki lereng bukit yang dipenuhi rumput tinggi.\n" +
           "Angin mulai bertiup lebih kencang, membawa aroma pinus dan embun.\n" +
           "Di kejauhan, terlihat sebuah menara tinggi menjulang di puncak bukit —\n" +
           "terbuat dari kayu tua, lumut, dan ranting kering. Tapi berdiri kokoh, seolah menantang waktu.\n\n" +
           "Aurora:\n" +
           "\"Menara ini menyimpan suara. Tapi hanya mereka yang siap meninggalkan masa lalu...\n" +
           "yang bisa mendengar loncengnya.\"\n\n" +
           "Kamu melangkah masuk. Tangga spiral berderit di bawah kakimu.\n" +
           "Langkah demi langkah, kamu naik ke puncak.\n" +
           "Di sana…\n" +
           "Lonceng tua tergantung diam, angin menerpa tapi tak membuatnya bergerak.\n" +
           "Aurora menatapmu:\n\n" +
           "\"Untuk membunyikan lonceng ini, kamu harus memilih.\n" +
           "Kamu tak bisa membawa kenangan lama ke dunia ini... kecuali kamu sudah merelakannya.\"\n\n" +
           "**Apa yang ingin kamu lakukan?**",
           "Menyentuh lonceng dengan tangan kosong, berharap bisa mendengar suaranya", scene9, 0, 50, null, 5,
           "Tulis kenanganmu di sehelai daun, lalu biarkan angin menerbangkannya", scene9, 0, 50, null, 10,
           "Duduk diam di depan lonceng, merenungkan masa lalumu", scene9, 0, 50, null, 0
       );

            // SCENE 7 - LANGIT RETAK DAN DUNIA LAMA
       Scene scene7 = new Scene(
           ">>> LANGIT RETAK DAN DUNIA LAMA\n\n" +           
           "Kamu beranjak dari sungai cermin, di perjalanan, langit di atasmu tampak aneh — seperti cermin yang retak.\n" +
           "Retakan-retakan itu perlahan melebar, memancarkan cahaya dari dunia lamamu…\n" +
           "…dunia yang pernah kamu tinggalkan.\n" +
           "Aurora berdiri di sampingmu, terlihat gelisah.\n\n" +
           "Aurora:\n" +
           "“Ini… tidak seharusnya terbuka. Hatimu masih belum sepenuhnya di sini.”\n" +
           "“Retakan ini muncul karena ikatanmu dengan masa lalu belum tuntas.”\n\n" +
           "Kamu merasa sesak.\n" +
           "Kenangan-kenangan lama menyusup ke dalam pikiranmu:\n" +
           "Wajah seseorang yang kamu rindukan.\n" +
           "Suara dunia yang dulu akrab.\n" +
           "Semua itu kini menggantung di langit… nyaris runtuh.\n" +
           "Aurora menatapmu lekat-lekat.\n\n" +
           "“Jika kamu tak bisa menenangkannya… dunia ini akan menolakku juga.”\n\n" +
           "Pilihanmu:",
           "Panik dan menjerit: “Aku tidak bisa! Aku tidak siap!”", badEnding, 0, -999, null, 0,
           "Diam, menenangkan diri, dan memejamkan mata.", scene8, 0, 50, null, 8,
           "Menyanyikan lagu masa kecilmu… lagu yang dulu membuatmu tenang.", scene8, 10, 50, null,0
       );

            // SCENE 6 - SUNGAI CERMIN HATI
       Scene scene6 = new Scene(
           ">>> HARI KEDUA <<< \n" +
           ">>> SUNGAI CERMIN HATI\n\n" +
           "Keesokan harinya.. Aurora menuntunmu menuruni lereng kecil, sampai kalian tiba di sebuah aliran sungai yang begitu jernih.\n" +
           "Airnya tak hanya bening — tapi memantulkan bayanganmu dengan sempurna. Seolah-olah bukan sekadar cermin, melainkan… jendela ke dalam dirimu.\n\n" +
           "> Aurora:\n" +
           "> \"Ini adalah Sungai Cermin Hati.\n" +
           "> Ia tidak memantulkan tubuhmu… tapi isi jiwamu.\"\n\n" +
           "Kamu berlutut di pinggir sungai.\n" +
           "Bayangan di permukaan air mulai berubah…\n" +
           "Bukan hanya wajahmu yang terlihat, tapi juga kilasan dari masa lalumu:\n" +
           "- Momen ketika kamu menyakiti seseorang yang menyayangimu.\n" +
           "- Saat kamu memilih diam saat bisa membela yang benar.\n" +
           "- Ketakutan yang kamu sembunyikan bertahun-tahun.\n\n" +
           "Aurora berdiri diam di belakangmu, membiarkanmu memutuskan.\n" +
           "---\n" +
           "Apa yang akan kamu lakukan?",
           "Menolak melihat dan berdiri menjauh", scene7, 0, 10, null, 0,
           "Melihat sebentar dan meninggalkan lokasi itu", scene7, 5, 20, null, 0,
           "Menatap dalam dan mengakui sisi gelapmu", scene7, 10, 50, null, 4
       );

            // SCENE 5 - KABUT & SUARA PANGGILAN
       Scene scene5 = new Scene(
           ">>> KABUT & SUARA PANGGILAN\n\n" +
           "Malam tiba… dan cahaya matahari hampir tak tampak kembali.\n" +
           "Kabut tebal menyelimuti seluruh hutan.\n" +
           "Kamu melangkah perlahan… Aurora menghilang entah sejak kapan.\n" +
           "Lalu tiba-tiba terdengar sebuah suara\n\n" +
           "*“Tidak! ini belum cukup!”*\n\n" +
           "Suara lirih terdengar dari arah kabut gelap. Suara itu rapuh, nyaris seperti suara anak kecil yang mati-matian menggapai sesuatu.\n" +
           "Kamu berdiri di sebuah persimpangan.\n" +
           "Di depanmu, dua jalur membelah kabut:\n" +
           "🔹 Jalur kiri: Sedikit terang tapi sunyi\n" +
           "🔹 Jalur kanan: Gelap, berkabut, dan terdengar suara tersebut\n\n" +
           "Aurora tak terlihat. Hanya kabut… dan hatimu sendiri.\n" +
           "---\n" +
           "**Apa yang akan kamu lakukan?**",
           "Masuk ke kabut mengikuti suara", scene6, 10, 30, null, 0,
           "Mengabaikan suara itu dan memilih tidur karena lelah seharian", scene6, 0, 10, null, 0,
           "Masuk ke jalur terang yang sunyi", scene6, 5, 20,null, 0
       );
            
            // SCENE 4 - POHON KECIL & UJIAN EMPATI
       Scene scene4 = new Scene(
           ">>> POHON KECIL & UJIAN EMPATI\n\n" +
           "Langkahmu membawa ke sebuah area tenang.\n" +
           "Di tengah tanah yang retak, tampak **sebatang pohon kecil**.\n" +
           "Daunnya layu. Akarnya kering. Ia berdiri sendirian...\n" +
           "Seolah sedang menunggu sesuatu.\n" +
           "Aurora mendekat, kali ini suaranya jauh lebih lembut.\n\n" +
           "Aurora:\n" +
           "\"Banyak makhluk hanya melihat yang besar, yang indah, dan yang berguna untuk mereka.\n" +
           "Tapi sahabat alam... melihat segalanya sebagai bagian dari satu kehidupan.\"\n\n" +
           "Kamu mendekat...\n" +
           "Terdengar suara samar, seolah pohon kecil itu... **berbisik lemah**.\n" +
           "> \"...Apakah aku masih layak tumbuh di sini...?\"\n\n" +
           "Aurora:\n" +
           "\"Apa yang akan kamu lakukan?\"",
           "Abaikan, mungkin itu hanya halusinasi", scene5, 0, 10, null, 0,
           "Berlutut, sentuh batangnya, dan beri semangat", scene5, 10, 30, null,0,
           "Gunakan 'Biji Cahaya Kecil' di dekat akar pohon itu", scene5, 20, 50, null,5
       );

            // SCENE 3 - TAS DAN UJIAN KEJUJURAN
       Scene scene3 = new Scene(
           ">>> TAS DAN UJIAN KEJUJURAN\n\n" +
           "Perjalananmu membawa langkah ke area datar berumput lembut.\n" +
           "Angin bertiup pelan membawa aroma basah dedaunan pagi.\n" +
           "Aurora melambatkan langkahnya.\n\n" +
           "Aurora:\n" +
           "\"Kamu merasakannya, kan? Energi di tempat ini sedikit berbeda...\"\n\n" +
           "Di depanmu, sebuah **tas kulit coklat** tergeletak di bawah pohon tua.\n" +
           "Tidak ada jejak kaki...\n" +                
           "Tak ada siapa-siapa di sekitar...\n" +
           "Tapi tas itu terbuka, dan di dalamnya ada:\n" +
           "- Sebuah kantong kecil berisi buah kering\n" +
           "- Sebilah pisau kayu ukiran indah\n" +
           "- Kepingan batu bercahaya hijau\n" +
           "Aurora menatapmu dalam.\n\n" +
           "Aurora:\n" +
           "\"Kadang... ujian bukan tentang apa yang bisa kamu lakukan,\n" +
           "tetapi tentang apa yang *tidak* kamu ambil.\"\n\n" +
           ">>> Apa yang kamu lakukan?",
           "Mengabaikan tas tersebut dan melanjutkan perjalanan", scene5, 10, 20, null, 0,
           "Menutup kembali tas dan meninggalkannya", scene5 , 0, 50, null, 0,
           "Duduk dan menunggu siapa tahu pemiliknya datang", scene4, 5, 30, "Biji Cahaya Kecil", 0
       );

            // SCENE 2 - RUSA KECIL & HUTAN BAMBU
       Scene scene2 = new Scene(
           ">>> RUSA KECIL & HUTAN BAMBU\n\n" +
           "Kamu mengikuti aurora melangkah pelan menyusuri jalan sempit yang diapit oleh pohon bambu tinggi.\n" +
           "Cahaya pagi menembus celah di antara batang, membentuk pola cahaya di tanah.\n" +
           "Langkahmu terhenti oleh suara gemerisik...\n" +
           "Seekor rusa kecil muncul dari balik semak. Kakinya pincang, napasnya tersengal.\n\n" +
           "Aurora berbisik:\n" + "“" +playerName +
           "... hewan ini mungkin tidak bisa bicara seperti kita,\n" +
           "tapi alam selalu tahu siapa yang datang dengan hati yang tulus.”\n\n" +
           "Kamu melihat sekeliling:\n" +
           "— Rusa itu tampak kebingungan, menatap ke arah utara.\n" +
           "— Di sampingnya, ada tanaman bambu yang patah tertimpa bebatuan.\n" +
           "\n" +
           "\"Ini bukan hanya tentang membantu... tapi juga tentang membaca isyarat.\"\n\n" +
           ">>> Pilih tindakanmu:",
           "Membantu rusa melangkah ke arah utara, meskipun jalurnya curam", scene3, 10, 30, null, 0,
           "Menyingkirkan batu di atas tanaman bambu dan menanam ulang", scene3, 5, 20, null, 0,
           "Mengabaikan keduanya dan melanjutkan perjalanan", scene3, 0, -20, null, 0
       );

            // SCENE 1 - DAUN PETUNJUK
       Scene scene1 = new Scene(
           ">>> HARI PERTAMA <<<\n" +
           ">>> DAUN PETUNJUK\n\n" +
           "Suasana hutan terasa sunyi namun damai.\n" +
           "Embun masih menggantung di ujung dedaunan.\n" +
           "Langkah kakimu menyentuh tanah yang lembut dan hangat...\n" +
           "Kamu menoleh ke sekeliling, hanya suara dedaunan yang berbisik pelan.\n" +
           "Tiba-tiba, sehelai **daun emas** jatuh perlahan di depanmu.\n" +
           "Aurora muncul di sisimu, nyaris tanpa suara.\n\n" +
           "Aurora:\n" + "“" + playerName +
           "\"... Ini adalah *daun petunjuk*.\"\n" +
           "\"Setiap pilihanmu akan mengubah jalan cerita... dan dunia ini akan mencatatnya.\"\n" +
           "\"Percayalah pada hatimu.”\"\n\n" +
           "Kamu melihat ke depan. Di sekitar tempat itu ada tiga hal mencolok:\n" +
           "1. Sebuah **pohon tua** tampak lesu, akar-akarnya menggigil, daunnya berguguran.\n" +
           "2. **Daun emas** di tanah terus bergetar pelan, seolah hendak membisikkan sesuatu.\n" +
           "3. Di sudut kecil tanah, terlihat **bunga mungil layu** — sepi, hampir tak terlihat.\n\n" +
           "Aurora menatapmu.\n" +
           "\"Langkah pertama adalah ujian kecil... tapi bisa menentukan semuanya.\"\n\n" +
           "Apa yang akan kamu lakukan?",
           "Mendekati pohon tua dan mencoba menyentuh batangnya", scene2, 0, 10, null, 0,
           "Mengamati daun emas dan mendekatkannya ke telinga", scene2, 0, 20, null, 5,
           "Menggunakan sihir air untuk menyiram bunga mungil", scene2, 10, 30, null, 5
       );
  
            // memulai skenario setelah intro
        Story story = new Story(scene1, player);
        story.start();    
        input.close(); // Tutup scanner setelah selesai
}
}
    

