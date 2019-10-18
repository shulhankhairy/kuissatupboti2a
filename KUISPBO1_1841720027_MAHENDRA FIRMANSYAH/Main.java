/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1PBO;

/**
 *
 * @author Mahendra
 */
public class Main {
    public static void main(String[] args) {
        
        SepedaMotor s = new SepedaMotor();
        s.tampilMotor();
        
        System.out.println("=================");
        s.setNamaMerk("Yamaha");
        s.nyalakanMesin();
        s.tambahKecepatanYamaha();
        s.info();
        System.out.println("=================");
        s.setNamaMerk("Honda");
        s.matikanMesin();
        s.tambahKecepatanHonda();
        s.info();
        System.out.println("=================");
        s.setNamaMerk("Suzuki");
        s.nyalakanMesin();
        s.tambahKecepatanSuzuki();
        s.info();
        System.out.println("=================");
        s.setNamaMerk("Ducati");
        s.nyalakanMesin();
        s.tambahKecepatanDucati();
        s.kurangikecepatanDucati();
        s.info();
    }
}
