public class MBangunDatar {
    public static void main(String[] args) {

        BangunDatar P1 = new Persegi(10, "Merah", "Putih");
        Persegi P2 = new Persegi(5, "Biru", "Hitam");
        
        Lingkaran L1 = new Lingkaran(7, "Hijau", "Kuning");
        Lingkaran K1 = new Lingkaran(7, "Kuning", "Hijau");

        P1.printInfo();
        System.out.println("Luas P1: " + P1.getLuas());

        P2.printInfo();
        System.out.println("Luas P2: " + P2.getLuas());

        P2.zoom(200);
        System.out.println("Luas P2 baru: " + P2.getLuas());

        System.out.println("L1 sama luas dengan K1: " + L1.isEqualLuas(K1));
        System.out.println("L1 sama keliling dengan K1: " + L1.isEqualKeliling(K1));
        System.out.println("\n");
        L1.printInfo();

        System.out.println("\n zoom in");
        L1.zoomIn();
        L1.printInfo();

        System.out.println("\n zoom out");
        L1.zoomOut();
        L1.printInfo();

        System.out.println("\n zoom");
        L1.zoom(50);
        L1.printInfo();
        
        System.out.println("");
        BangunDatar.printCounterBangunDatar();
    }
}