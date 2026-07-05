/*
 * Nama  : Rahmi Aulia
 * NIM   : 2501083021 
 */
package com.mycompany.praktikum04062026;

/**
 *
 * @author Rahmi Aulia
 */
public class Keyboard extends AlatMusik implements BisaDinyalakan{
    private boolean dayaTersambung;

    public Keyboard(boolean dayaTersambung, String nama, String jenis) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }
    
    @Override
    public void mainkan() {
        System.out.println(nama+" dimainkan dengan menekan tuts.");
    }

    @Override
    public void stem() {
        System.out.println("Keyboard "+nama+" distem digital dengan aplikasi");
    }

    @Override
    public void nyalakan() {
        if(cekListrik()){
            System.out.println(nama+" dinyalakan");
        }else{
            System.out.println(nama+" tidak ada daya");
        }
    }

    @Override
    public void matikan() {
        System.out.println(nama+" dimatikan.");
    }

    @Override
    public boolean cekListrik() {
        return dayaTersambung;
    }
    
}
