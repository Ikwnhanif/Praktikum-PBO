/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makhlukhidup;

/**
 *
 * @author Asus
 */
public class Burung extends Hewan {
    //atribut
    private String jenis;
    //cuntructor

    public Burung(String jenis, int kaki, String jenkel, String nama) {
        super(kaki, jenkel, nama);
        this.jenis = jenis;
    }
    //stter getter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    //method makan tidur terbang
    public void terbang(){
        System.out.println("Burung " + super.nama + " Sedang Terbang");
    }
    
}
