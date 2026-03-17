public class Lingkaran extends BangunDatar {
    private Double jari;

    public Lingkaran() {
        setjmlSisi(0); 
    }

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    public boolean isEqualLuas(Lingkaran X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(Lingkaran X) {
        return this.getKeliling() == X.getKeliling();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * (double) percent / 100;
    }
}