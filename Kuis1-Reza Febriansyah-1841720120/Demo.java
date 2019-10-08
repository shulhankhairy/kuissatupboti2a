package Kuis1;
public class Demo {
    int honda,suzuki,ducati,yamaha;
    public static void main(String[] args) {
       SepedaMotor dm1 = new SepedaMotor();
       SepedaMotor dm2 = new SepedaMotor();
       SepedaMotor dm3 = new SepedaMotor();
       SepedaMotor dm4 = new SepedaMotor();
       
       dm1.setMerekMotor("HONDA");
       dm1.mesinOn();
       dm1.tambahKecepatanHonda();
       dm1.tambahKecepatanHonda();
       dm1.kurangiKecepatan(5);
       dm1.tampilData();
       
       dm2.setMerekMotor("Suzuki");
       dm2.mesinOn();
       dm2.tambahKecepatanSuzuki();
       dm2.tambahKecepatanSuzuki();
       dm2.kurangiKecepatan(10);
       dm2.tampilData();
       
       dm3.setMerekMotor("YAMAHA");
       dm3.mesinOn();
       dm3.tambahKecepatanYamaha();
       dm3.tambahKecepatanYamaha();
       dm3.kurangiKecepatan(10);
       dm3.tampilData();
       
       dm4.setMerekMotor("Ducati");
       dm4.mesinOn();
       dm4.tambahKecepatanDucati();
       dm4.tambahKecepatanDucati();
       dm4.kurangiKecepatan(20);
       dm4.tampilData();
       
       
       
    }
}
