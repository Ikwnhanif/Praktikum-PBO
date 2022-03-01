/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapertemuan3oop;

import makhlukhidup.Burung;
import makhlukhidup.Hewan;
import makhlukhidup.kucing;

/**
 *
 * @author Asus
 */
public class main {
    public static void main(String[] args) {
        // Instansiasi
        Hewan hewan = new Hewan(4,"jantan","miko");
        hewan.makan();
    
        kucing kuceng = new kucing("Persia", 4 , "Betina", "Blacky");
        kuceng.mencakar();
        kuceng.makan();
        //set nilai ras
        kuceng.setRas("bengal");
        kuceng.mencakar();
        //get nilai ras
        System.out.println(kuceng.getRas());
        
        //polymorphism
        Hewan hw = new kucing("BSH",4,"Jantan","ucup");
        Hewan br = new Burung("Elang",4,"Jantan","Mighty");
        br.makan(10);
        br.tidur();
        
        //abstract class
        hewan.bernapas();
        hewan.berkembangbiak();
        
        hewan.berburu();
        hewan.gelud();
        hewan.makanrumput();
        
        //Bangun Ruang
        //class : tabung
        //extends : Lingkaran
        //Implements tabung => BangunRuang3D (Volume, keliling)
        //Impl;ements Lingkaran => Bangunruang2D (luas, Keliling)
        
    }
    
}
