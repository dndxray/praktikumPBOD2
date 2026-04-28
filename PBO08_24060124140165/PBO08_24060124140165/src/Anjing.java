/* 
NAMA = Dinda Isyariani
NIM = 24060124140165
LAB = D2
TANGGAL = selasa 28/4/2026
*/
public class Anjing extends Anabul {

    public Anjing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Anjing " + super.getNama() + " Bergerak Dengan Melata.");
    }

    @Override
    public void Suara() {
        System.out.println("Suara Anjing " + super.getNama() + " Berbunyi Guk-Guk.");
    }
}