public abstract class Pelatihan {
    protected String kode;
    protected String nama;
    protected int kuota;
    protected String namaInstruktur;
    protected double harga;
    protected static double pajak = 0.1; // Default 10%

    public Pelatihan(String kode, String nama, int kuota, String namaInstruktur, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.kuota = kuota;
        this.namaInstruktur = namaInstruktur;
        this.harga = harga;
    }

    // Getter & Setter (Pajak static, Kode tidak ada setter)
    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
    
    public static double getPajak() { return pajak; }
    public static void setPajak(double p) { pajak = p; }

    // Method Abstract sesuai soal
    public abstract void printInfo();
}