/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quis1;

/**
 *
 * @author ASUS
 */
public class SepedaMotor extends Mesin{
    public boolean kontakOn = false;
    
    public void SepedaMotor(boolean kontakOn){
        this.kontakOn = kontakOn;
    }
    public void printData(){
        if(kontakOn == true){
            System.out.println("Motor Nyala");
        }else{
            System.out.println("Motor Mati");
        }  
    }
}