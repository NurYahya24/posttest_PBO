package laundry;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;




public class App {
    public static void main(String[] args) throws NumberFormatException, IOException{
        int qty, pilih, select, total = 0;
        String nama, jenis = null, mail, pw;
        boolean kondisi;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<Laundry> dataset = new ArrayList<>();
        ArrayList<Pelanggan> datacust = new ArrayList<>();
        ArrayList<Online> dataon = new ArrayList<>();
        Karyawan admin = new Karyawan("admin", "siang", 300000, "admin", "Jl. Panjaitan", "admin@gmail.com");
        while(true){
            kondisi = true;
            System.out.println("\n\n=====SELAMAT DATANG DI SISTEM LAUNDRY======");
            System.out.println("1. Log In");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.println("===========================================");
            System.out.println("Masukkan pilihan...");
            select = Integer.parseInt(br.readLine());
            if(select == 1){
                System.out.println("\n\n=================LOGIN FORM=================");
                System.out.println("Masukkan Email : ");
                mail = br.readLine();
                System.out.println("Masukkan Password : ");
                pw = br.readLine();
                if(mail.equals(admin.getEmail()) & pw.equals(admin.getPassword())){
                    while(kondisi){
                        System.out.println("\n\n=================MENU ADMIN=================");
                        System.out.print("~~~~~selamat datang " + admin.getNama());System.out.println("~~~~~");
                        System.out.println("1. Tambah Data");
                        System.out.println("2. Lihat Data");
                        System.out.println("3. Hapus Data");
                        System.out.println("4. Edit Data");
                        System.out.println("5. Log out");
                        System.out.println("============================================");
                        System.out.println("Msukkan Pilihan...");
                        pilih = Integer.parseInt(br.readLine());
                        if(pilih == 1){
                            System.out.println("Masukkan Nama : ");
                            nama = br.readLine();
                            System.out.println("Masukkan Berat Pakaian (Dalam Kg): ");
                            qty = Integer.parseInt(br.readLine());
                            System.out.println("Pilih Jenis Layanan : ");
                            System.out.println("1. Dry Clean (Rp. 7000/Kg)");
                            System.out.println("2. Wet Clean (Rp. 5000/Kg)");
                            System.out.println("Masukkan Pilihan...");
                            select = Integer.parseInt(br.readLine());
                            if(select == 1){
                                jenis = "Dry Clean";
                                total = qty * 7000;
                            }else if(select == 2){
                                jenis = "Wet Clean";
                                total = qty * 5000;
                            }else{
                                System.out.println("Pilihan Tidak Tersedia");
                                continue;
                            }
                            Laundry new_data = new Laundry(nama, qty, jenis, total, "Dalam Proses", false);
                            dataset.add(new_data);
                            System.out.println("DATA BERHASIL DITAMBAH");
                        }else if(pilih == 2){
                            System.out.println("==============DATA PELANGGAN================");
                            System.out.println("1. TAMPILKAN SEMUA");
                            System.out.println("2. ANTAR-JEMPUT");
                            System.out.println("3. AMBIL SENDIRI");
                            select = Integer.parseInt(br.readLine());
                            if(select==1){
                                if(dataset.size()<1 & dataon.size()<1){
                                    System.out.println("====DATA MASIH KOSONG====");
                                    continue;
                                }
                                System.out.println("\n\n==============DATA KESELURUHAN================");
                                int num=0;
                                for(int i=0;i<dataon.size(); i++){
                                    num++;
                                    System.out.println("Data Ke-" +(num));
                                    dataon.get(i).display();
                                    System.out.println("------------------------------------------");
                                }
                                for(int i=0;i<dataset.size(); i++){
                                    num++;
                                    System.out.println("Data Ke-" +(num));
                                    dataset.get(i).display();
                                    System.out.println("------------------------------------------");
                                }
                                
                            }else if(select==2){
                                if(dataon.size()<1){
                                    System.out.println("====DATA MASIH KOSONG====");
                                    continue;
                                }
                                System.out.println("==============ANTAR-JEMPUT================");
                                for(int i=0;i<dataon.size(); i++){
                                    System.out.println("Data Ke-" +(i+1));
                                    dataon.get(i).display();
                                    System.out.println("------------------------------------------");
                                }
                            }else if(select==3){
                                if(dataset.size()<1){
                                    System.out.println("====DATA MASIH KOSONG====");
                                    continue;
                                }
                                System.out.println("=============AMBIL SENDIRI================");
                                for(int i=0;i<dataset.size(); i++){
                                    System.out.println("Data Ke-" +(i+1));
                                    dataset.get(i).display();
                                    System.out.println("------------------------------------------");
                                }
                            }else{
                                System.out.println("KAGA ADA KOCAG");
                            }
                        }else if(pilih == 3){
                            System.out.println("====HAPUS DATA====");
                            if(dataset.size()<1 & dataon.size()<1){
                                System.out.println("====DATA MASIH KOSONG====");
                                continue;
                            }
                            System.out.println("1. DATA ONLINE");
                            System.out.println("2. DATA OFFLINE");
                            select = Integer.parseInt(br.readLine());
                            if(select==1){
                                if(dataon.size()<1){
                                    System.out.println("====DATA MASIH KOSONG====");
                                    continue;
                                }
                                System.out.println("==============ANTAR-JEMPUT================");
                                for(int i=0;i<dataon.size(); i++){
                                    System.out.println("Data Ke-" +(i+1));
                                    dataon.get(i).display();
                                    System.out.println("------------------------------------------");
                                }
                                System.out.println("Pilih Data Ke Berapa Yang Ingin Dihapus...");
                                select = Integer.parseInt(br.readLine());
                                select -=1;
                                dataon.remove(select);
                            }else if(select==2){
                                if(dataset.size()<1){
                                    System.out.println("====DATA MASIH KOSONG====");
                                    continue;
                                }
                                System.out.println("==============AMBIL SENDIRI================");
                                for(int i=0;i<dataset.size(); i++){
                                    System.out.println("Data Ke-" +(i+1));
                                    dataset.get(i).display();
                                    System.out.println("------------------------------------------");
                                }
                                System.out.println("Pilih Data Ke Berapa Yang Ingin Dihapus...");
                                select = Integer.parseInt(br.readLine());
                                select -=1;
                                dataset.remove(select);
                            }
                        }else if(pilih == 4){
                            System.out.println("====EDIT DATA====");
                            if(dataset.size()<1 & dataon.size()<1){
                                System.out.println("====DATA MASIH KOSONG====");
                                continue;
                            }
                            System.out.println("1. DATA ONLINE");
                            System.out.println("2. DATA OFFLINE");
                            select = Integer.parseInt(br.readLine());
                            if(select==1){
                                if(dataon.size()<1){
                                    System.out.println("====DATA MASIH KOSONG====");
                                    continue;
                                }
                                for(int i=0;i<dataon.size(); i++){
                                    System.out.println("Data Ke-" +(i+1));
                                    dataon.get(i).display();
                                    System.out.println("------------------------------------------");
                                }
                                System.out.println("Pilih Data Ke Berapa Yang Ingin Diubah...");
                                select = Integer.parseInt(br.readLine());
                                select -=1;
                                Laundry edit = dataon.get(select);
                                if(select <= dataon.size() & select>=0){
                                    System.out.println("=============");
                                    System.out.println("1. Ubah Nama");
                                    System.out.println("2. Ubah Berat Pakaian");
                                    System.out.println("3. Ubah Jenis Layanan");
                                    System.out.println("4. Ubah Status Pakaian");
                                    System.out.println("Masukkan Pilihan...");
                                    select = Integer.parseInt(br.readLine());
                                    if(select == 1){
                                        System.out.println("Masukkan Nama Baru : ");
                                        edit.setNama(br.readLine());
                                    }else if(select == 2){
                                        System.out.println("Masukkan Berat Baru : ");
                                        qty = Integer.parseInt(br.readLine());
                                        if(edit.getJenis_layanan().equals("Dry Clean")){
                                            total = qty * 7000;
                                        }else{
                                            total = qty * 5000;
                                        }
                                        edit.setTotal(total);
                                        edit.setBerat(qty);
                                    }else if(select == 3){
                                        System.out.println("====JENIS LAYANAN====");
                                        System.out.println("1. Dry Clean");
                                        System.out.println("2. Wet Clean");
                                        System.out.println("Masukkan Pilihan...");
                                        select = Integer.parseInt(br.readLine());
                                        qty = edit.getBerat();
                                        if(select == 1){
                                            jenis = "Dry Clean";
                                            total = qty * 7000;
                                        }else if(select == 2){
                                            jenis = "Wet Clean";
                                            total = qty * 5000;
                                        }else{
                                            System.out.println("Pilihan Tidak Tersedia");
                                            continue;
                                        }
                                        edit.setTotal(total);
                                        edit.setJenis_layanan(jenis);
                                    }else if(select == 4){
                                        System.out.println("Masukkan Status Pakaian : ");
                                        edit.setStatus(br.readLine());
                                    }
                                    else{
                                        System.out.println("====Pilihan Tidak Tersedia====");
                                    }
                                }
                            }else if(select==2){
                                if(dataset.size()<1){
                                    System.out.println("====DATA MASIH KOSONG====");
                                    continue;
                                }
                                for(int i=0;i<dataset.size(); i++){
                                    System.out.println("Data Ke-" +(i+1));
                                    dataset.get(i).display();
                                    System.out.println("------------------------------------------");
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
                                    System.out.println("4. Ubah Status Pakaian");
                                    System.out.println("Masukkan Pilihan...");
                                    select = Integer.parseInt(br.readLine());
                                    if(select == 1){
                                        System.out.println("Masukkan Nama Baru : ");
                                        edit.setNama(br.readLine());
                                    }else if(select == 2){
                                        System.out.println("Masukkan Berat Baru : ");
                                        qty = Integer.parseInt(br.readLine());
                                        if(edit.getJenis_layanan().equals("Dry Clean")){
                                            total = qty * 7000;
                                        }else{
                                            total = qty * 5000;
                                        }
                                        edit.setTotal(total);
                                        edit.setBerat(qty);
                                    }else if(select == 3){
                                        System.out.println("====JENIS LAYANAN====");
                                        System.out.println("1. Dry Clean");
                                        System.out.println("2. Wet Clean");
                                        System.out.println("Masukkan Pilihan...");
                                        select = Integer.parseInt(br.readLine());
                                        qty = edit.getBerat();
                                        if(select == 1){
                                            jenis = "Dry Clean";
                                            total = qty * 7000;
                                        }else if(select == 2){
                                            jenis = "Wet Clean";
                                            total = qty * 5000;
                                        }else{
                                            System.out.println("Pilihan Tidak Tersedia");
                                            continue;
                                        }
                                        edit.setTotal(total);
                                        edit.setJenis_layanan(jenis);
                                    }else if(select == 4){
                                        System.out.println("Masukkan Status Pakaian : ");
                                        edit.setStatus(br.readLine());
                                    }
                                    else{
                                        System.out.println("====Pilihan Tidak Tersedia====");
                                    }
                                }
                            }
                        }else if(pilih == 5){
                            System.out.println("====TERIMA KASIH====");
                            kondisi = false;
                        }else{
                            System.out.println("====PILIHAN TIDAK VALID====");
                        }
                    }
                }else{
                    if(datacust.isEmpty()){
                        System.out.println("PASSWORD ATAU EMAIL SALAH");
                        continue;
                    }
                    for(Pelanggan login : datacust){
                        if(login.getEmail().equals(mail) & login.getPassword().equals(pw)){
                            while(kondisi){
                                nama = login.getNama();
                                mail = login.getEmail();
                                String alamat = login.getAlamat();
                                System.out.println("\n\n=================MENU PELANGGAN=================");
                                System.out.print("~~~~~selamat datang " + login.getNama());System.out.println("~~~~~");
                                System.out.println("1. Request Jemput Pakaian");
                                System.out.println("2. Lihat Status Pakaian");
                                System.out.println("3. Edit Profil");
                                System.out.println("4. Log out");
                                System.out.println("============================================");
                                System.out.println("Msukkan Pilihan...");
                                pilih = Integer.parseInt(br.readLine());
                                if(pilih==1){
                                    System.out.println("========LAYANAN ANTAR-JEMPUT=========");
                                    System.out.println("Siapkan baju dalam plastik, kurir akan menjemput sesuai alamat profil(pastikan alamat sesuai sebelum memesan)\nBerat pakaian harus 5kg");
                                    System.out.println("===========JENIS LAYANAN============");
                                    System.out.println("1. Dry Clean (Rp. 7000/Kg)");
                                    System.out.println("2. Wet Clean (Rp. 5000/Kg)");
                                    System.out.println("Masukkan Pilihan...");
                                    select = Integer.parseInt(br.readLine());
                                    if(select==1){
                                        jenis = "Dry Clean";
                                        total = Online.setTotal(5, 7000, 5000);
                                    }else if(select==2){
                                        jenis = "Wet Clean";
                                        total = Online.setTotal(5, 5000, 5000);
                                    }
                                    Online databaru = new Online(alamat, nama, 5, jenis, total, mail, "Sedang Dijemput", true);
                                    dataon.add(databaru);
                                }else if(pilih==2){
                                    System.out.println("\n\n=================STATUS PAKAIAN==================");
                                    for(int i = 0;i<dataon.size();i++){
                                        if(dataon.get(i).getMail().equals(login.getEmail())){
                                            System.out.println("Data Ke-" +(i+1));
                                            dataon.get(i).display();
                                            System.out.println("------------------------------------------");
                                        }
                                    }
                                }else if (pilih==3){
                                    System.out.println("\n\n=================EDIT PROFIL==================");
                                    System.out.println("1. UBAH NAMA");
                                    System.out.println("2. UBAH ALAMAT");
                                    System.out.println("3. UBAH PASSWORD");
                                    System.out.println("4. UBAH NO. TELP");
                                    System.out.println("Masukkan Pilihan...");
                                    select = Integer.parseInt(br.readLine());
                                    if(select==1){
                                        System.out.println("Masukkan Nama Baru : ");
                                        login.setNama(br.readLine());
                                    }else if(select==2){
                                        System.out.println("Masukkan Alamat Baru : ");
                                        login.setAlamat(br.readLine());
                                    }else if(select==3){
                                        System.out.println("Masukkan Password Baru : ");
                                        login.setPassword(br.readLine());
                                    }else if(select==4){
                                        System.out.println("Masukkan No. Telp Baru : ");
                                        login.setTelp(br.readLine());
                                    }else{
                                        System.out.println("GA ADA KOCAG");
                                    }
                                }
                                else if (pilih==4){
                                    System.out.println("============TERIMA KASIH=============");
                                    kondisi = false;
                                }
                            }
                        }else{
                            System.out.println("PASSWORD ATAU EMAIL SALAH");
                        }
                    }
                }
                
            }else if(select==2){
                while(kondisi){
                    System.out.println("\n\n=================REGIST FORM=================");
                    System.out.println("Masukkan Email : ");mail = br.readLine();
                    if(datacust.isEmpty()){
                        System.out.println("Masukkan Nama : ");nama = br.readLine();
                            System.out.println("Masukkan Alamat : ");String alamat = br.readLine();
                            System.out.println("Masukkan No. Telp : ");String telp = br.readLine();
                            System.out.println("Masukkan Password : ");pw = br.readLine();

                            Pelanggan databaru = new Pelanggan(pw, nama, alamat, mail, telp);
                            datacust.add(databaru);
                            kondisi = false;
                    }else{
                        for(Pelanggan regis : datacust){
                            if(regis.getEmail().equals(mail)){
                                System.out.println("EMAIL SUDAH TERDAFTAR");
                                continue;
                            }
                            System.out.println("Masukkan Nama : ");nama = br.readLine();
                            System.out.println("Masukkan Alamat : ");String alamat = br.readLine();
                            System.out.println("Masukkan No. Telp : ");String telp = br.readLine();
                            System.out.println("Masukkan Password : ");pw = br.readLine();

                            Pelanggan databaru = new Pelanggan(pw, nama, alamat, mail, telp);
                            datacust.add(databaru);
                            kondisi = false;
                        }
                    }
                        
                }
            }else if(select == 3){
                System.out.println("================TERIMA KASIH===================");
                break;
            }else{
                System.out.println("PILIHAN TIDAK TERSEDIA");
            }
        }
    }
    
}
