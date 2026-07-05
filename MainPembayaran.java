/*
 * Nama  : Rahmi Aulia
 * NIM   : 2501083021 
 */
package com.mycompany.praktikum04062026;

import java.util.Scanner;

/**
 *
 * @author Rahmi Aulia
 */
public class MainPembayaran {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pembayaran pembayaran = null;
        CetakStruk c = null;
        
        System.out.println("Pembayaran Form Toko Rahmi");
        System.out.print("Masukkan Id Transaksi : ");
        String id = input.nextLine();
        System.out.print("Masukkan total pembayaran : ");
        Double jumlah = input.nextDouble();
        input.nextLine(); //clear buffer
        
        System.out.println("\nMasukkan pilihan metode pembayaran : ");
        System.out.println("");
        System.out.println("1. Pembayaran dengan Tunai");
        System.out.println("2. Pembayaran dengan Transfer");
        System.out.println("3. Pembayaran dengan Kartu Kredit");
        System.out.println("4. Pembayaran dengan E-Wallet");
        System.out.println("Pilihan anda : (1-4)");
        int pil = input.nextInt();
        input.nextLine();
        
        switch (pil){
            case 1 : System.out.print("Masukkan jumlah uang : ");
                Double uang = input.nextDouble();
                pembayaran = new PembayaranTunai(uang, jumlah, id);
                c = (CetakStruk)pembayaran;
                break;
            case 2 : System.out.print("Masukkan nama Bank : ");
                String nama = input.nextLine();
                pembayaran = new PembayaranTransfer(nama, jumlah,id);
                c = (CetakStruk)pembayaran;
                break;
            case 3 : System.out.print("Masukkan nama Kartu : ");
                String namaKartu = input.nextLine();
                System.out.println("Masukkan nomor Kartu : ");
                String noKartu = input.nextLine();
                pembayaran = new PembayaranKartuKredit(noKartu, namaKartu, jumlah, id);
                c = (CetakStruk)pembayaran;
                break;
            case 4 : System.out.print("Masukkan nama E-Wallet : ");
                String ewallet = input.nextLine();
                pembayaran = new PembayaranEWallet(ewallet,jumlah,id);
                c = (CetakStruk)pembayaran;
                break;
        }
        pembayaran.prosesPembayaran();
        
        System.out.println();
        c.CetakStruk();
    }
}
