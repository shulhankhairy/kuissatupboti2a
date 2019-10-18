/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUIS1;

/**
 *
 * @author asus
 */
public class Mesin{
    private int kecepatan;
     public boolean kontakOn = false;
    
   Mesin(){
        
    }

    public void mesinNyala(){
        kontakOn = true;
    }
    public void mesinMati(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void kurangiKecepatan(int decreasment){
        kecepatan = kecepatan - decreasment;
    }
    public void kecepatanSuzuki(){
        if (kecepatan<200) {
            if (kontakOn == true) {
                kecepatan += 25;
                
            }
            else{
                System.out.println("Nyalakan mesinmu dulu dong!");
            }
        } 
        else {
            System.out.println("Anda berada di batas kecepatan sayangi nyawamu! \n");
        }
    }
    public void kecepatanHonda(){
        if (kecepatan<380) {
            if (kontakOn == true) {
                kecepatan += 10;
            }
            else{
                System.out.println("Nyalakan mesinmu dulu dong!");
            }
        } 
        else {
            System.out.println("Anda berada di batas kecepatan sayangi nyawamu!\n");
        }
    }
    public void kecepatanYamaha(){
        if (kecepatan<380) {
            if (kontakOn == true) {
                kecepatan += 15;
            }
            else{
                System.out.println("Nyalakan mesinmu dulu dong!");
            }
        } 
        else {
            System.out.println("Anda berada di batas kecepatan sayangi nyawamu!\n");
        }
    }
    public void kecepatanDucati(){
        if (kecepatan<380) {
            if (kontakOn == true) {
                kecepatan += 50;
            }
            else{
                System.out.println("Nyalakan mesinmu dulu dong!");
            }
        } 
        else {
            System.out.println("Anda berada di batas kecepatan sayangi nyawamu! \n");
        }
    }
    public void TampilData(){
        if(kontakOn == true){
            System.out.println("Mesin Dalam Keadaan Hidup");
        }
        else{
            System.out.println("Mesin Dalam Keadaan mati");
        }
        System.out.println("kecepatan = "+kecepatan+" km/jam");
    }
  
   
}
 






