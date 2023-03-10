/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan.entity;

/**
 *
 * @author SMKN 4 Bandung
 */
public class detailTransaksi {
      private String noFaktur;
    private String kodeBarang;
    private int jumlah;
    private String subTotal;

    public String getNoFaktur() {
        return noFaktur;
    }

    public void setNoFaktur(String noFaktur) {
        this.noFaktur = noFaktur;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public String getSubTotal() {
        return subTotal;
    }
    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }
}
