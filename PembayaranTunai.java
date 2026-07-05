/*
 * Nama  : Rahmi Aulia
 * NIM   : 2501083021 
 */
package com.mycompany.praktikum04062026;

/**
 *
 * @author Rahmi Aulia
 */
public class PembayaranTunai extends Pembayaran implements CetakStruk{
    private double uang;

    public PembayaranTunai(double uang, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.uang = uang;
    }
    
    public double getUang() {
        return uang;
    }

    public void setUang(Double uang) {
        this.uang = uang;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Proses pembayaran secara tunai");
        System.out.println("Id Transaksi : "+idTransaksi);
        System.out.println("jumlah bayar : Rp. "+jumlahBayar);
        System.out.println("Uang yang diberikan : Rp. "+uang);
        if (uang>jumlahBayar){
            double kembalian = uang - jumlahBayar;
            System.out.println("Proses pembayaran berhasil ");
            System.out.println("Uang kembalian : Rp. "+kembalian);
        }else{
            double kekurangan = jumlahBayar - uang;
            System.out.println("Proses Pembayaran gagal");
            System.out.println("Uang anda kurang sebanyak : Rp. "+kekurangan);
        }
    }
    @Override
    public void CetakStruk(){
        System.out.println("==== Struk Tunai ===");
        System.out.println("ID transaksi = "+idTransaksi);
        System.out.println("Jumlah Bayar = "+jumlahBayar);
        System.out.println("Uang Bayar = "+uang);
    }
    
}
