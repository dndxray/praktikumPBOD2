public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks; 

    MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.sks = sks;
        this.nama = nama;
    }

    MataKuliah(){
        idMatKul = "0";
        nama = "0";
        sks = 0;  
    }

    public String getidMatKul(){
        return idMatKul;
    }

    public String getnama(){
        return nama;
    }

    public int getsks(){
        return sks;
    }

    public void setidMatKul(String idmatkul){
        this.idMatKul = idmatkul;
    }

    public void setnama(String nama){
        this.nama= nama;
    }

    public void setsks(int sks){
        this.sks = sks;
    }

}
