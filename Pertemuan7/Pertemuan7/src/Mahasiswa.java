/* 
NAMA = Dinda Isyariani
NIM = 24060124140165
LAB = D2
TANGGAL = selasa 21/4/2026
*/

public class Mahasiswa {

    private int nim;
    private String nama;
    private String programStudi;

    public Mahasiswa() {
        this.nim = -999;
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    public Mahasiswa(int nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa lain) {
        this.nim = lain.nim;
        this.nama = lain.nama;
        this.programStudi = lain.programStudi;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa lain) {
        this.programStudi = lain.programStudi;
    }

    @Override
    public String toString() {
        return " NIM=" + nim + ", Nama=" + nama + ", ProgramStudi=" + programStudi;
    }
}