package laundry;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;




public class App {
    public static void main(String[] args) throws NumberFormatException, IOException{
        int qty, pilih, select;
        String nama, jenis;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<Laundry> dataset = new ArrayList<>();
        while(true){
            System.out.println("====MENU ADMIN====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Edit Data");
            System.out.println("5. Keluar");
            System.out.println("Msukkan Pilihan...");
            pilih = Integer.parseInt(br.readLine());
            if(pilih == 1){
                System.out.println("Masukkan Nama : ");
                nama = br.readLine();
                System.out.println("Masukkan Berat Pakaian : ");
                qty = Integer.parseInt(br.readLine());
                System.out.println("Pilih Jenis Layanan : ");
                System.out.println("1. Dry Clean");
                System.out.println("2. Wet Clean");
                System.out.println("Masukkan Pilihan...");
                select = Integer.parseInt(br.readLine());
                if(select == 1){
                    jenis = "Dry Clean";
                }else if(select == 2){
                    jenis = "Wet Clean";
                }else{
                    System.out.println("Pilihan Tidak Tersedia");
                    continue;
                }
                Laundry new_data = new Laundry(nama, qty, jenis);
                dataset.add(new_data);
                System.out.println("DATA BERHASIL DITAMBAH");
            }else if(pilih == 2){
                System.out.println("====DATA PELANGGAN====");
                if(dataset.size()<1){
                    System.out.println("====DATA MASIH KOSONG====");
                }
                for(int i=0;i<dataset.size(); i++){
                    System.out.println("Data Ke-" + (i+1));
                    System.out.println("NAMA : " + dataset.get(i).getNama());
                    System.out.println("BERAT PAKAIAN : " + dataset.get(i).getBerat());
                    System.out.println("JENIS LAYANAN : " + dataset.get(i).getJenis_layanan());
                    System.out.println("=======================================");
                }
            }else if(pilih == 3){
                System.out.println("====HAPUS DATA====");
                if(dataset.size()<1){
                    System.out.println("====DATA MASIH KOSONG====");
                    continue;
                }
                for(int i=0;i<dataset.size(); i++){
                    System.out.println("Data Ke-" + (i+1));
                    System.out.println("NAMA : " + dataset.get(i).getNama());
                    System.out.println("BERAT PAKAIAN : " + dataset.get(i).getBerat());
                    System.out.println("JENIS LAYANAN : " + dataset.get(i).getJenis_layanan());
                    System.out.println("=======================================");
                }
                System.out.println("Pilih Data Ke Berapa Yang Ingin Dihapus...");
                select = Integer.parseInt(br.readLine());
                select -=1;
                dataset.remove(select);
            }else if(pilih == 4){
                System.out.println("====EDIT DATA====");
                if(dataset.size()<1){
                    System.out.println("====DATA MASIH KOSONG====");
                    continue;
                }
                for(int i=0;i<dataset.size(); i++){
                    System.out.println("Data Ke-" + (i+1));
                    System.out.println("NAMA : " + dataset.get(i).getNama());
                    System.out.println("BERAT PAKAIAN : " + dataset.get(i).getBerat());
                    System.out.println("JENIS LAYANAN : " + dataset.get(i).getJenis_layanan());
                    System.out.println("=======================================");
                }
                System.out.println("Pilih Data Ke Berapa Yang Ingin Diubah...");
                select = Integer.parseInt(br.readLine());
                select -=1;
                Laundry edit = dataset.get(select);
                if(select <= dataset.size() & select>=0){
                    System.out.println("=============");
                    System.out.println("1. Ubah Nama");
                    System.out.println("2. Ubah Berat Pakaian");
                    System.out.println("3. Ubah Jenis Layanan");
                    System.out.println("Masukkan Pilihan...");
                    select = Integer.parseInt(br.readLine());
                    if(select == 1){
                        System.out.println("Masukkan Nama Baru : ");
                        edit.setNama(br.readLine());
                    }else if(select == 2){
                        System.out.println("Masukkan Berat Baru : ");
                        edit.setBerat(Integer.parseInt(br.readLine()));
                    }else if(select == 3){
                        System.out.println("====JENIS LAYANAN====");
                        System.out.println("1. Dry Clean");
                        System.out.println("2. Wet Clean");
                        System.out.println("Masukkan Pilihan...");
                        select = Integer.parseInt(br.readLine());
                        if(select == 1){
                            jenis = "Dry Clean";
                        }else if(select == 2){
                            jenis = "Wet Clean";
                        }else{
                            System.out.println("Pilihan Tidak Tersedia");
                            continue;
                        }
                        edit.setJenis_layanan(jenis);
                    }else{
                        System.out.println("====Pilihan Tidak Tersedia====");
                    }
                }
            }else if(pilih == 5){
                System.out.println("====TERIMA KASIH====");
                break;
            }else{
                System.out.println("====PILIHAN TIDAK VALID====");
            }
        }
    }
    
}
