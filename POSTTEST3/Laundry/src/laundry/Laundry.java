package laundry;

class Laundry {
    private String nama,jenis_layanan, mail, alamat;
    private int berat, total;
    String status;
    boolean online;
    
    
    //offline method
    public Laundry(String nama, int berat, String jenis_layanan, int total, String status, boolean online){
        this.nama = nama;
        this.berat = berat;
        this.jenis_layanan = jenis_layanan;
        this.total = total;
        this.status = status;
        this.online = online;
        
    }
    
    //online method trough customer page
    public Laundry(String nama, int berat, String jenis_layanan, int total, String mail, String status, boolean online, String alamat){
        this.nama = nama;
        this.berat = berat;
        this.jenis_layanan = jenis_layanan;
        this.total = total;
        this.mail = mail;
        this.status = status;
        this.online = online;
        this.alamat = alamat;
    }
//    void tampil(){
//        System.out.println("Nama : " + this.nama);
//        System.out.println("Berat : " + this.berat);
//        System.out.println("Jenis Layanan : " + this.jenis_layanan);
//        System.out.println("");
//    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_layanan() {
        return jenis_layanan;
    }

    public void setJenis_layanan(String jenis_layanan) {
        this.jenis_layanan = jenis_layanan;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
    
    
}