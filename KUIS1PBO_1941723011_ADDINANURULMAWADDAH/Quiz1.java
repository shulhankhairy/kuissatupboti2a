package quiz1;

public class Quiz1 {
    public static void main(String[] args) {
        Mesin m = new Mesin("Yamaha");
        SepedaMotor s = new SepedaMotor("Yamaha",m);
        s.info();
        m.nyalakanMesin();
        m.tambahKecepatan();
        m.kurangiKecepatan();
        m.info();
        
        System.out.println("=================================");
        Mesin m1 = new Mesin("Ducati");
        SepedaMotor s1 = new SepedaMotor("Ducati",m1);
        s1.info();
        m1.nyalakanMesin();
        m1.tambahKecepatan();
        m1.kurangiKecepatan();
        m1.info();
        
        System.out.println("=================================");
        Mesin m2 = new Mesin("Honda");
        SepedaMotor s2 = new SepedaMotor("Honda",m2);
        s2.info();
        m2.nyalakanMesin();
        m2.tambahKecepatan();
        m2.kurangiKecepatan();
        m2.info();
        
        System.out.println("=================================");
        Mesin m3 = new Mesin("Suzuki");
        SepedaMotor s3 = new SepedaMotor("Suzuki",m3);
        s3.info();
        m3.nyalakanMesin();
        m3.tambahKecepatan();
        m3.kurangiKecepatan();
        m3.info();
    }
    
}
