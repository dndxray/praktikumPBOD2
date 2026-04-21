/* 
NAMA = Dinda Isyariani
NIM = 24060124140165
LAB = D2
TANGGAL = selasa 21/4/2026
*/
public class Burung extends Anabul {

    public Burung(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Burung " + super.getNama() + " Bergerak Dengan Terbang.");
    }

    @Override
    public void Suara() {
        System.out.println("Suara Burung " + super.getNama() + " Berbunyi Cuit.");
    }
}