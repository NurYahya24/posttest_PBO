package laundry;

public class Offline extends Laundry{
    final int wetPrice = 5000;
    final int dryPrice = 7000;

    public Offline(String nama, int berat, String jenis_layanan, String status, boolean online) {
        super(nama, berat, jenis_layanan, status, online);
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
