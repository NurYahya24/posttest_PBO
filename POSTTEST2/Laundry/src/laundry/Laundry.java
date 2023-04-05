package laundry;

class Laundry {
    private String nama,jenis_layanan;
    private int berat;
    
    public Laundry(String nama, int berat, String jenis_layanan){
        this.nama = nama;
        this.berat = berat;
        this.jenis_layanan = jenis_layanan;
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
    
    
}