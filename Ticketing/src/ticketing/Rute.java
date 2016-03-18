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
    private String statsiunawal;
	private String statsiuntujuan;
	private Statsiun[] daftarstatsiun = new Statsiun[100];
	private Ticket[] daftarTiketDibeli;
	private int ntiket;
	
	public Rute(String statsiunawal,String statsiuntujuan){
		this.statsiunawal=statsiunawal;
		this.statsiuntujuan=statsiuntujuan;
	}
	public void setStatsiunawal(String statsiunawal){
		this.statsiunawal=statsiunawal;
	}
	public String getStatsiunawal(){
		return statsiunawal;
	}
	public void setStatsiunTujuan(String statsiuntujuan){
		this.statsiuntujuan=statsiuntujuan;
	}
	public String getStatsiunTujuan(){
		return statsiuntujuan;
	}
	public daftarstatsiun(Statsiun s){
		
	}	
	
	public void createTiket (String nama, String asal, String tujuan, String kursi,long noIdentitas, String namaKereta)
	{
			daftarTiketDibeli[ntiket] = new Ticket(nama, asal, tujuan, kursi,noIdentitas,namaKereta);
			ntiket++;
	}
	
    public int getTiket() {
        return ntiket;
    }	
}
       
