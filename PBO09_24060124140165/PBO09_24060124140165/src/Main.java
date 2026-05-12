public class Main {
    public static void main(String[] args) {
        Teman<String> KoleksiTeman = new Teman<>();

        KoleksiTeman.addNama("ALI MASKAN FERRY PURWANTO");
        KoleksiTeman.addNama("AZKA WAYASY AL HAFIZH");
        KoleksiTeman.addNama("BASIL AYMAN HARIADI");
        KoleksiTeman.addNama("CAESAR FERDIANA SUWANDI");
        KoleksiTeman.addNama("CRYSTIANO BAYU SATYA ALVES");
        KoleksiTeman.addNama("DEVANO TRESTANTO");
        KoleksiTeman.addNama("DINDA ISYARIANI");
        KoleksiTeman.addNama("ELZA KHOIRISMA CARRYNDA");
        KoleksiTeman.addNama("FERDY PRASETYA PUTRA");
        KoleksiTeman.addNama("GHATFAN MUHAMMAD ATIWIAR");
        KoleksiTeman.addNama("HANIF IHSANUL HUDA");
        KoleksiTeman.addNama("HASTA PUTRA WILDANTARA");
        KoleksiTeman.addNama("IZZATU KHOIRUL FATA");
        KoleksiTeman.addNama("MARCHELLA ARKHINA RATUNESIA");
        KoleksiTeman.addNama("MENZA ISAIAH TAMPUBOLON");
        KoleksiTeman.addNama("MOHAMMAD ANDHIKA RAMADHAN");
        KoleksiTeman.addNama("MUHAMMAD LUTFI FEBRIANSYAH");
        KoleksiTeman.addNama("NAUFAL DWI YUSMAWAN");
        KoleksiTeman.addNama("NAUFAL RAYAN ATTALLAH");
        KoleksiTeman.addNama("NOVELYA CHERINA");

        KoleksiTeman.showNama();

        System.out.println("Apakah ELZA ada? " + KoleksiTeman.isMember("ELZA"));

        KoleksiTeman.gantiNama("Dinda", "Dinda cape bgt jujur tugas kok ga selesai selesai lah malah curhat");

        System.out.println("Setelah ganti:");
        KoleksiTeman.showNama();

        // delNama(nama)
        System.out.println("\n Menghapus ELZA KHOIRISMA CARRYNDA");

        KoleksiTeman.delNama("ELZA KHOIRISMA CARRYNDA");

        System.out.println("Hasil setelah delNama : ");
        KoleksiTeman.showNama();

        // KOLEKSI KELAS BENTUKAN
        Piaraan klinik = new Piaraan();

        Anggora k1 = new Anggora("cimi", 10.9);
        Kembangtelon k2 = new Kembangtelon("mini", 21.2);
        Anjing a1 = new Anjing("gukguk");
        Burung b1 = new Burung("wuk");

        klinik.enqueueAnabul(k1);
        klinik.enqueueAnabul(k2);
        klinik.enqueueAnabul(a1);
        klinik.enqueueAnabul(b1);

        System.out.println("=== Daftar Anabul ===");
        klinik.showAnabul();

        System.out.println("\nJumlah Anabul : ");
        System.out.println(klinik.getNbelm());

        System.out.println("\nAnabul paling depan : ");
        System.out.println(klinik.getAnabul().getNama());

        System.out.println("\nJumlah keluarga kucing : ");
        System.out.println(klinik.countKucing());

        System.out.println("\nTotal bobot kucing : ");
        System.out.println(klinik.bobotKucing());

        System.out.println("\nJenis Anabul : ");
        klinik.showJenisAnabul();

        System.out.println("\nDequeue Anabul : ");
        System.out.println(klinik.dequeueAnabul().getNama());

        System.out.println("\nIsi antrean setelah dequeue : ");
        klinik.showAnabul();
    }
}