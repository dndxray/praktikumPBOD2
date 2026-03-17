public abstract class BangunDatar implements IResize {
    private int jmlSisi;
    private String warna;
    private String border;
    
    public static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getjmlSisi() {
        return jmlSisi;
    }

    public void setjmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getwarna() {
        return warna;
    }

    public void setwarna(String warna) {
        this.warna = warna;
    }

    public String getborder() {
        return border;
    }

    public void setborder(String border) {
        this.border = border;
    }

    public abstract double getLuas();
    public abstract double getKeliling();

    public void printInfo() {
        System.out.println("Jumlah sisi = " + jmlSisi);
        System.out.println("Warna = " + warna);
        System.out.println("Border = " + border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);
    }
}