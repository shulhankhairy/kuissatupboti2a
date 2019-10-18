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
public class SepedaMotor {
    private String jenisMotor;
    private boolean sepedaMotorOn = false;
    private Mesin mesin;

    public SepedaMotor() {
    }

    public SepedaMotor(String jenis, Mesin mesin) {
        this.jenisMotor = jenis;
        this.mesin = mesin;
    }
    
    public String getJenis() {
        return jenisMotor;
    }

    public void setJenis(String jenis) {
        this.jenisMotor = jenis;
    }

    public Mesin getMsn() {
        return mesin;
    }

    public void setMsn(Mesin msn) {
        this.mesin = msn;
    }
    
    public void nyalakanMotor(){
        sepedaMotorOn= true;
    }
    
    public void tampilSepeda(){
        System.out.println("Motor : " + jenisMotor);
        mesin.tampilMesin();
    }
}
