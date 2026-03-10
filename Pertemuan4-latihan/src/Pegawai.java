public class Pegawai {
    private String nip;
    private String nama;
    private String tanggalLahir;
    private String tmt;
    private double gajiPokok;

    public Pegawai() {
    }

    public Pegawai(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTmt() {
        return tmt;
    }

    public void setTmt(String tmt) {
        this.tmt = tmt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void printInfo() {
        System.out.println("NIP = " + nip);
        System.out.println("Nama = " + nama);
        System.out.println("Tanggal Lahir = " + tanggalLahir);
        System.out.println("TMT = " + tmt);
        System.out.println("Gaji Pokok = " + gajiPokok);
    }
}
