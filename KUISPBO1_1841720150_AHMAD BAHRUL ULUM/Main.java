/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUIS1;

/**
 *
 * @author asus
 */

public class Main {
    public static void main(String[] args) {
        SepedaMotor sm1 = new SepedaMotor();
        SepedaMotor sm2 = new SepedaMotor();
        SepedaMotor sm3 = new SepedaMotor();
        SepedaMotor sm4 = new SepedaMotor();
       
        sm1.setMerkMotor("Suzuki");
        sm1.mesinNyala();
        sm1.kecepatanSuzuki();
        sm1. kecepatanSuzuki();
        sm1.kurangiKecepatan(15);
        sm1.TampilData();
        
        sm2.setMerkMotor("Honda");
        sm2.mesinNyala();
        sm2.kecepatanHonda();
        sm2.kurangiKecepatan(5);
        sm2.TampilData();
        
        sm3.setMerkMotor("Yamaha");
        sm3.mesinNyala();
        sm3.kecepatanYamaha();
        sm3.kurangiKecepatan(10);
        sm3.TampilData();
        
        sm4.setMerkMotor("Ducati");
        sm4.mesinNyala();
        sm4.kecepatanDucati();
        sm4.kurangiKecepatan(30);
        sm4.TampilData();
        
}
}
