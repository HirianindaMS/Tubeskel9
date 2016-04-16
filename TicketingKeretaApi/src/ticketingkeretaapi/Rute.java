/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketingKeretaApi;

/**
 *
 * @author Asus
 */
public class Rute {
    private String idrute;
    private Stasiun stasiunawal;
    private Stasiun stasiuntujuan;
    private Kereta[] daftarkereta = new Kereta[10];
    private int nKereta = 0;
   
  

    public Rute(String idrute, Stasiun stasiunawal, Stasiun stasiuntujuan) {
        this.stasiunawal = stasiunawal;
        this.stasiuntujuan = stasiuntujuan;
        this.idrute=idrute;
    }

    Rute(Stasiun s1, Stasiun s3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setIdrute(String idrute) {
        this.idrute=idrute;
    }

    public String getIdrute() {
        return idrute;
    }
    
    public Stasiun getStasiunawal() {
        return stasiunawal;
    }

    public Stasiun getStasiuntujuan() {
        return stasiuntujuan;
    }

    public Kereta[] getDaftarkereta() {
        return daftarkereta;
    } 

    public void setStasiunawal(Stasiun stasiunawal) {
        this.stasiunawal = stasiunawal;
    }

    public void setStasiuntujuan(Stasiun stasiuntujuan) {
        this.stasiuntujuan = stasiuntujuan;
    }
    
    public Kereta getKereta(int n) {
        return daftarkereta[n];
    }

    public void addkereta(Kereta k){
		 if (this.nKereta < 10) {
                     daftarkereta[nKereta]= k;
                     nKereta++;
                 }
                 else System.out.println("Jumlah Kereta pada rute ini sudah penuh");
    }
    
    public int getNkereta() {
        return nKereta;
    }
}