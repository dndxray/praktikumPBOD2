public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;

    public BangunDatar(){
    }

    public int getjmlSisi(){
        return jmlSisi;
    }

    public void setjmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getwarna(){
        return warna;
    }

    public void setwarna(String warna){
        this.warna = warna;
    }

    public String getborder(){
        return border;
    }

    public void setborder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("jumlah sisi = " + jmlSisi);
        System.out.println("warna = " + warna);
        System.out.println("border = " + border);
    }
}
