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
public class Statsiun {
    private String namakota;
	private String namastatsiun;
	
	public Statsiun (String namakota, String namastatsiun){
		this.namakota=namakota;
		this.namastatsiun=namastatsiun;
	}
	public void setNamaKota(String namakota){
		this.namakota=namakota;
	}
	public String getNamaKota(){
		return namakota;
	}
	public void setNamaStatsiun(String namastatsiun){
		this.namastatsiun=namastatsiun;
	}
	public String getNamaStatsiun(){
		return namastatsiun;
	}
	
}
