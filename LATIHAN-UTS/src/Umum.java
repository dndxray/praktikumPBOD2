public class Umum extends Peserta {
    public Umum(String ktp, String nama, String email) {
        super(ktp, nama, email);
    }

    @Override
    public void printInfo() {
        System.out.println("Peserta Umum: " + nama + " (KTP: " + ktp + ")");
    }
}