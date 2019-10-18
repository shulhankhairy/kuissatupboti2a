/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1PBO;

/**
 *
 * @author TOSHIBA
 */
public class TestSepedaMotor {
    public static void main(String[] args) {
        Mesin ms= new Mesin("Yamaha");
        SepedaMotor sm = new SepedaMotor("Yamaha",ms);
        sm.tampilSepeda();
        ms.nyalakanMesin();
        ms.tambahKecepatan();
        ms.kurangiKecepatan();
        ms.tampilMesin();
        
        Mesin ms2= new Mesin("Suzuki");
        SepedaMotor sm2 = new SepedaMotor("Suzuki",ms2);
        sm2.tampilSepeda();
        ms2.nyalakanMesin();
        ms2.tambahKecepatan();
        ms2.kurangiKecepatan();
        ms2.tampilMesin();
    }
}
