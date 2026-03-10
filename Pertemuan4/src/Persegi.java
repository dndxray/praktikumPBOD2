import java.lang.Math;
public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(){
        setjmlSisi(4);
    }

    public Persegi (double sisi, String warna, String border){
        this.sisi = sisi;
      //  super(4, warna, border);
        setwarna(warna);
        setborder(border);
        setjmlSisi(4);
    }

    public double getsisi(){
        return sisi;
    }

    public void setsisi(double sisi){
        this.sisi = sisi;
    }
    
    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return sisi*4;
    }

    public double getDiagonal(){
        return sisi * (Math.sqrt(2));
    }
}
