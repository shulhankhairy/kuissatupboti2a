/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author user
 */
public class SepedaMotor {
    public String merk;
    public Mesin mesin;
    public boolean motor = false;

    public SepedaMotor(){
    
    }

    public SepedaMotor(String merk, Mesin mesin) {
        this.merk = merk;
        this.mesin = mesin;
    }
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public boolean getMotor() {
        return motor;
    }
    
    public void nyalakanMotor(){
        motor = true;
    }
    
    public void matikanMotor(){
        motor = false;
    }
    
    public void status(){
        System.out.println("Merk Motor  : " + getMerk());
        if(motor == true){
            System.out.println("Motor       : Nyala");
        }else{
            System.out.println("Motor       : Mati");
        }
        System.out.println("Kecepatan   : " + mesin.getKecepatan() + " Km/Jam");
        
        System.out.println("");   
    }   
}