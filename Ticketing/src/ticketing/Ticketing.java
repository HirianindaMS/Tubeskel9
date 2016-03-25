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
public class Ticketing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerbong g1 = new Gerbong("Ekonomi","g1",20);
        Gerbong g2 = new Gerbong("Executive","g2",10);
        Gerbong g3 = new Gerbong("Ekonomi","g3",15);
        Gerbong g4 = new Gerbong("Bisnis","g4",5);
        Gerbong g5 = new Gerbong("Executive","g5",7);
        
     
        Kereta k1 = new Kereta("Argo Parahyangan","Senin", 40,"exe1");
        Kereta k2 = new Kereta("Mutiara Selatan","Selasa", 20,"b");
        Kereta k3 = new Kereta("Bima","Rabu", 28,"exe2");
        Kereta k4 = new Kereta("Bengawan","Kamis", 60,"ek1");
        Kereta k5 = new Kereta("Jaka Tingkir","Jumat", 80,"ek2");
        
        
        k1.addgerbong(g2);
        k2.addgerbong(g4);
        k3.addgerbong(g5);
        k4.addgerbong(g3);
        k5.addgerbong(g1);
        
        Stasiun s1 = new Stasiun("Bandung", "Bandung");
        Stasiun s2 = new Stasiun("Jakarta", "Gambir");
        Stasiun s3 = new Stasiun("Yogyakarta", "Sleman");
        Stasiun s4 = new Stasiun("Surabaya", "Babat");
        Stasiun s5 = new Stasiun("Semarang", "Ambarawa");
        
        Rute r1 = new Rute("Bandung-Yogyakarta", s1, s3);
        Rute r2 = new Rute("Semarang-Jakarta", s5, s2);
        Rute r3 = new Rute("Yogyakarta-Surabaya", s3, s4);
        Rute r4 = new Rute("Jakarta-Bandung", s2, s1);
        Rute r5 = new Rute("Surabaya-Semarang", s4, s5);
        
        r1.addkereta(k1);
        r2.addkereta(k2);
        r3.addkereta(k3);
        r4.addkereta(k4);
        r5.addkereta(k5);
        
        Ticket[] t = new Ticket[80];
        t[0] = new Ticket("Syahrini", 1234567,"1a");
        t[1] = new Ticket("Xiu", 26031990,"2b");
        t[2] = new Ticket("Leonardo", 052412,"3c");
        t[3] = new Ticket("Brad Pitt", 1234567,"4d");
        t[4] = new Ticket("Katniss", 44838929,"5e");
        
     
        t[0].setRute(r1);
        t[1].setRute(r5);
        t[2].setRute(r2);
        t[3].setRute(r3);
        t[4].setRute(r4);
        
        
        
        for (int i = 0; i < t.length; i++) {
            System.out.println("");
            System.out.println("Detail Penumpang\nNama Penumpang: "+t[i].getNama()+"\nNo. Identitas: "+t[i].getNoIdentitas()+"\nNo. Kursi: "+t[i].getNokursi());
            System.out.println("Rute : "+t[i].getRute().getNmrute()+"\nNama Stasiun Asal: "+t[i].getRute().getStasiunawal().getNamastasiun()+"\nNama Stasiun Tujuan: "+t[i].getRute().getStasiuntujuan().getNamastasiun());
            
                for (int j = 0; j < t[i].getRute().getNkereta();j++) {
                    System.out.println("Nama Kereta : "+t[i].getRute().getKereta(j).getNamakereta()+"\nJadwal Keberangkatan: "+t[i].getRute().getKereta(j).getJadwalkeberangkatan());
                    System.out.println("Kelas: "+t[i].getRute().getKereta(j).getGerbong(j).getTipegerbong());
            }
        }
    }  
}
