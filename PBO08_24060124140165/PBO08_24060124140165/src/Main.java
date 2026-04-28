public class Main {
    public static void main(String[] args) {


        Kucing k1 = new Kucing("Kitty", 3.5);
        Kucing k2 = new Kucing("Tom", 4.0);
        Anggora a1 = new Anggora("Milo", 2.8);
        Kembangtelon k3 = new Kembangtelon("Oyen", 3.2);

        Anjing anjing1 = new Anjing("Doggy");


        Datum<Anabul> datum = new Datum<>();
        datum.setIsi(k1);

        System.out.println(" Datum ");
        System.out.println("Isi Datum: " + datum.getIsi().getNama());
        System.out.println();


        Integer[] a = {3};
        Integer[] b = {6};

        OperatorGenerik.Tukar(a, b);
        System.out.println("Tukar Integer");
        System.out.println("a: " + a[0] + ", b: " + b[0]);
        System.out.println();

        String[] s1 = {"Dinda"};
        String[] s2 = {"Isyariani"};

        OperatorGenerik.Tukar(s1, s2);
        System.out.println("Tukar String");
        System.out.println("s1: " + s1[0] + ", s2: " + s2[0]);
        System.out.println();

        Anabul[] h1 = {k1};
        Anabul[] h2 = {a1};

        OperatorGenerik.Tukar(h1, h2);
        System.out.println(" Tukar Anabul ");
        System.out.println("h1: " + h1[0].getNama());
        System.out.println("h2: " + h2[0].getNama());
        System.out.println();


        double totalBobot = OperatorGenerik.Bobot2(k1, k2);

        System.out.println("Bobot2 ");
        System.out.println("Total bobot k1 + k2: " + totalBobot);
        System.out.println();


        System.out.println("Polimorfisme");
        Anabul[] daftar = {k1, a1, k3, anjing1};

        for (Anabul ahewan : daftar) {
            ahewan.Gerak();
            ahewan.Suara();
        }
    }
}