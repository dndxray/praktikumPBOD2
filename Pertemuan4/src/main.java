public class main {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        bd.setjmlSisi(4);
        bd.setwarna("Merah");
        bd.setborder("Hitam");
        bd.printInfo();

        Persegi p2 = new Persegi(7, "Merah", "Putih");
        System.out.println("\n METHOD PERSEGI:");
        System.out.println("Sisi = " + p2.getsisi());
        System.out.println("Warna = " + p2.getwarna());
        System.out.println("Border = " + p2.getborder());
        System.out.println("Luas = " + p2.getLuas());
        System.out.println("Keliling = " + p2.getKeliling());
        System.out.println("Diagonal = " + p2.getDiagonal());

        Lingkaran l2 = new Lingkaran(7, "Hijau", "Putih");
        System.out.println("\n METHOD LINGKARAN 2:");
        System.out.println("Jari-jari = " + l2.getjari());
        System.out.println("Warna = " + l2.getwarna());
        System.out.println("Border = " + l2.getborder());
        System.out.println("Luas = " + l2.getLuas());
        System.out.println("Keliling = " + l2.getKeliling());
    }
}