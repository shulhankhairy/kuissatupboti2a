/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispraktikum;

/**
 *
 * @author RahmadAL
 */
public class KuisPraktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mesin m1 = new Mesin();
        m1.setJenisMesin("Honda");
        m1.nyalakanMesin();
        m1.setKecepatan(300);
        m1.tambahKecepatan();
        m1.kurangiKecepatan();
        
        Mesin m2 = new Mesin();
        m2.setJenisMesin("Yamaha");
        m2.nyalakanMesin();
        m2.setKecepatan(280);
        m2.tambahKecepatan();
        m2.kurangiKecepatan();
        
        Mesin m3 = new Mesin();
        m3.setJenisMesin("Suzuki");
        m3.matikanMesin();
        m3.setKecepatan(280);
        m3.tambahKecepatan();
        m3.kurangiKecepatan();
        
        Mesin m4 = new Mesin();
        m4.setJenisMesin("Ducati");
        m4.nyalakanMesin();
        m4.setKecepatan(280);
        m4.tambahKecepatan();
        m4.kurangiKecepatan();
        
        SepedaMotor sp1 = new SepedaMotor();
        sp1.setJenisMotor("Motor Balap");
        sp1.getJenisMotor();
        sp1.setPlatNomor(2499);
        sp1.getPlatNomor();
        sp1.setMesin(m1);
        sp1.info();
        
        SepedaMotor sp2 = new SepedaMotor();
        sp2.setJenisMotor("Motor Kenceng");
        sp2.getJenisMotor();
        sp2.setPlatNomor(1242);
        sp2.getPlatNomor();
        sp2.setMesin(m2);
        sp2.info();
        
        SepedaMotor sp3 = new SepedaMotor();
        sp3.setJenisMotor("Motor Enteng");
        sp3.getJenisMotor();
        sp3.setPlatNomor(2345);
        sp3.getPlatNomor();
        sp3.setMesin(m3);
        sp3.info();
        
        SepedaMotor sp4 = new SepedaMotor();
        sp4.setJenisMotor("Motor Larang");
        sp4.getJenisMotor();
        sp4.setPlatNomor(1234);
        sp4.getPlatNomor();
        sp4.setMesin(m4);
        sp4.info();
    }
    
}
