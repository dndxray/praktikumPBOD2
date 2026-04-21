/* 
NAMA = Dinda Isyariani
NIM = 24060124140165
LAB = D2
TANGGAL = selasa 21/4/2026
*/
public abstract class Anabul {

    protected String Nama;

    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public abstract void Gerak();
    public abstract void Suara();
}