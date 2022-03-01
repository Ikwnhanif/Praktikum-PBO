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
public class kucing extends Hewan {
    //atribut : nama , jenkel, ras, jml kaki
    private String ras;

    public kucing(String ras, int kaki, String jenkel, String nama) {
        super(kaki, jenkel, nama);
        this.ras = ras;
        super.tidur();
    }
    //setter    
    //getter

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }
    // method makan, tidur , mencakar;
    public void mencakar(){
        System.out.println("Kucing " + this.ras + " bernama " + super.nama +" sedang mencakar");
    }
    
    
}
