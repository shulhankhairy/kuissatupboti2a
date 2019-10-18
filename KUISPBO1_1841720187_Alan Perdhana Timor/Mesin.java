/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author Alan PC
 */
public class Mesin extends SepedaMotor {
     private int kecepatan = 0;
    private boolean kontakOn = false;
    private String merkMesin;

    public Mesin() {
    }

    public Mesin(String merkMesin) {
        this.merkMesin = merkMesin;
    }
    
    
    public void nayalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatanYamaha(){
         if (kontakOn == true){
            kecepatan += 15;
        }else{
            System.out.println("kecepatan tak bisa tambah karena mesin off/mati!");
        }
        
    }
    public void kurangiKecepatanYamaha(){
        if (kontakOn == true){
            kecepatan -= 10;
        }else{
            System.out.println("kecepatan tak bisa tambah karena mesin off/mati!");
        }
    }
    public void tambahKecepatanHonda(){
         if (kontakOn == true){
            kecepatan += 10;
        }else{
            System.out.println("kecepatan tak bisa tambah karena mesin off/mati!");
        }
    }
    public void kurangiKecepatanHonda(){
        if (kontakOn == true){
            kecepatan -= 5;
        }else{
            System.out.println("kecepatan tak bisa tambah karena mesin off/mati!");
        }
    }
    public void tambahKecepatanSuzuki(){
         if (kontakOn == true){
            kecepatan += 25;
        }else{
            System.out.println("kecepatan tak bisa tambah karena mesin off/mati!");
        }
        if(kecepatan >=200){
            System.out.println("Kecepatan maksimum!! Hati-hati bro");
        }
    }
    public void kurangiKecepatanSuzuki(){
        if (kontakOn == true){
            kecepatan -= 15;
        }else{
            System.out.println("kecepatan tak bisa tambah karena mesin off/mati!");
        }
        
    }
    public void tambahKecepatanDucati(){
         if (kontakOn == true){
            kecepatan += 50;
        }else{
            System.out.println("kecepatan tak bisa tambah karena mesin off/mati!");
        }
        
    }
    public void kurangiKecepatanDucati(){
        if (kontakOn == true){
            kecepatan -= 30;
        }else{
            System.out.println("kecepatan tak bisa tambah karena mesin off/mati!");
        }
    }
    
    public void tampilSepeda(){
        System.out.println("Merk Sepeda Motor: "+ merkMotor);
        System.out.println("Merk Mesin       : "+ merkMesin);
    }
    
    public void tampildata(){
        if (kontakOn == true){
            System.out.println("kontak on");
        }else{
            System.out.println("kotak off");
        }
        System.out.println("kecepatan "+ kecepatan+"\n");
        
        if(kecepatan>=380){
            System.out.println("Kecepatan maksimum. \nHati-hati, ingat keluarga dirumah");
        }else if(kecepatan<=0){
            System.out.println("Anda berhenti");
        }
    }
    
    
}

