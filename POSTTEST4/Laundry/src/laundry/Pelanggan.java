package laundry;

public class Pelanggan extends Orang{
    private String password, telp, email;

    public Pelanggan(String password, String nama, String alamat, String email, String telp) {
        super(nama, alamat);
        this.password = password;
        this.telp = telp;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
    
    
}
