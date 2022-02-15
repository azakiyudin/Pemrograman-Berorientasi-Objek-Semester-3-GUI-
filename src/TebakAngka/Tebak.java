package TebakAngka;

import javax.swing.JOptionPane;

public class Tebak {
    static int skor = 20;
    static int angka = (int)(Math.random()*100+1);
    static String hint;
    public static int getSkor(){
        return skor;
    }
    public static String getHint(){
        return hint;
    }
    public static void reset(){
        skor = 20;
        angka = (int)(Math.random()*100+1);
    }
    public static void cek(int tebak){
        if(skor >= 2){
            if(tebak == angka){
                skor=skor*100;
                hint = "tebakan benar";
                JOptionPane.showMessageDialog(null, "Selamat Anda Menang", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            } else if(tebak < angka){
                skor = skor-2;
                hint = "terlalu kecil";
            } else {
                skor = skor-2;
                hint = "terlalu besar";
            }
        } else {
            hint = "";   
        }
        if(skor == 0){
            hint = "";
            JOptionPane.showMessageDialog(null, "Yahhh Kalah", "ALERT!!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
