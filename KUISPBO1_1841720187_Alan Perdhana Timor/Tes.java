/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author Alan PC
 */
public class Tes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Mesin S1 = new Mesin("Yamaha");
    S1.setMerkMotor("Mio");
    S1.tampilSepeda();
    S1.nayalakanMesin();
    S1.tampildata();
    S1.tambahKecepatanYamaha();
    S1.tampildata();
    S1.kurangiKecepatanYamaha();
    S1.tampildata();
    S1.matikanMesin();
    S1.tampildata();
    
    System.out.println();
    Mesin S2 = new Mesin("Honda");
    S2.setMerkMotor("Baet");
    S2.tampilSepeda();
    S2.nayalakanMesin();
    S2.tampildata();
    S2.tambahKecepatanHonda();
    S2.tampildata();
    S2.kurangiKecepatanHonda();
    S2.kurangiKecepatanHonda();
    S2.tampildata();
    S2.matikanMesin();
    S2.tampildata();
    
    System.out.println();
    Mesin s3 = new Mesin ("Suzuki");
    s3.setMerkMotor("Satria FU");
    s3.tampilSepeda();
    s3.nayalakanMesin();
    s3.tampildata();
    s3.tambahKecepatanSuzuki();
    s3.tambahKecepatanSuzuki();
    s3.tampildata();
    s3.kurangiKecepatanSuzuki();
    s3.kurangiKecepatanSuzuki();
    s3.tampildata();
    s3.matikanMesin();
    s3.tampildata();
    
    System.out.println();
    Mesin s4 = new Mesin("Ducati");
    s4.setMerkMotor("Ducati Scrambler Cafe Racer");
    s4.tampilSepeda();
    s4.nayalakanMesin();
    s4.tampildata();
    s4.tambahKecepatanDucati();
    s4.tampildata();
    s4.kurangiKecepatanDucati();
    s4.tampildata();
    s4.matikanMesin();
    s4.tampildata();
    }
    
}
