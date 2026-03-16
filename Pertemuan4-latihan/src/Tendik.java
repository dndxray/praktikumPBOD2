public class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String nip, String nama, String tanggalLahir,
                  String tmt, double gajiPokok, String bidang) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP : " + getNip());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.println("TMT : " + getTmt());
        System.out.println("Jabatan : Tenaga Kependidikan");
        System.out.println("Bidang : " + bidang);
        System.out.println("Gaji Pokok : " + getGajiPokok());

        double tunjangan = 0.01 * 10 * getGajiPokok();
        System.out.println("Tunjangan : " + tunjangan);
    }
}