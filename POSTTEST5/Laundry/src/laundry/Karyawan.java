package laundry;

public class Karyawan extends Orang{
    private String password, shift, email;
    private int gaji;

    public Karyawan(String password, String shift, int gaji, String nama, String alamat, String email) {
        super(nama, alamat);
        this.password = password;
        this.shift = shift;
        this.gaji = gaji;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
