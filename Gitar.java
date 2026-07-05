/*
 * Nama  : Rahmi Aulia
 * NIM   : 2501083021 
 */
package com.mycompany.praktikum04062026;

/**
 *
 * @author Rahmi Aulia
 */
public class Gitar extends AlatMusik{
    private int jumlahSenar;

    public Gitar(int jumlahSenar, String nama, String jenis) {
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }

    @Override
    public void mainkan() {
        System.out.println(nama+" dipetik dengan : "+jumlahSenar+" senar.");
    }

    @Override
    public void stem() {
        System.out.println("Menyetem gitar"+nama+" secara manual");
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }
    
    
}
