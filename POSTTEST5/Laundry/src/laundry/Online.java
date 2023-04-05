package laundry;

public class Online extends Laundry{
    String alamat, mail;
    final int wetPrice = 5000;
    final int dryPrice = 7000;
    
    //online
    public Online(String alamat, String nama, int berat, String jenis_layanan, String mail, String status, boolean online) {
        super(nama, berat, jenis_layanan, status, online);
        this.alamat = alamat;
        this.mail = mail;
    }

    final public String getAlamat() {
        return alamat;
    }

    final public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    final public String getMail() {
        return mail;
    }

    final public void setMail(String mail) {
        this.mail = mail;
    }
    

    @Override
    void display(){
        super.display();
        System.out.println("ALAMAT : " + this.alamat);
    }
    
    @Override
    public int serviceType(boolean types){
        if(types){
            return getWetPrice() * super.getBerat();
        }else{
            return getDryPrice() * super.getBerat();
        }
    }
    
    private int getWetPrice(){
        return wetPrice;
    }
    private int getDryPrice(){
        return dryPrice;
    }
    
}
