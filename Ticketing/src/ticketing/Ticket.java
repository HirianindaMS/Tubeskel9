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
	private String asal;
	private String tujuan;
	private String kursi;
	private long noIdentitas;
	private String namaKereta;
	
		
	public Ticket ( String nama, String asal, String tujuan, String kursi,long noIdentitas, String namaKereta){
            this.nama = nama;
            this.noIdentitas = noIdentitas;
            this.tujuan = tujuan;
            this.asal = asal;
            this.namaKereta = namaKereta;
            this.kursi = kursi;
                
		
	}
	
	public void setNama(String nama)
	{
		this.nama = nama;
	}
	
	public String getNama(){
		return this.nama;
	}
	
	public void setNoIdentitas (long noIdentitas){
		this.noIdentitas = noIdentitas;
	}
	
	public long getNoIdentitas(){
		return this.noIdentitas;
	}

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public void setKursi(String kursi) {
        this.kursi = kursi;
    }

    public void setNamaKereta(String namaKereta) {
        this.namaKereta = namaKereta;
    }

    public String getAsal() {
        return asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getKursi() {
        return kursi;
    }

    public String getNamaKereta() {
        return namaKereta;
    }
       
}
