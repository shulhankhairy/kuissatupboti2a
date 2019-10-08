package quizpraktikumpbo;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        SepedaMotor sm = new SepedaMotor();
        Mesin m = new Mesin();
        sm.setJenis("Yamaha");
        sm.print();
        m.nyalakanMesin();
        m.tambahKecepatanYamaha();
        m.tambahKecepatanYamaha();
        m.tambahKecepatanYamaha();
        m.printStatus();
        System.out.println("");
        
        SepedaMotor sm1 = new SepedaMotor();
        Mesin m1 = new Mesin();
        sm.setJenis("Honda");
        sm.print();
        m1.nyalakanMesin();
        m1.tambahKecepatanHonda();
        m1.tambahKecepatanHonda();
        m1.tambahKecepatanHonda();
        m1.printStatus();
        
        System.out.println("");
        
        SepedaMotor sm2 = new SepedaMotor();
        Mesin m2 = new Mesin();
        sm.setJenis("Ducati");
        sm.print();
        m2.nyalakanMesin();
        m2.tambahKecepatanDucati();
        m2.tambahKecepatanDucati();
        m2.tambahKecepatanDucati();
        m2.printStatus();
        System.out.println("");
        
        SepedaMotor sm3 = new SepedaMotor();
        Mesin m3 = new Mesin();
        sm.setJenis("Suzuki");
        sm.print();
        m3.nyalakanMesin();
        m3.tambahKecepatanSuzuki();
        m3.tambahKecepatanSuzuki();
        m3.tambahKecepatanSuzuki();
        m3.printStatus();
        System.out.println("");
    }
}