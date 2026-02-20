/*  *Nama File : Titik.java
    * Deskripsi : berisi atribut dan method dalam class titik 
    * Pembuat : Dinda Isyariani
    * Tanggal : 20 Februari 2026
*/

public class Titik {
    /**********ATRIBUT*******/
    double absis;
    double ordinat;

    /********METHOD********/
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    // mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru x
    void setOrdinat(double y){
        ordinat = y;
    }

    // menggeser nilai absis dan ornidat titik masing masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

}

// public class MTitik{
//     public static void main(String[] args) {
//         Titik T1 = new Titik();
//         T1.setAbsis(3);
//         T1.setOrdinat(4);
//         T1.printTitik();
//         T1.geser(3,4);
//         T1.printTitik();
//     }
// }