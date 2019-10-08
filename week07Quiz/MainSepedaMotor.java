/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week07Quiz;

/**
 *
 * @author User
 */
public class MainSepedaMotor {
     int honda,suzuki,ducati,yamaha;
     
    public static void main(String[] args) {
       SepedaMotor s = new SepedaMotor();
       Mesin m = new Mesin();
       Mesin m1 = new Mesin();
       Mesin m2 = new Mesin();
       Mesin m3 = new Mesin();
       
       s.setMerekMotor("Yamaha");
       s.tampilData();
       m.mesinOn();
       m.tambahKecepatanYamaha();
       m.tambahKecepatanYamaha();
       m.printStatus();
       
       s.setMerekMotor("Hondaa");
       s.tampilData();
       m1.mesinOn();
       m1.tambahKecepatanHonda();
       m1.tambahKecepatanHonda();
       m1.printStatus();
       
       s.setMerekMotor("Suzuki");
       s.tampilData();
       m2.mesinOn();
       m2.tambahKecepatanSuzuki();
       m2.tambahKecepatanSuzuki();
       m2.printStatus();
       
       s.setMerekMotor("Ducati");
       s.tampilData();
       m3.mesinOn();
       m3.tambahKecepatanDucati();
       m3.tambahKecepatanDucati();
       m3.printStatus();
       
    }
}
