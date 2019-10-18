/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author RioFebrian
 */
public class QuizDemo {
    public static void main(String[] args) {
        SepedaMotor satu = new SepedaMotor();
        SepedaMotor dua = new SepedaMotor();
        SepedaMotor tiga = new SepedaMotor();
        SepedaMotor empat = new SepedaMotor();
        
        satu.setMerek("Honda XMAX");
        satu.setWarna("Putih");
        satu.printStatusMotor();
        satu.speedUpHonda();
        
        dua.setMerek("Yamaha R15 RR");
        dua.setWarna("Biru");
        dua.engineOn();
        dua.speedUpYamaha();
        dua.speedUpYamaha();
        dua.kurangiKecepatan(10);
        dua.printStatusMotor();
       
        tiga.setMerek("Suzuki GSX 150");
        tiga.setWarna("Hitam");
        tiga.engineOn();
        tiga.speedUpSuzuki();
        tiga.speedUpSuzuki();
        tiga.kurangiKecepatan(15);
        tiga.printStatusMotor();
        
        empat.setMerek("Ducati Monster");
        empat.setWarna("Merah");
        empat.engineOn();
        empat.speedUpDucati();
        empat.speedUpDucati();
        empat.kurangiKecepatan(30);
        empat.printStatusMotor();
       
    }
}