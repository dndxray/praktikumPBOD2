/* 
NAMA = Dinda Isyariani
NIM = 24060124140165
LAB = D2
TANGGAL = selasa 21/4/2026
*/
public class Kucing extends Anabul {
    private double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void Gerak() {
        System.out.println("Kucing " + super.getNama() + " bergerak dengan melata.");
    }

    @Override
    public void Suara() {
        System.out.println("Suara kucing " + super.getNama() + " berbunyi meong.");
    }
}