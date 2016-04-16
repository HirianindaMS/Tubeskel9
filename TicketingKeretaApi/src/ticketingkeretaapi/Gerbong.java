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
public class Gerbong {
    	private String tipegerbong;
	private String idgerbong;
	private int[] kapasitasgerbong = new int[30];
        private int kapasitas;

    public Gerbong(String tipegerbong, String idgerbong) {
        this.tipegerbong = tipegerbong;
        this.idgerbong = idgerbong;
    }

    public Gerbong() {
    }

    
    public String getTipegerbong() {
        return tipegerbong;
    }

    public String getIdgerbong() {
        return idgerbong;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setTipegerbong(String tipegerbong) {
        this.tipegerbong = tipegerbong;
    }

    public void setIdgerbong(String idgerbong) {
        this.idgerbong = idgerbong;
    }

	
	public String seat(){
        String hasil = "";
              int[] neww = new int[30];

        int space = 2;
        int out = 3;
        for (int i = 0; i < 30; i++) {
          //  hasil = hasil+"\n"+neww[i];
            if (i == space) {
                hasil = hasil+" ";
                hasil = hasil+neww[i];
                space += 4;
            } else if (i == out) {
                hasil = hasil + "";
                hasil = hasil + neww[i]+"\n";
                out += 4;
            } else {
                hasil = hasil+neww[i];
            }
            
            if (i == 1) {
                if (kapasitas < 30) {
                    kapasitasgerbong[kapasitas] = i;
                    kapasitas++;
               } else 
                    System.out.println("Kursi sudah penuh");
        }}
            
        return hasil;
        
               
    }
    
    public String changeSeat(int seat){
        String hasil = "";
              int[] neww = new int[30];
       
        neww[seat] = 1;
        int space = 2;
        int out = 3;
        for (int i = 0; i < 30; i++) {
          //  hasil = hasil+"\n"+neww[i];
            if (i == space) {
                hasil = hasil+" ";
                hasil = hasil+neww[i];
                space += 4;
            } else if (i == out) {
                hasil = hasil + "";
                hasil = hasil + neww[i]+"\n";
                out += 4;
            } else {
                hasil = hasil+neww[i];
            }
        }
        return hasil;
    }
}