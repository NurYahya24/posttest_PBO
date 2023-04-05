package laundry;

class Laundry {
    String nama;
    int berat;
    String jenis_layanan;
    
    Laundry(String nama, int berat, String jenis_layanan){
        this.nama = nama;
        this.berat = berat;
        this.jenis_layanan = jenis_layanan;
    }
    void tampil(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Berat : " + this.berat);
        System.out.println("Jenis Layanan : " + this.jenis_layanan);
        System.out.println("");
    }
    public void tambahNama(String nama){
        this.nama=nama;
    }
    public void tambahBerat(int berat){
        this.berat=berat;
    }
    public void tambahJenis(String jenis){
        this.jenis_layanan=jenis;
    }
    public String getNama(){
        return nama;
    }
    
}
