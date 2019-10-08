/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizTI2A;

/**
 *
 * @author Husnul
 */
public class MainQuiz {
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("******** Q U I Z   P B O   T I 2 A *******");
        System.out.println("********* S E P E D A   M O T O R ********");
        System.out.println("******************************************");
        Mesin m = new Mesin();
        m.setMesin("Honda");
        m.info();
        m.tambahKecepatan();
        
        
        Mesin m1 = new Mesin();
        m1.setMesin("Suzuki");
        m1.nyalakanMesin();
        m1.tambahKecepatan();
        m1.info();
        
        SepedaMotor b = new SepedaMotor();
        b.setJenis("Beat");
        b.setWarna("Merah");
        b.setMesin(m1);
        b.info();
        
        Mesin m2 = new Mesin();
        m2.setMesin("Yamaha");
        m2.nyalakanMesin();
        m2.info();
        m2.kurangiKecepatan();
        
        SepedaMotor s1 = new SepedaMotor();
        s1.setJenis("Vario");
        s1.setWarna("Putih");
        s1.setMesin(m1);
        s1.info();
        
        Mesin m3 = new Mesin();
        m3.setMesin("Ducati");
        m3.nyalakanMesin();
        m3.tambahKecepatan();
        m3.kurangiKecepatan();
        m3.info();
        
        SepedaMotor s2 = new SepedaMotor();
        s2.setJenis("Nmax");
        s2.setWarna("Kuning");
        s2.setMesin(m1);
        s2.info();
    }
}
