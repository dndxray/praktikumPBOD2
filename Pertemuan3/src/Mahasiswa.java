import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;

    private ArrayList<MataKuliah> listMatKul;
    private dosen dosenWali;
    private Kendaraan kendaraan;


    public Mahasiswa(String nim,String nama,String prodi){
            this.nim = nim;
            this.nama = nama;
            this.prodi = prodi;
            this.listMatKul = new ArrayList<>();
            // this.dosenWali = dosenWali;
            // this.kendaraan = kendaraan;
        
        }
    // public Mahasiswa(){
    //     this(nim->"0", nama->"0", prodi->"0", new ArrayList<>(), new dosen(), new kendaraan());
    // }

    Mahasiswa(){
        nim = "0";
        nama = "0";
        prodi = "0";  
    }

    public String getnim(){
        return nim;
    }
    public String getnama(){
        return nama;
    }
    public String getprodi(){
        return prodi;
    }
    public int getJumlahSKS(){
        int jumlah = 0 ;

        for (int i = 0 ; i < listMatKul.size() ; i++ ){
            int sks = listMatKul.get(i).getsks();
            jumlah += sks;
        }
        return jumlah;
    }
    public int getJumlahMatkul(){
        int jumlah = 0;
        for (int i = 0 ; i < listMatKul.size() ; i++){
            jumlah++;
        }
        return jumlah;
    }

    public ArrayList<MataKuliah> getListMatKul() {
        return listMatKul;
    }

    public dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setnim(String nim){
        this.nim= nim;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public void setprodi(String prodi){
        this.prodi = prodi;
    }
    
    public void setListMatKul(ArrayList<MataKuliah> listMatKul) {
        this.listMatKul = listMatKul;
    }

    public void setDosenWali(dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah newMataKuliah){
        listMatKul.add(newMataKuliah);
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for (i = 0 ; i < listMatKul.size() ; i++){
            System.out.println(listMatKul.get(i).getnama());
        }
        System.out.println("dosen : "+ dosenWali.getnama());
        System.out.println("jenis : "+ kendaraan.getjenis());
    }

    public void printMhs(){
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Prodi: " + prodi);
    }
}
