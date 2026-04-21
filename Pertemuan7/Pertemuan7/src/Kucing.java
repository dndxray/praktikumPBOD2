/* 
NAMA = Dinda Isyariani
NIM = 24060124140165
LAB = D2
TANGGAL = selasa 21/4/2026
*/
public class Kucing extends Anabul {

    public Kucing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Kucing " + super.getNama() + " Bergerak Dengan Melata.");
    }

    @Override
    public void Suara() {
        System.out.println("Suara Kucing " + super.getNama() + " Berbunyi Meong.");
    }
}