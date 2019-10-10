/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author user
 */
public class Kuis {
    public static void main(String[] args) {
        SepedaMotor spd1 = new SepedaMotor();
        SepedaMotor spd2 = new SepedaMotor();
        SepedaMotor spd3 = new SepedaMotor();
        SepedaMotor spd4 = new SepedaMotor();
        
        Mesin m1 = new Mesin();
        Mesin m2 = new Mesin();
        Mesin m3 = new Mesin();
        Mesin m4 = new Mesin();
        
        System.out.println("======================================");
        System.out.println("           SEPEDA MOTOR           ");
        System.out.println("======================================");
        
        spd1.setMesin(m1);
        spd2.setMesin(m2);
        spd3.setMesin(m3);
        spd4.setMesin(m4);
        
        spd1.setMerk("Honda");
        spd1.nyalakanMotor();
        m1.tambahKecepatan(spd1);
        m1.tambahKecepatan(spd1);
        spd1.status();
        
        spd2.setMerk("Yamaha");
        spd2.nyalakanMotor();
        m2.tambahKecepatan(spd2);
        spd2.status();
        
        spd3.setMerk("Suzuki");
        spd3.nyalakanMotor();
        m3.tambahKecepatan(spd3);
        m3.tambahKecepatan(spd3);
        m3.tambahKecepatan(spd3);
        m3.kurangiKecepatan(spd3);
        spd3.status();
        
        spd4.setMerk("Ducati");
        m4.tambahKecepatan(spd4);
        spd4.status();
    }
}
