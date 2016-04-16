/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketingKeretaApi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hirianinda M.S
 */
public class Aplikasi {
    private ArrayList<Kereta> daftarKereta;
    private ArrayList<Ticket> daftarTicket;
    private ArrayList<Gerbong> daftarGerbong;
    private ArrayList<Stasiun> daftarStasiun;
    private ArrayList<Rute> daftarRute;
    
    public Aplikasi () {
        daftarKereta = new ArrayList<>();
        daftarTicket = new ArrayList<>();
        daftarGerbong = new ArrayList<>();
        daftarStasiun = new ArrayList<>();
        daftarRute = new ArrayList<>();
    }
    
    public void addKereta (String namakereta, String jadwalkeberangkatan, String idkereta, String idrute){
        Kereta k = new Kereta(namakereta, jadwalkeberangkatan, idkereta);
        getRute(idrute).addkereta(k);
        daftarKereta.add(k);
    }
    
    public void addTicket (String nama, long noIdentitas, String idticket){
        daftarTicket.add(new Ticket(nama,noIdentitas, idticket));
    }
    
    public void addGerbong (String tipegerbong, String idgerbong, String idkereta){
        Gerbong g = new Gerbong(tipegerbong, idgerbong);
        getKereta(idkereta).addgerbong(g);
        daftarGerbong.add(g);
    }
    
    public void addStasiun (String namastatsiun, String namakota, String idstasiun){
        daftarStasiun.add(new Stasiun(namastatsiun,namakota, idstasiun));
    }
    
    public void addRute (String idrute, Stasiun stasiunawal, Stasiun stasiuntujuan, String idticket){
        Rute r = new Rute(idrute, stasiunawal, stasiuntujuan);
        getTicket(idticket).addRute(r);
        daftarRute.add(r);
    }
    
    public Ticket getTicket (String idticket) {
        for (Ticket dftTicket : daftarTicket) {
            if (dftTicket.getIdticket().equals(idticket)) {
                return dftTicket;
            }
        }
        
        return null;
    }
    
     public void deleteTicket (String idticket) {
        for (int dftTicket =0; dftTicket < daftarTicket.size(); dftTicket++) {
                Ticket t = daftarTicket.get(dftTicket);
            if (t.getIdticket().equals(idticket)) {
                daftarTicket.remove(dftTicket);
            }
        }
    }

     public Kereta getKereta (String idkereta) {
        for (Kereta dftKereta : daftarKereta) {
            if (dftKereta.getNamakereta().equals(idkereta)) {
                return dftKereta;
            }
        }
        
        return null;
    }
    
     public void deleteKereta (String idkereta) {
        for (int dftKereta =0; dftKereta < daftarKereta.size(); dftKereta++) {
            Kereta k = daftarKereta.get(dftKereta);
            if (k.getIdkereta().equals(idkereta)) {
                daftarKereta.remove(dftKereta);
            }
        }
     }
     
     public Stasiun getStasiun (String idstasiun) {
        for (Stasiun dftStasiun : daftarStasiun) {
            if (dftStasiun.getIdstasiun().equals(idstasiun)) {
                return dftStasiun;
            }
        }
        
        return null;
    }
    
     public void deleteStasiun (String idstasiun) {
        for (int dftStasiun =0; dftStasiun < daftarStasiun.size(); dftStasiun++) {
            Stasiun s = daftarStasiun.get(dftStasiun);
            if (s.getIdstasiun().equals(idstasiun)) {
                daftarStasiun.remove(dftStasiun);
            }
        }
     }
     
     public Gerbong getGerbong (String idgerbong) {
        for (Gerbong dftGerbong : daftarGerbong) {
            if (dftGerbong.getIdgerbong().equals(idgerbong)) {
                return dftGerbong;
            }
        }
        
        return null;
    }
    
     public void deleteGerbong (String idgerbong) {
       for (int dftGerbong = 0; dftGerbong < daftarGerbong.size(); dftGerbong++) {
            Gerbong g = daftarGerbong.get(dftGerbong);
            if (g.getIdgerbong().equals(idgerbong)) {
                daftarGerbong.remove(dftGerbong);
            }
        }
     }
     
     public Rute getRute (String idrute) {
        for (Rute dftRute : daftarRute) {
            if (dftRute.getIdrute().equals(idrute)) {
                return dftRute;
            }
        }
        
        return null;
    }
    
     public void deleteRute (String idrute) {
        for (int dftRute =0; dftRute  < daftarRute.size(); dftRute ++) {
            Rute r = daftarRute.get(dftRute );
            if (r.getIdrute().equals(idrute)) {
                daftarRute.remove(dftRute );
            }
        }
     }
     
     
     public void Menu()
    {
        Scanner inputan = new Scanner(System.in);


        int pil = -1;
        while (pil != 0)
        {
            System.out.println("====MENU====");
            System.out.println("1. Add Ticket");
            System.out.println("2. Add Rute");
            System.out.println("3. Add Stasiun");
            System.out.println("4. Add Kereta");
            System.out.println("5. Add Gerbong");
            System.out.println("6. Delete Ticket");
            System.out.println("7. Delete Rute");
            System.out.println("8. Delete Stasiun");
            System.out.println("9. Delete Kereta");
            System.out.println("10.Delete Gerbong");
            System.out.println("7. View ALL");
            System.out.println("0. Exit");
            System.out.print("Masukkan pilihan : ");
            pil = inputan.nextInt(); 
            int no = 0;
            int nor = 0;
            int nok = 0;
            int nos = 0;
            int nog = 0;
            switch (pil)
            {
                case 1:
                    System.out.println("Masukkan Nama:  ");
                    String nama = inputan.next();
                    System.out.println("Masukkan No Identitas:  ");
                    long noid = inputan.nextLong();
                    String id = "T" + no;
                    no++;
                        addTicket(nama,noid,id);

                        System.out.println("Berhasil !!!");
                    break;
                case 2:
                    System.out.println(" Rute ");
                    System.out.println("Pilih Stasiun Asal ");  
                    
                    //Stasiun sa = getStasiun();
                    System.out.println("Pilih Stasiun Tujuan ");
                    //Stasiun st;seharusnya inputan user di GUI tapi saya bingung gimana cara masukinnya
                    
                    String idr = "R" + nor;
                    //addRute(idr,sa,st);
                    break;
                case 3:
                    System.out.println("Masukkan Id Rute : ");
                    String idrute = inputan.next();
                    System.out.println("Masukkan Nama Kereta : ");
                    String nmkereta = inputan.next();
                    String jadwalkeberangkatan = inputan.next();
                    int kapasitaskursi = inputan.nextInt();
                    
                    String idk = "K" + nok;
                    addKereta(nmkereta,jadwalkeberangkatan,idk,idrute);
                    break;
                case 4:
                    System.out.println("Masukkan Stasiun: ");
                    String nmstasiun = inputan.next();
                    System.out.println("Masukkan Nama Kota: ");
                    String kota = inputan.next();
                  
                    String ids = "S" + nos;
                    addStasiun(nmstasiun,kota,ids);
                    break;
                case 5:
                    System.out.println("Masukkan Id Kereta: ");
                    String idkereta = inputan.next();
                    System.out.println("Masukkan Type Gerbong: ");
                    String type = inputan.next();
                    System.out.println("Masukkan Kapasitas Gerbong: ");
                    int kap = inputan.nextInt();
                    
                    String idg = "S" + nog;
                    addGerbong(type,idg,idkereta);
                    break;
                case 6:
                    System.out.println("Masukkan id Ticket ");
                    String idt = inputan.next();
                    deleteTicket(idt);
                    break;
                case 7:
                    System.out.println("Masukkan id Rute: ");
                    idr = inputan.next();
                    deleteTicket(idr);
                    break;
                case 8:
                    System.out.println("Masukkan id Stasiun: ");
                     ids = inputan.next();
                    deleteTicket(ids);
                    break;
                case 9:
                    System.out.println("Masukkan id Kereta:  ");
                     idk = inputan.next();
                    deleteTicket(idk);
                    break;
                case 10:
                    System.out.println("Masukkan id Gerbong ");
                    idr = inputan.next();
                    deleteTicket(idr);
                    break;
                case 11:
                    
                        for (Ticket t : daftarTicket)
                        {
                            System.out.println("=====List Ticket=====");
                            System.out.println("Nama Penumpang : " + t.getNama());
                            System.out.println("No. Identitas : " + t.getNoIdentitas());
                            System.out.println("Id Ticket : " + t.getIdticket());

                        }
                break;
                case 0:
                    System.out.println("Selamat jalan. Semoga selamat sampai tujuan !!");
                    break;

                default:

                    System.out.println("Tidak menu !!!");
                    break;
            }
        }

    }
}
