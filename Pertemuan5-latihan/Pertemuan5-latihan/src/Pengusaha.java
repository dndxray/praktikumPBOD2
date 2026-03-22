import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tgl, String alamat, double pendapatan, String npwp) {
        super(nama, tgl, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate tanggalMulai = LocalDate.parse(this.tgl_mulai_kerja, formatter);
        LocalDate sekarang = LocalDate.now();
        
        int selisihTahun = Period.between(tanggalMulai, sekarang).getYears();
        return selisihTahun + 6; 
    }
    //24060124140165

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}