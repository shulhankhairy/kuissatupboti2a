package Kuis1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class SepedaMotor {
    public int kec;
    
    public SepedaMotor(int kec){
        this.kec = kec;
    }

    public void tambahKecepatan (int increment) {
       kec = kec + increment;
    }
    
    public void kurangKecepatan (int decrement) {
       kec = kec - decrement;
    }
    
    public void tampilKec(){
        System.out.println("Kecepatan: " + kec);
    }
}
