/*
 * Nama  : Rahmi Aulia
 * NIM   : 2501083021 
 */
package com.mycompany.praktikum04062026;

/**
 *
 * @author Rahmi Aulia
 */
public abstract class AlatMusik {
    protected String nama;
    protected String jenis;

    public AlatMusik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void info(){
        System.out.println("Nama Alat Musik : "+nama+" Jenis = "+jenis);
    }
    
    //contoh method polymormorphism
    public abstract void mainkan();  
    public abstract void stem();
}
