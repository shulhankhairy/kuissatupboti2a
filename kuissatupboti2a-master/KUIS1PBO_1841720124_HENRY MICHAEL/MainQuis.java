package Quis;

public class MainQuis {
     public static void main(String[] args) {
        
        Mesin m1 = new Mesin("Honda");
        Mesin m2 = new Mesin("Yamaha");
        Mesin m3 = new Mesin("Suzuki");
        Mesin m4 = new Mesin("Ducati");
        
        SepedaMotor spd1 = new SepedaMotor(m1, "Beat");
        SepedaMotor spd2 = new SepedaMotor(m2, "Vixion");
        SepedaMotor spd3 = new SepedaMotor(m3, "Satria");
        SepedaMotor spd4 = new SepedaMotor(m4, "Monster");
        
        spd1.nyalakanMesin();
        spd1.tampilSepeda();
        spd1.tambahKecepatanMotor();
        spd1.tambahKecepatanMotor();
        spd1.tambahKecepatanMotor();
        System.out.println("================================");
        spd2.tambahKecepatanMotor();
        spd2.nyalakanMesin();
        spd2.tambahKecepatanMotor();
        spd2.matikanMesin();
        spd2.tambahKecepatanMotor();
        System.out.println("================================");
        spd3.nyalakanMesin();
        spd3.tambahKecepatanMotor();
        spd3.tambahKecepatanMotor();
        spd3.tambahKecepatanMotor();
        spd3.tambahKecepatanMotor();
        spd3.tambahKecepatanMotor();
        spd3.tambahKecepatanMotor();
        spd3.kurangKecepatanMotor();
        spd3.kurangKecepatanMotor();
        spd3.tambahKecepatanMotor();
        System.out.println("================================");
        spd4.nyalakanMesin();
        spd4.tambahKecepatanMotor();
        spd4.tambahKecepatanMotor();
        spd4.tambahKecepatanMotor();
        spd4.tambahKecepatanMotor();
        spd4.tambahKecepatanMotor();
        spd4.tambahKecepatanMotor();
        spd4.tambahKecepatanMotor();
        spd4.tambahKecepatanMotor();
        System.out.println("================================");
    }
}