public class dosen {
        private String nip;
        private String nama;
        private String prodi;

        dosen(String nip, String nama, String prodi){
            this.nip = nip;
            this.nama = nama;
            this.prodi = prodi;
        }
        dosen(){
            nip = "0";
            nama = "0";
            prodi = "0";
        }

        public String setnip(){
            return nip;
        }
        public String setnama(){
            return nama;
        }
        public String setprodi(){
            return prodi;
        }

        public String getnip(){
            return nip;
        }
        public String getnama(){
            return nama;
        }
        public String getprodi(){
            return prodi;
        }
   
    }
