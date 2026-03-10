public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(){

    }

    public Lingkaran (double jari, String warna, String border){
        this.jari = jari;
        setwarna(warna);
        setborder(border);
    }

    public double getjari(){
        return jari;
    }

    public void setjari(double jari){
        this.jari = jari;
    } 

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }
    
}
