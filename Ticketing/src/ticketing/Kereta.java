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
   private String namakereta;
	private int kapasitaskursi = 120;
	private String jadwalkeberangkatan;
	private int jumlahgerbong;
        private String idkereta;
	private Gerbong[] daftargerbong = new Gerbong[30];

    public Kereta(String namakereta, String jadwalkeberangkatan, int kapasitaskursi, String idkereta) {
        this.namakereta = namakereta;
        this.jadwalkeberangkatan = jadwalkeberangkatan;
        this.kapasitaskursi = kapasitaskursi;
        this.idkereta = idkereta;
    }

    public String getNamakereta() {
        return namakereta;
    }

    public int getKapasitaskursi() {
        return kapasitaskursi;
    }

    public String getJadwalkeberangkatan() {
        return jadwalkeberangkatan;
    }


    public void setNamakereta(String namakereta) {
        this.namakereta = namakereta;
    }

    public void setKapasitaskursi(int kapasitaskursi) {
        this.kapasitaskursi = kapasitaskursi;
    }

    public void setJadwalkeberangkatan(String jadwalkeberangkatan) {
        this.jadwalkeberangkatan = jadwalkeberangkatan;
    }

    public String getIdkereta() {
        return idkereta;
    }

    public void setIdkereta(String idkereta) {
        this.idkereta = idkereta;
    }

   public void addgerbong(Gerbong g){
		 if (this.jumlahgerbong < 30) {
                     daftargerbong[jumlahgerbong]= g;
                     jumlahgerbong++;
                 }
                 else System.out.println("Jumlah Gerbong sudah melebihi batas maksimum!");
    }
		 
   public int getJumlahgerbong() {
        return jumlahgerbong;
    }
   
   public Gerbong getGerbong(int n) {
        return daftargerbong[n];
    }

}

