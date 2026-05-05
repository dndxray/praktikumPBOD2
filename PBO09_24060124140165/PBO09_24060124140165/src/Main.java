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

        KoleksiTeman.gantiNama("MARCHELLA", "MARCHELLA Baru");

        System.out.println("Setelah ganti:");
        KoleksiTeman.showNama();
    }
}