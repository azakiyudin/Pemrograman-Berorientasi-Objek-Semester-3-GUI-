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
public abstract class cBentuk2D {
    private String warna;
    protected cBentuk2D(){
        warna = "transparan";
    }
    protected cBentuk2D(String w){
        warna = w;
    }
    public void setWarna(String w){
        warna = w;
    }
    public String getWarna(){
        return warna;
    }
    public abstract double hitungLuas();
    public abstract double hitungKell();
    
    public void info(){
        System.out.println("Warna benda : " + getWarna());
        System.out.println("Luas benda : " + hitungLuas());
        System.out.println("Keliling benda : " + hitungKell());
                
    }
    
}
