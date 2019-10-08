/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1PBO;

/**
 *
 * @author Mahendra
 */
public class mesin{
    public String merk;
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public mesin() {
    }

    public void nyalakanMesin(){
        kontakOn = true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatanYamaha(){
        if (kontakOn == true){
            kecepatan += 15;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    
    public void kurangikecepatanYamaha(){
        if(kontakOn == true){
            kecepatan -= 10;
        }
        else{
            System.out.println("kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    
    public void tambahKecepatanSuzuki(){
        if (kontakOn == true){
            kecepatan += 525;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
        if(kecepatan == 200){
            System.out.println("Wes maksimal brooo");
        }
    }
    
    public void kurangikecepatanSuzuki(){
        if(kontakOn == true){
            kecepatan -= 15;
        }
        else{
            System.out.println("kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    
      public void tambahKecepatanHonda(){
        if (kontakOn == true){
            kecepatan += 10;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    
    public void kurangikecepatanHonda(){
        if(kontakOn == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    
      public void tambahKecepatanDucati(){
        if (kontakOn == true){
            kecepatan += 50;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    
    public void kurangikecepatanDucati(){
        if(kontakOn == true){
            kecepatan -= 25;
        }
        else{
            System.out.println("kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    
    public void printStatus(){
        if (kontakOn == true){
        System.out.println("KOntak On");
    }
        else{
             System.out.println("KOntak Off");
        }
        System.out.println("kecepatan " + kecepatan);
        }
}