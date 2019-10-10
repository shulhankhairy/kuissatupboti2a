package Kuis;

public class Main {
    public static void main(String[] args) {   
        SepedaMotor sm = new SepedaMotor();
        Mesin m = new Mesin();
        sm.setMerk("Honda");
        sm.info();
        m.nyalakanMesin();
        m.tambahKecepatanHonda();
        m.tambahKecepatanHonda();
        m.kurangiKecepatanHonda();
        m.matikanMesin();
        m.printStatus();
        
        System.out.println("");
        
        SepedaMotor sm1 = new SepedaMotor();
        Mesin m1 = new Mesin();
        sm1.setMerk("Ducati");
        sm1.info();
        m1.nyalakanMesin();
        m1.tambahKecepatanDucati();
        m1.tambahKecepatanDucati();
        m1.tambahKecepatanDucati();
        m1.tambahKecepatanDucati();
        m1.kurangiKecepatanDucati();
        m1.kurangiKecepatanDucati();
        m1.printStatus();
        m1.matikanMesin();
        m1.printStatus();
        
        
    }
}
