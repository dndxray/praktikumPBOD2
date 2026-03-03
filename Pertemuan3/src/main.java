public class main {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "pemprogramman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
       // Mahasiswa M1 = new Mahasiswa("232", "dinda", "bahasa");
        Mahasiswa M1 = new Mahasiswa("234", "citra", "informatika");
        dosen D1 = new dosen("123", "andi", "informatika");
        Kendaraan K1 = new Kendaraan("H21W1W11" , "motor");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(MBD);
        M1.addMatKul(PBO);
        M1.printDetailMhs();
        System.out.println("jumlah mata kuliah = " + M1.getJumlahMatkul());
        System.out.println("jumlah sks mata kuliah =" + M1.getJumlahSKS());





    }
}
