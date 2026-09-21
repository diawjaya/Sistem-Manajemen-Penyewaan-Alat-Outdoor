/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemalatoutdoor;

/**
 *
 * @author ASUS TUF
 */
public class AlatOutdoor {

    private String kodeAlat;
    private String namaAlat;
    private double hargaSewa;
    private int stok;

    public AlatOutdoor(String kodeAlat, String namaAlat,
                       double hargaSewa, int stok) {
        this.kodeAlat = kodeAlat;
        this.namaAlat = namaAlat;
        this.hargaSewa = hargaSewa;
        this.stok = stok;
    }

    public String getKodeAlat() {
        return kodeAlat;
    }

    public String getNamaAlat() {
        return namaAlat;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public int getStok() {
        return stok;
    }

    public void setKodeAlat(String kodeAlat) {
        this.kodeAlat = kodeAlat;
    }

    public void setNamaAlat(String namaAlat) {
        this.namaAlat = namaAlat;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double hitungHargaSewa(int jumlahHari) {
        return hargaSewa * jumlahHari;
    }

    public String getJenisAlat() {
        return "Alat Outdoor";
    }
}