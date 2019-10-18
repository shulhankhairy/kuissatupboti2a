/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUIS1PBO_1841720059_AlfanNoufalNasruddin;

/**
 *
 * @author Asus FX
 */
public class SepedaMotorMain {
    public static void main(String[] args) {
        Mesin m = new Mesin("Yamaha");
        m.setMerek("Yamaha");
        SepedaMotor s = new SepedaMotor("Bebek",m);
        s.setGenreSepeda("Bebek");   
        
        
        System.out.println("============================================");
        s.tampilkanData();
        System.out.println("============================================");
        m.printStatus();
        m.tambahKecepatan();
        m.nyalakanMesin();
        m.printStatus();
        m.tambahKecepatan();
        m.printStatus();
        m.tambahKecepatan();
        m.printStatus();
        m.tambahKecepatan();
        m.printStatus();
        m.kurangiKecepatan();
        m.printStatus();
        m.kurangiKecepatan();
        m.printStatus();       
        m.matikanMesin();
        m.printStatus();
        System.out.println("============================================");
    }
}
