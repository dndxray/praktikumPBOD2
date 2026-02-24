public class main {
    public static void main(String[] args) {
        titik T1 = new titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();

        titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        // BAGIAN 4
        titik T3 = new titik();
        titik T4 = new titik(2,5);
        T4.printTitik();
        T3.printTitik();
       //System.out.println("jumlah objek titik = " T3.getcounterTitik());
        T4.kuadran(2, 5);
        T4.jarakpusat();
        titik T5 = T4.getrefleksiX();
        T5.printTitik();
        
        titik T6 = T4.getrefleksiY();
        T6.printTitik();
    }
}
