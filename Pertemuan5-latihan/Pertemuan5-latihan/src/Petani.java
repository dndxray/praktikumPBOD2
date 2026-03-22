import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, String tgl, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public String getAsalKota() {
        return asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate tanggalMulai = LocalDate.parse(this.tgl_mulai_kerja, formatter);
        LocalDate sekarang = LocalDate.now();
        
        int selisihTahun = Period.between(tanggalMulai, sekarang).getYears();
        return selisihTahun + 1; 
    }//24060124140165

    @Override
    public double hitungPajak() {
        return 0; 
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}