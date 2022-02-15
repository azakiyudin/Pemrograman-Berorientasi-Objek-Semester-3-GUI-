/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstrak;

/**
 *
 * @author DYNABOOK
 */
public class persegi extends cBentuk2D {
    private double panjang, lebar;
    public persegi(){
        super();
        panjang = 0;
        lebar = 0;
    }
    public persegi(double p,double l, String w){
        super(w);
        panjang = p;
        lebar = l;
    }
    @Override
    public double hitungLuas(){
        return panjang*lebar;
    }
    @Override
    public double hitungKell(){
        return 2*(panjang+lebar);
    }
    public static void main(String[] args){
        persegi P1 = new persegi(4,2,"apa");
        P1.info();
    }
}
