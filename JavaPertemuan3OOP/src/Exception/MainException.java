/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MainException {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        try {
            
            int nilai = input.nextInt();
            System.out.println("nilai = " + nilai );
        }catch(InputMismatchException e){
            System.out.println(e.getMessage() + " Nilai Salah ");
        }finally{
            System.out.println("Exception Selesai");
        }
    }
}