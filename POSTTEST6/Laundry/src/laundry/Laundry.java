package laundry;

abstract class Laundry {
    String nama,jenis_layanan;
    int berat;
    String status;
    boolean online;
    
    
    
    //offline method
    public Laundry(String nama, int berat, String jenis_layanan, String status, boolean online){
        this.nama = nama;
        this.berat = berat;
        this.jenis_layanan = jenis_layanan;
        this.status = status;
        this.online = online;
    }
    
    


    
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

    static public int setTotal(int total,int harga, int ongkir){
        return (total * harga) + ongkir;
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


    
    void display(){
        System.out.println("NAMA : " + this.nama);
        System.out.println("BERAT PAKAIAN : " + this.berat);
        System.out.println("JENIS LAYANAN : " + this.jenis_layanan);
        System.out.println("STATUS : " + this.status);
    }
    
    public abstract int serviceType(boolean types);
    
    
    
}