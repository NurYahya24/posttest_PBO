package laundry;

public class Online extends Laundry{
    String alamat, mail;
    
    //online
    public Online(String alamat, String nama, int berat, String jenis_layanan, int total, String mail, String status, boolean online) {
        super(nama, berat, jenis_layanan, total, status, online);
        this.alamat = alamat;
        this.mail = mail;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    

    @Override
    void display(){
        super.display();
        System.out.println("ALAMAT : " + this.alamat);
    }
    
}
