/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo;

/**
 *
 * @author PSYCHO
 */
public class Quizmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Mesin m = new Mesin("Yamaha");
        m.setMerek("Yamaha");
        SepedaMotor s = new SepedaMotor("Bebek",m);
        s.setMotor("Bebek");   
        
        
        System.out.println("============================================");
        s.info();
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
        System.out.println("=============================================");
        
        Mesin m = new Mesin("Honda");
        m.setMerek("Honda");
        SepedaMotor s = new SepedaMotor("Matic",m);
        s.setMotor("Matic");   
        
        
        System.out.println("============================================");
        s.info();
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
        System.out.println("=============================================");
        
        Mesin m = new Mesin("Suzuki");
        m.setMerek("Suzuki");
        SepedaMotor s = new SepedaMotor("Kopling",m);
        s.setMotor("Kopling");   
        
        
        System.out.println("============================================");
        s.info();
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
        System.out.println("=============================================");
        
        Mesin m = new Mesin("Ducati");
        m.setMerek("Ducati");
        SepedaMotor s = new SepedaMotor("Kopling",m);
        s.setMotor("Kopling");   
        
        
        System.out.println("============================================");
        s.info();
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
        System.out.println("=============================================");
    }
        
    
        
}
