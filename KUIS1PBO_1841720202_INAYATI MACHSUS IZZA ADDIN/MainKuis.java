
package kuis1;

public class MainKuis {

    public static void main(String[] args) {
        Mesin m1=new Mesin("yamaha");
        SepedaMotor sm1=new SepedaMotor("YAMAHA C1025", m1);
        m1.nyalakanMesin();
        m1.tambahKecepatan();
        m1.tambahKecepatan();
        m1.tambahKecepatan();
        m1.tambahKecepatan();
        m1.tambahKecepatan();
        m1.tambahKecepatan();
        m1.tambahKecepatan();
        sm1.printData();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        m1.kurangiKecepatan();
        sm1.printData();
        
        Mesin m2=new Mesin("honda");
        SepedaMotor sm2=new SepedaMotor("Suzuki 20BBO", m2);
        m2.tambahKecepatan();
        m2.tambahKecepatan();
        sm2.printData();
        
        Mesin m3=new Mesin("ducati");
        SepedaMotor sm3=new SepedaMotor("Ducati 3000SS", m3);
        m3.nyalakanMesin();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        m3.tambahKecepatan();
        sm3.printData();
    }
    
}
