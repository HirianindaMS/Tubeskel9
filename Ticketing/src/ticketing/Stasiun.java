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
public class Stasiun {
    private String namakota;
	private String namastasiun;

    public Stasiun(String namakota, String namastasiun) {
        this.namakota = namakota;
        this.namastasiun = namastasiun;
    }

    public String getNamakota() {
        return namakota;
    }

    public String getNamastasiun() {
        return namastasiun;
    }

    public void setNamakota(String namakota) {
        this.namakota = namakota;
    }

    public void setNamastasiun(String namastasiun) {
        this.namastasiun = namastasiun;
    }
}
