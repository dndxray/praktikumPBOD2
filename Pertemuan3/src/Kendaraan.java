public class Kendaraan {
    private String noPlat;
    private String jenis;

    Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    Kendaraan(){
        noPlat = "0";
        jenis = "0";
    }

    public String getnoPlat(){
        return noPlat;
    }

    public String getjenis(){
        return jenis;
    }

    public void setnoPlat(String noPlat){
        this.noPlat= noPlat;
    }

    public void setjenis(String jenis){
        this.jenis = jenis;
    }



}
