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
public class Kereta {
    private int idkereta;
	private int kapasitaskursi = 120;
	private String jadwalkeberangkatan;
	private int jumlahgerbong;
	Gerbong[] daftargerbong = new Gerbong[30];
	
	public addgerbong(Gerbong g){
		jumlahgerbong++;
		daftargerbong[jumlahgerbong]= g;
	}
	public addkursi(int kapasitaskursi){
		this.kapasitaskursi = kapasitaskursi;
	}
	public void setIdKereta(int idkereta){
		this.idkereta=idkereta;
	}
	public int getIdKereta(){
		return idkereta;
	}
	public void setKapasitasKursi(int kapasitaskursi){
		this.kapasitaskursi=kapasitaskursi;
	}
	public int getKapasitasKursi(){
		return Kapasitaskursi;
	}
	public void setJadwalKeberangkatan(String jadwalkeberangkatan){
		this.jadwalkeberangkatan=jadwalkeberangkatan;
	}
	public String getJadwalKeberangkatan(){
		return jadwalkeberangkatan;
	}
}
