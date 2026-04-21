public class Registrasi {
    private String tglRegistrasi;
    private String tglBayar;
    private String metodeBayar;
    private Peserta peserta;
    private Pelatihan pelatihan;

    public Registrasi(String tglReg, String tglByr, String metode, Peserta p, Pelatihan pel) {
        this.tglRegistrasi = tglReg;
        this.tglBayar = tglByr;
        this.metodeBayar = metode;
        this.peserta = p;
        this.pelatihan = pel;
    }

    public double hitungHargaAkhir() {
        double hargaAwal = pelatihan.getHarga();
        double potongan = 0;
        if (peserta instanceof Member) {
            potongan = Member.getDiskon() * hargaAwal;
        }
        double nilaiPajak = Pelatihan.getPajak() * hargaAwal;
        return (hargaAwal - potongan) + nilaiPajak;
    }

    public void tampilkanDetail() {
        System.out.println("========================================");
        System.out.println("TANGGAL DAFTAR: " + tglRegistrasi);
        peserta.printInfo();
        pelatihan.printInfo();
        System.out.println("----------------------------------------");
        System.out.println("Harga Awal : Rp " + pelatihan.getHarga());
        
        double diskonNominal = (peserta instanceof Member) ? (Member.getDiskon() * pelatihan.getHarga()) : 0;
        System.out.println("Diskon     : Rp " + diskonNominal);
        System.out.println("Pajak      : Rp " + (Pelatihan.getPajak() * pelatihan.getHarga()));
        System.out.println("HARGA AKHIR: Rp " + hitungHargaAkhir());
        System.out.println("Metode Bayar: " + metodeBayar + " (Lunas: " + tglBayar + ")");
        System.out.println("========================================\n");
    }
}