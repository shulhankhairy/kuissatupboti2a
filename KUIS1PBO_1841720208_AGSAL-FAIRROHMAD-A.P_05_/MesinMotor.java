/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author Aegis
 */
public class MesinMotor {
    boolean mesinOn;
    boolean kontakOn;
    int kecepatan;

    public MesinMotor(boolean mesinOn, boolean kontakOn, int kecepatan) {
        this.mesinOn = mesinOn;
        this.kontakOn = kontakOn;
        this.kecepatan = kecepatan;
    }
    
    

    public boolean isMesinOn() {
        return mesinOn;
    }

    public void setMesinOn(boolean mesinOn) {
        this.mesinOn = mesinOn;
    }

    public boolean isKontakOn() {
        if(mesinOn == true)
        return kontakOn;
        return kontakOn;
    }

    public void setKontakOn(boolean kontakOn) {
        this.kontakOn = kontakOn;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    
    
}
    /*int kecepatan;
    boolean mesinOn;
    
    
    public MesinMotor(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    boolean getNyalakanMesin(){
        return mesinOn;
    }
    
    void setNyalakanMesin(boolean mesinOn){
        this.mesinOn = mesinOn;
    }
    
    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    /*
    public int increaseKecepatan(){
        if(mesinOn == true){
            setKecepatan(kecepatan);
        }else{
            System.out.println("mesin mati");
        }
        return kecepatan;
    }
    
    
    public int decreaseKecepatan(){
        if(mesinOn == true){
            setKecepatan(kecepatan);
        }else{
            System.out.println("mesin mati");
        }
        return kecepatan;
    }*/
    

