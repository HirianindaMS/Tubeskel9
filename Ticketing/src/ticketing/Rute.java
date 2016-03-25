/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing;

/**
 *
 * @author Hirianinda M.S
 */
public class Rute {
    private String nmrute;
    private Stasiun stasiunawal;
    private Stasiun stasiuntujuan;
    private Kereta[] daftarkereta = new Kereta[10];
    private int nKereta = 0;
  

    public Rute(String nmrute, Stasiun stasiunawal, Stasiun stasiuntujuan) {
        this.stasiunawal = stasiunawal;
        this.stasiuntujuan = stasiuntujuan;
        this.nmrute = nmrute;
    }

    public void setNmrute(String nmrute) {
        this.nmrute = nmrute;
    }

    public String getNmrute() {
        return nmrute;
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