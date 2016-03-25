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

    public Gerbong(String tipegerbong, String idgerbong, int kapasitasgerbong) {
        this.tipegerbong = tipegerbong;
        this.idgerbong = idgerbong;
        this.kapasitasgerbong = kapasitasgerbong;
    }

    public String getTipegerbong() {
        return tipegerbong;
    }

    public String getIdgerbong() {
        return idgerbong;
    }

    public int getKapasitasgerbong() {
        return kapasitasgerbong;
    }

    public void setTipegerbong(String tipegerbong) {
        this.tipegerbong = tipegerbong;
    }

    public void setIdgerbong(String idgerbong) {
        this.idgerbong = idgerbong;
    }

    public void setKapasitasgerbong(int kapasitasgerbong) {
        this.kapasitasgerbong = kapasitasgerbong;
    }
	
	
}