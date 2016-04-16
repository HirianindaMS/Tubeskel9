/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketingKeretaApi;

/**
 *
 *@author Asus
 */
public class Stasiun {
    private String namakota;
    private String namastasiun;
    private String idstasiun;

    public Stasiun(String namastasiun,String namakota, String idstasiun) {
        this.namakota = namakota;
        this.namastasiun = namastasiun;
        this.idstasiun = idstasiun;
    }

    public String getNamakota() {
        return namakota;
    }

    public String getIdstasiun() {
        return idstasiun;
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
