public class Mahasiswa2 extends CivitasAkademika {
    private String nim;
    private Dosen dosenWali;

    public Mahasiswa2(String nama, String nim, Dosen dosenWali) {
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;
    }

    @Override
    public String getNomor() {
        return nim;
    }

    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);

        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama());
        } 
        else {
            System.out.println("Dosen Wali: Belum ada");
        }
        System.out.println();
    }
}