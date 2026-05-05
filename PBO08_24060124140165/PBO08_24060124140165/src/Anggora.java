/* 
NAMA = Dinda Isyariani
NIM = 24060124140165
LAB = D2
TANGGAL = selasa 28/4/2026
*/

public class Anggora extends Kucing {

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void Suara() {
        System.out.println("Kucing Anggora " + getNama() + " berbunyi meong lembut.");
    }
}