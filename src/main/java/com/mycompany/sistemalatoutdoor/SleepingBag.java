/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemalatoutdoor;

/**
 *
 * @author ASUS TUF
 */
public class SleepingBag extends AlatOutdoor {

    private String bahan;
    private String ukuran;

    public SleepingBag(String kodeAlat, String namaAlat,
                       double hargaSewa, int stok,
                       String bahan, String ukuran) {

        super(kodeAlat, namaAlat, hargaSewa, stok);

        this.bahan = bahan;
        this.ukuran = ukuran;
    }

    public String getBahan() {
        return bahan;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public double hitungHargaSewa(int jumlahHari) {
        return getHargaSewa() * jumlahHari;
    }

    public String getJenisAlat() {
        return "Sleeping Bag";
    }
}