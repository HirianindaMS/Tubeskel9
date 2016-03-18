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
public class Gerbong {
    	private String tipegerbong;
	private String idgerbong;
	private int kapasitasgerbong;
	
	public Gerbong(String tipegerbong, String idgerbong, int kapasitasgerbong){
		this.tipegerbong=tipegerbong;
		this.idgerbong=idgerbong;
		this.kapasitasgerbong=kapasitasgerbong;
	}
	public void setTipeGerbong(String tipegerbong){
		this.tipegerbong=tipegerbong;
	}
	public String getTipeGerbong(){
		return tipegerbong;
	}
	public void setKapasitasGerbong(int kapasitasgerbong){
		this.kapasitasgerbong=kapasitasgerbong;
	}
	public int getKapasitasGerbong(){
		return kapasitasgerbong;
	}
	public void setIdGerbong(String idgerbong){
		this.idgerbong=idgerbong;
	}
	public String getIdGerbong(){
		return idgerbong;
	}
}
