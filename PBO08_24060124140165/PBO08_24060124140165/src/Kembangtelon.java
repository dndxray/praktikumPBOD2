public class Kembangtelon extends Kucing {

    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void Gerak() {
        System.out.println("Kucing Kembang Telon " + getNama() + " bergerak lincah.");
    }
}