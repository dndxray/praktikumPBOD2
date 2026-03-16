public class main {
    public static void main(String[] args) {

        DosenTetap dt = new DosenTetap(
                "9545647548",
                "78647324",
                "Andi",
                "5 May 1990",
                "1 Januari 2015",
                5000000,
                "Fakultas Sains dan Matematika"
        );
        
        DosenTamu dtamu = new DosenTamu(
                "123456789",
                "99887766",
                "Budi",
                "10 April 1985",
                "1 Januari 2020",
                5000000,
                "Fakultas Informatika",
                12
        );

        dtamu.printInfo();
        System.out.println("--------------------------------");
        dt.printInfo();
    }
}
