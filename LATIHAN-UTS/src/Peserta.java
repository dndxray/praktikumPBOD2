public abstract class Peserta {
    protected String ktp;
    protected String nama;
    protected String email;

    public Peserta(String ktp, String nama, String email) {
        this.ktp = ktp;
        this.nama = nama;
        this.email = email;
    }

    public abstract void printInfo();
}