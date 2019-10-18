/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author IRVAN
 */
public class SepedaMotorDemo {
    public static void main(String[] args) {
        
        SepedaMotor sm =new SepedaMotor();
        sm.setMerk("Honda");
        Mesin m =new Mesin();
        sm.setMesin(m);
        sm.nyalakanMesin();
        m.setKecepatan(10);
        m.setsemo(sm);
        sm.info();
        m.tambahkanKecepatan();
        sm.info();
        
        SepedaMotor sm1 =new SepedaMotor();
        sm1.setMerk("Yamaha");
        Mesin m1 =new Mesin();
        sm1.setMesin(m1);
        sm1.nyalakanMesin();
        m1.setKecepatan(25);
        m1.setsemo(sm1);
        sm1.info();
        m1.tambahkanKecepatan();
        sm1.info();
    }
}
