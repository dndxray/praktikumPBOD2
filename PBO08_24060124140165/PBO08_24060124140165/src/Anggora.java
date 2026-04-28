public class Anggora extends Kucing {

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void Suara() {
        System.out.println("Kucing Anggora " + getNama() + " berbunyi meong lembut.");
    }
}