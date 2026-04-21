public class Main {
    public static void main(String[] args) {
        // 1. Setup Pelatihan
        Regular javaProg = new Regular("REG01", "Java Programming", 20, "Pak Budi", 1000000, 6, "Intermediate", "Kelompok");
        Insidental webSeminar = new Insidental("INS01", "Web Development 101", 100, "Ibu Siti", 200000, true, "2026-05-15");

        // 2. Setup Peserta
        Umum dindaUmum = new Umum("330123456", "Dinda Isyariani", "dinda@email.com");
        Member budiMember = new Member("330987654", "Budi Santoso", "budi@email.com", "MBR-001", "2026-01-01");

        // 3. Proses Registrasi
        Registrasi reg1 = new Registrasi("2026-04-01", "2026-04-01", "Tunai", dindaUmum, javaProg);
        Registrasi reg2 = new Registrasi("2026-04-02", "2026-04-02", "Non-Tunai", budiMember, webSeminar);

        // 4. Tampilkan Detail sesuai soal
        System.out.println("--- LAPORAN PENDAFTARAN LPK ---\n");
        reg1.tampilkanDetail();
        reg2.tampilkanDetail();

        // 5. Contoh jika pajak diubah oleh pemerintah
        Pelatihan.setPajak(0.12); // Naik jadi 12%
        System.out.println("--- SETELAH PAJAK NAIK MENJADI 12% ---");
        System.out.println("Harga baru reg1: Rp " + reg1.hitungHargaAkhir());
    }
}