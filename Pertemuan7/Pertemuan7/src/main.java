/* 
NAMA = Dinda Isyariani
NIM = 24060124140165
LAB = D2
TANGGAL = selasa 21/4/2026
*/
public class main {
    public static void main(String[] args) {

        System.out.println("NOMOR 1");

        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;
        double nilaiDouble = nilaiInt;   

        System.out.println("integer: " + nilaiInt);
        System.out.println("karakter: " + nilaiChar);
        System.out.println("real: " + nilaiDouble);

        System.out.println("\nmengubah integer ke real lalu dikembalikan ke integer");
        int angkaAwal  = 42;
        double Real  = angkaAwal;  
        int angkaint = (int) Real; 

        System.out.println("silai awal: " + angkaAwal);
        System.out.println("setelah ke double: " + Real);
        System.out.println("kembali ke integer: " + angkaint);

        System.out.println("\nkonkatenasi penjumlahan string");

        String X = "1234";
        String Y = "5678";

        String  S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("X = " + X + ", Y = " + Y);
        System.out.println("S: " + S);
        System.out.println("Z: " + Z);

        System.out.println("\nkonkatenasi penjumlahan double");

        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("P = " + P + ", Q = " + Q);
        System.out.println("R: " + R);
        System.out.println("D: " + D);

        System.out.println("\ninteger A konversi S");

        Integer A = Integer.parseInt(S);

        System.out.println("S = \"" + S + "\"");
        System.out.println("A = " + A);

        System.out.println("\nstring T konversi A");

        String T = A.toString();

        System.out.println("A = " + A);
        System.out.println("T = \"" + T + "\"");

        System.out.println("NOMOR 2");
        Mahasiswa m1 = new Mahasiswa(101, "Dinda Isyariani", "Informatika");
        m1.setProgramStudi();
        System.out.println("setProgramStudi(): " + m1);

        m1.setProgramStudi("Sistem Informasi");
        System.out.println("Setelah setProgramStudi: " + m1);

        System.out.println("\n2c. Konstruktor tanpa parameter");
        Mahasiswa mDefault = new Mahasiswa();
        System.out.println("Konstruktor default  : " + mDefault);

        System.out.println("\n2d. Konstruktor tiga parameter");
        Mahasiswa mLengkap = new Mahasiswa(1234, "Andi Pratama", "Teknik Komputer");
        System.out.println("Konstruktor lengkap  : " + mLengkap);

        System.out.println("\n2e. Konstruktor kloning");

        Mahasiswa mKloning = new Mahasiswa(mLengkap);
        System.out.println("Objek asli: " + mLengkap);
        System.out.println("Hasil kloning: " + mKloning);

        mKloning.setNama("Justin");
        System.out.println("Setelah nama klon diubah:");
        System.out.println("Asli : " + mLengkap);
        System.out.println("Klon : " + mKloning);

        System.out.println("\nNOMOR 3");
        Kucing kucing = new Kucing("Oreo");
        Anjing anjing = new Anjing("Ilham");
        Burung burung = new Burung("Sutisno");
        
        kucing.Gerak();
        kucing.Suara();
       
        anjing.Gerak();
        anjing.Suara();
 
        burung.Gerak();
        burung.Suara();

        /* NOMOR 4 */
        System.out.println("\n NOMOR 4 \n");
        Dosen d1 = new Dosen("Pak Budi", "D1");
        Dosen d2 = new Dosen("Bu Sari", "D2");

        Mahasiswa2 M1 = new Mahasiswa2("Andi", "M1", d1);
        Mahasiswa2 M2 = new Mahasiswa2("Budi", "M2", d1);
        Mahasiswa2 M3 = new Mahasiswa2("Citra", "M3", d2);
        Mahasiswa2 M4 = new Mahasiswa2("Dina", "M4", d2);
        Mahasiswa2 M5 = new Mahasiswa2("Eka", "M5", d1);

        Seminar seminar = new Seminar();

        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(M1);
        seminar.registrasi(M2);
        seminar.registrasi(M3);
        seminar.registrasi(M4);
        seminar.registrasi(M5);

        System.out.println("Daftar Peserta:");
        seminar.tampilPeserta();

        System.out.println("\nTotal Peserta: " + seminar.countPeserta());

        System.out.println("Total Mahasiswa: " + seminar.countMahasiswa());

        M1.setWali(d2);

        System.out.println("\nData Mahasiswa:");
        M1.tampilDataMahasiswa();
        M2.tampilDataMahasiswa();
        M3.tampilDataMahasiswa();
        M4.tampilDataMahasiswa();
        M5.tampilDataMahasiswa();
 
    }
}

// hasil renungan = polimorfisme itu satu tipe data bisa dipakai untuk banyak jenis objek yang berbeda jadi bisa untuk menampung banyak jenis objek