/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemalatoutdoor;

/**
 *
 * @author ASUS TUF
 */
public class Tenda extends AlatOutdoor {

    private int kapasitas;
    private String jenisTenda;

    public Tenda(String kodeAlat, String namaAlat,
                 double hargaSewa, int stok,
                 int kapasitas, String jenisTenda) {

        super(kodeAlat, namaAlat, hargaSewa, stok);

        this.kapasitas = kapasitas;
        this.jenisTenda = jenisTenda;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public String getJenisTenda() {
        return jenisTenda;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void setJenisTenda(String jenisTenda) {
        this.jenisTenda = jenisTenda;
    }

    public double hitungHargaSewa(int jumlahHari) {
        return getHargaSewa() * jumlahHari;
    }

    public String getJenisAlat() {
        return "Tenda";
    }
}