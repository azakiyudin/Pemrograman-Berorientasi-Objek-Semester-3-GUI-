/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometri;

/**
 *
 * @author DYNABOOK
 */
public class segitiga {
    public double tinggi, alas;
    
    public segitiga(){
        tinggi = 0;
        alas = 1;
    }
    public segitiga (double a, double r){
        tinggi = r;
        alas = a;
    }
    public double getLuas(){
        return 0.5*tinggi*alas;
    }
    
}
