public class Member extends Peserta {
    private String nomorAnggota;
    private String tglBergabung;
    private static double diskon = 0.05; // Default 5%

    public Member(String ktp, String nama, String email, String nomorAnggota, String tglBergabung) {
        super(ktp, nama, email);
        this.nomorAnggota = nomorAnggota;
        this.tglBergabung = tglBergabung;
    }

    public static double getDiskon() { return diskon; }
    public static void setDiskon(double d) { diskon = d; }

    @Override
    public void printInfo() {
        System.out.println("Peserta Member: " + nama + " | ID: " + nomorAnggota + " | Bergabung: " + tglBergabung);
    }
}