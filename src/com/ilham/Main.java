/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * NIM      : 10119006
 * Kelas    : IF1
 * Tanggal  : 20 February 2021
 * No Soal  : 6
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7.0);
        kalkulator.setValue2(5.0);

        System.out.println("Value 1 = " + kalkulator.getValue1());
        System.out.println("Value 2 = " + kalkulator.getValue2());
        System.out.println("Hasil Perkalian = " + kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
    }
    
}
