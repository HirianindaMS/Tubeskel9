/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketingKeretaApi;

/**
 *
 * @author Hirianinda M.S
 */
public class Ticket {
    	private String nama;
	private Rute rute;
        private Rute[] daftarRute = new Rute[30];
        private int jmlRute;
	private long noIdentitas;
        private String nokursi;
        private String idticket;
        
    public Ticket(String nama, long noIdentitas, String idticket) {
        this.nama = nama;
        this.noIdentitas = noIdentitas;
         this.idticket = idticket;
    }

    public String getIdticket() {
        return idticket;
    }

    public String getNama() {
        return nama;
    }

    public long getNoIdentitas() {
        return noIdentitas;
    }

    public void setNokursi(String nokursi) {
        this.nokursi = nokursi;
    }

    public String getNokursi() {
        return nokursi;
    }
   
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoIdentitas(long noIdentitas) {
        this.noIdentitas = noIdentitas;
    }

    public Rute getDaftarRute(int n) {
        return daftarRute[n];
    }

    public void addRute(Rute rute) {
         if (jmlRute < 30) {
                     daftarRute[jmlRute]= rute;
                     jmlRute++;
                 }
                 else System.out.println("Jumlah Rute sudah melebihi batas maksimum!");
    }
    
}