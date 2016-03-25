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
public class Ticket {
    	private String nama;
	private Rute rute;
	private long noIdentitas;
        private String nokursi;
        
    public Ticket(String nama, long noIdentitas, String nokursi) {
        this.nama = nama;
        this.noIdentitas = noIdentitas;
        this.nokursi = nokursi;
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

    public Rute getRute() {
        return rute;
    }

    public void setRute(Rute rute) {
        this.rute = rute;
    }
	
}