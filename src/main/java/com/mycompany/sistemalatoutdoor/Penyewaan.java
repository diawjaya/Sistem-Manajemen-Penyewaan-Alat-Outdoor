/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemalatoutdoor;

/**
 *
 * @author ASUS TUF
 */
public class Penyewaan {

    private String idPenyewaan;
    private String idPenyewa;
    private String kodeAlat;
    private int jumlahHari;
    private double totalHarga;
    private String statusPenyewaan;

    public Penyewaan(String idPenyewaan,
                     String idPenyewa,
                     String kodeAlat,
                     int jumlahHari,
                     double totalHarga,
                     String statusPenyewaan) {

        this.idPenyewaan = idPenyewaan;
        this.idPenyewa = idPenyewa;
        this.kodeAlat = kodeAlat;
        this.jumlahHari = jumlahHari;
        this.totalHarga = totalHarga;
        this.statusPenyewaan = statusPenyewaan;
    }

    public String getIdPenyewaan() {
        return idPenyewaan;
    }

    public String getIdPenyewa() {
        return idPenyewa;
    }

    public String getKodeAlat() {
        return kodeAlat;
    }

    public int getJumlahHari() {
        return jumlahHari;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public String getStatusPenyewaan() {
        return statusPenyewaan;
    }

    public void setIdPenyewaan(String idPenyewaan) {
        this.idPenyewaan = idPenyewaan;
    }

    public void setIdPenyewa(String idPenyewa) {
        this.idPenyewa = idPenyewa;
    }

    public void setKodeAlat(String kodeAlat) {
        this.kodeAlat = kodeAlat;
    }

    public void setJumlahHari(int jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public void setStatusPenyewaan(String statusPenyewaan) {
        this.statusPenyewaan = statusPenyewaan;
    }
}