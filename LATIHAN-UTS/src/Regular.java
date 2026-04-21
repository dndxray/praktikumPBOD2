public class Regular extends Pelatihan {
    private int durasi;
    private String level;
    private String metode;

    public Regular(String kode, String nama, int kuota, String instruktur, double harga, int durasi, String level, String metode) {
        super(kode, nama, kuota, instruktur, harga);
        this.durasi = durasi;
        this.level = level;
        this.metode = metode;
    }

    @Override
    public void printInfo() {
        System.out.println("[REGULER] Kode: " + kode + " | Nama: " + nama + " | Instruktur: " + namaInstruktur);
        System.out.println("Detail: Durasi " + durasi + " bulan, Level " + level + ", Metode " + metode);
    }
}