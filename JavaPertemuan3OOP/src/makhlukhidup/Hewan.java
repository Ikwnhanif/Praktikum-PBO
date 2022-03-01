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
public class Hewan extends Makhlukhidup implements Karnivora, Herbivora{
    int kaki;
    String jenkel;
    String nama;

    public Hewan(int kaki, String jenkel, String nama) {
        this.kaki = kaki;
        this.jenkel = jenkel;
        this.nama = nama;
    }
    
    public void makan(){
        System.out.println(this.nama + " sedang makan");
    }
    public void makan(int porsi){
        System.out.println(this.nama + " sedang makan " + porsi + " porsi");
    }
    public void tidur(){
        System.out.println(this.nama + " sedang tidur");
    }
    //Overriding

    @Override
    public void bernapas() {
        System.out.println("Hewan Bernapas menggunakan Paru-Paru");
    }

    @Override
    public void berburu() {
        System.out.println("Hewan Karnivor Berburu");
    }

    @Override
    public void gelud() {
        System.out.println("Hewan Karnivor pintar gelud");
    }

    @Override
    public void makanrumput() {
        System.out.println("Hewan Herbivora mam rumput");
    }
    
}
