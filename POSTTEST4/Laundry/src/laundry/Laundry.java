package laundry;

class Laundry {
    String nama,jenis_layanan;
    int berat, total;
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
    
    //overload
    static public int setTotal(int total,int harga, int ongkir){
        return (total * harga) + ongkir;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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
        System.out.println("TOTAL BIAYA : " + this.total);
        System.out.println("STATUS : " + this.status);
    }
    
    
    
}