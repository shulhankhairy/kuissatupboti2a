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
public class Mesin{
    public String merk;
    public int kecepatan;
    public boolean kontakOn = false;
    
    Mesin(){
        
    }
    public void mesin(String merk, int kecepatan, boolean kontakOn){
        this.merk = merk;
        this.kecepatan = kecepatan;
        this.kontakOn = kontakOn;
    }
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public int getKecepatan(){
        return kecepatan;
    }
    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }
    public boolean getKontakOn(){
        return kontakOn;
    }
    public void setKontakOn(boolean kontakOn){
        this.kontakOn = kontakOn;
    }
    public void tambahKecepatan(){
        if(kontakOn == true){
            kecepatan += 10;
            System.out.println("kecepatan: "+kecepatan);
        }else{
            System.out.println("Ora iso");
        }
    }
    public void kurangKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
        }else{
            System.out.println("Ora iso");
        }
    }
    public void printMotor(){
        System.out.println("Merk : "+merk);
        System.out.println("Kecepatan : "+kecepatan);
    }
    
}
