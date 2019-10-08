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
public class SepedaMotor {
    private String motor;
    private Mesin mesin;
    
    SepedaMotor(String motor){
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }
    
    public void info(){
        System.out.println("");
        System.out.println("===============");
        System.out.println("Jenis Motor : " + motor);
        System.out.println("===============");
    }
}
