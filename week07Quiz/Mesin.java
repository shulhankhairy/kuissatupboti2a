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
public class Mesin{
    
    private  int kecepatan;
    private boolean kontakOn = false;
  
   Mesin(){
        
    }
    
   public void mesinOn(){
        kontakOn = true;
    }
    public void mesinOff(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void kurangiKecepatan(int decreasment){
        kecepatan = kecepatan - decreasment;
    }
 
    public void tambahKecepatanSuzuki(){
        if (kontakOn == true){
            if (kecepatan<=200 && kecepatan>=0){
               kecepatan += 25;
               System.out.println("Kecepatan Mesin anda Naik menjadi : "+kecepatan);
            } else {
                System.out.println("Melebihi maksimal");
            }    
        } else {
            System.out.println("Kecepatan tidak bisa ditambahkan karena mesin masih dalam keaadaan mati\n");
        }
    }
    public void tambahKecepatanHonda(){
        if (kontakOn == true){
            if (kecepatan<=380 && kecepatan>=0){
               kecepatan += 10;
               System.out.println("Kecepatan Mesin anda Naik menjadi : "+kecepatan);
            } else {
                System.out.println("Melebihi maksimal");
            }    
        } else {
            System.out.println("Kecepatan tidak bisa ditambahkan karena mesin masih dalam keaadaan mati\n");
        }
    }
    
    public void tambahKecepatanYamaha(){
        if (kontakOn == true){
            if (kecepatan<=380 && kecepatan>=0){
               kecepatan += 15;
               System.out.println("Kecepatan Mesin anda Naik menjadi : "+kecepatan);
            } else {
                System.out.println("Melebihi maksimal");
            }    
        } else {
            System.out.println("Kecepatan tidak bisa ditambahkan karena mesin masih dalam keaadaan mati\n");
        }
    }
    
    public void tambahKecepatanDucati(){
        if (kontakOn == true){
            if (kecepatan<=380 && kecepatan>=0){
               kecepatan += 50;
               System.out.println("Kecepatan Mesin anda Naik menjadi : "+kecepatan);
            } else {
                System.out.println("Melebihi maksimal");
            }    
        } else {
            System.out.println("Kecepatan tidak bisa ditambahkan karena mesin masih dalam keaadaan mati\n");
        }
    }
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Mesin sudah Hidup");
        }else{
            System.out.println("Mesin mati");
        }
        
    }
}
