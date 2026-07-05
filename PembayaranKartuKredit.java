/*
 * Nama  : Rahmi Aulia
 * NIM   : 2501083021 
 */
package com.mycompany.praktikum04062026;

/**
 *
 * @author Rahmi Aulia
 */
public class PembayaranKartuKredit extends Pembayaran implements CetakStruk{
    private String noKartu;
    private String namaKartu;

    public PembayaranKartuKredit(String noKartu, String namaKartu, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.noKartu = noKartu;
        this.namaKartu = namaKartu;
    }

    public String getNoKartu() {
        return noKartu;
    }

    public void setNoKartu(String noKartu) {
        this.noKartu = noKartu;
    }

    public String getNamaKartu() {
        return namaKartu;
    }

    public void setNamaKartu(String namaKartu) {
        this.namaKartu = namaKartu;
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran melalui Kartu Kredit");
        System.out.println("Nama Kartu : "+namaKartu);
        System.out.println("No Kartu : "+noKartu);
        System.out.println("Id Transaksi :"+idTransaksi);
        System.out.println("Jumlah Bayar : Rp. "+jumlahBayar);
    }
    
    @Override
    public void CetakStruk(){
        System.out.println("==== Struk Kartu Kredit ===");
        System.out.println("ID transaksi = "+idTransaksi);
        System.out.println("Jumlah Bayar = "+jumlahBayar);
        System.out.println("No Kartu = "+noKartu);
        System.out.println("Nama Kartu = "+namaKartu);
    }
}
