/*  *Nama File : Titik.java
    * Deskripsi : berisi atribut dan method dalam class titik 
    * Pembuat : Dinda Isyariani
    * Tanggal : 20 Februari 2026
*/

public class titik {
    /**********ATRIBUT*******/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /********METHOD********/


    // KONSTRUKTOR

    titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }


    titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }


    // titik(double absis, double ordinat){
    //     this.absis = absis;
    //     this.ordinat = ordinat;
    //     counterTitik++;
    // }

    // titik(){
    //     this(0,0);
    // }


    // mengembalikan nilai counterTitik
    static int getcounterTitik(){
        return counterTitik;
    }

    // print counter titik
    void printcounterTitik(){
        System.out.println(this.counterTitik);
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

    // kuadran
    void kuadran(double x, double y){
        if (x > 0 && y > 0){
            System.out.println("kuadran 1");
        }
        else if(x > 0 && y < 0){
            System.out.println("kuadran ");
        }
        else if(x < 0 && y < 0){
            System.out.println("kuadran 3");
        }
        else if(x < 0 && y > 0){
            System.out.println("kuadran 4");
        }

    }

    // JARAK KE PUSAT
    void jarakpusat(){
        double jarak = Math.sqrt(absis*absis + ordinat*ordinat);
        System.out.println("jarak ke pusat" + jarak);
    }

    // jarak ke titik tertentu
    // void jarakKetitik(titik a){
    //     double dy = 
    //     double dx = absis - a.absis;
    // }


    // REFLEKSI X
    void refleksiX(){
        ordinat = -ordinat;
        System.out.println("update X = " + ordinat);
    }

    //  REFLEKSI Y
    void refleksiY(){
        absis = -absis;
        System.out.println("update Y = " + absis);
    }

    // GETREFLEKSIX()
    titik getrefleksiX(){
        return new titik(absis, -ordinat);
    }

    // GETREFLEKSIY()
    titik getrefleksiY(){
        return new titik(-absis,ordinat);
    }

    // mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

}
