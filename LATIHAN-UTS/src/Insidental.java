public class Insidental extends Pelatihan {
    private boolean isOnline;
    private String tglPelatihan;

    public Insidental(String kode, String nama, int kuota, String instruktur, double harga, boolean isOnline, String tglPelatihan) {
        super(kode, nama, kuota, instruktur, harga);
        this.isOnline = isOnline;
        this.tglPelatihan = tglPelatihan;
    }

    @Override
    public void printInfo() {
        String tipe = isOnline ? "Online" : "Offline";
        System.out.println("[INSIDENTAL] Kode: " + kode + " | Nama: " + nama + " | Tanggal: " + tglPelatihan);
        System.out.println("Detail: Diselenggarakan secara " + tipe);
    }
}