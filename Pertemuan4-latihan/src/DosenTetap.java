import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DosenTetap extends Dosen {
    private String nidn;
    private int bup = 65;

    public DosenTetap(String nip, String nidn, String nama, String tanggalLahir,
                      String tmt, double gajiPokok, String fakultas) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    @Override
    public void printInfo() {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy");

        LocalDate lahir = LocalDate.parse(getTanggalLahir(), format);
        LocalDate pensiun = lahir.plusYears(bup).plusMonths(1);

        System.out.println("NIP : " + getNip());
        System.out.println("NIDN : " + nidn);
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.println("TMT : " + getTmt());
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + getFakultas());

        System.out.println("Tanggal Pensiun : " + pensiun.format(format));

        double tunjangan = 0.02 * 10 * getGajiPokok();
        System.out.println("Tunjangan : " + tunjangan);
    }
}