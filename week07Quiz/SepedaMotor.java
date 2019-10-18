/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week07Quiz;

/**
 *
 * @author User
 */
public class SepedaMotor extends Mesin{
    String merekMotor;
    Mesin mesin;

    public SepedaMotor() {
    }

    public SepedaMotor(String merekMotor, Mesin mesin) {
        this.merekMotor = merekMotor;
        this.mesin = mesin;
    }

    public String getMerekMotor() {
        return merekMotor;
    }

    public void setMerekMotor(String merekMotor) {
        this.merekMotor = merekMotor;
    }
    
    public void tampilData(){
        System.out.println("----------------------------------------------");
        System.out.println("Merk : "+merekMotor);
        ;
        
    }
}
