/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;
import java.util.Scanner;


/**
 *
 * @author USER
 */
public class BangunRuang {
   private int panjang,lebar,luas;
   
   void persegipanjang(){
       Scanner input = new Scanner (System.in);
       System.out.print("Masukkan Panjang    : ");
       panjang = input.nextInt();
       System.out.print("Masukkan Lebar      : ");
       lebar = input.nextInt();
       
       luas = panjang*lebar;
       System.out.println("Luas Persegi Panjang Adalah  : "+luas);
   }
}

