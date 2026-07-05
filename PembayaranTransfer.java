/*
 * Nama  : Rahmi Aulia
 * NIM   : 2501083021 
 */
package com.mycompany.praktikum04062026;

/**
 *
 * @author Rahmi Aulia
 */
public class PembayaranTransfer extends Pembayaran implements CetakStruk{
    private String namaBank;

    public PembayaranTransfer(String namaBank, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Proses pembayaran secara transfer");
        System.out.println("Nama Bank : "+namaBank);
        System.out.println("Id Transaksi : "+idTransaksi);
        System.out.println("Total bayar : "+jumlahBayar);
    }
    @Override
    public void CetakStruk(){
        System.out.println("==== Struk Transfer ===");
        System.out.println("ID transaksi = "+idTransaksi);
        System.out.println("Jumlah Bayar = "+jumlahBayar);
        System.out.println("Nama Bank = "+namaBank);
    }
}
