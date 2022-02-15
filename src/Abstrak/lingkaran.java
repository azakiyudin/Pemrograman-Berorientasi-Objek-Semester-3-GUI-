package Abstrak;

public class lingkaran extends cBentuk2D {
    private double jari;
    
    public lingkaran(){
        super();
        jari = 0;
    }
    public lingkaran (double r, String w){
        super(w);
        jari = r;
    }
    @Override
    public double hitungLuas(){
        return Math.PI*jari*jari;
    }
    @Override
    public double hitungKell(){
        return 2*Math.PI*jari;
    }
    public static void main(String[] args){
        lingkaran C1 = new lingkaran(2,"hijau");
        C1.info();
    }
}
