import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Dosen {

    private String nidk;
    private int masaKontrak;

    public DosenTamu(String nip, String nidk, String nama, String tanggalLahir,
                     String tmt, double gajiPokok, String fakultas, int masaKontrak) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.masaKontrak = masaKontrak;
    }

    @Override
    public void printInfo() {

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id","ID"));

        LocalDate sekarang = LocalDate.now();
        LocalDate akhirKontrak = sekarang.plusMonths(masaKontrak);

        System.out.println("NIP : " + getNip());
        System.out.println("NIDK : " + nidk);
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.println("TMT : " + getTmt());
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + getFakultas());

        System.out.println("Masa Kontrak : " + masaKontrak + " bulan");
        System.out.println("Kontrak Berakhir : " + akhirKontrak.format(format));

        double tunjangan = 0.025 * getGajiPokok();
        System.out.println("Tunjangan : " + tunjangan);
    }
}