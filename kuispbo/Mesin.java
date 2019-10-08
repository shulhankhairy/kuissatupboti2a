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
public class Mesin {
    private String merek;
    private int kecepatan;
    private boolean kontakOn;
    
    public Mesin(){
        
    }

    public Mesin(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public boolean isKontakOn() {
        return kontakOn;
    }

    public void setKontakOn(boolean kontakOn) {
        this.kontakOn = kontakOn;
    }

    public void nyalakanMesin(){
        kontakOn=true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if(merek == "Honda"){
            if(kontakOn == true ){
                if(kecepatan <= 380 && kecepatan >= 0){
                    kecepatan += 10;
                }
            }else{
                System.out.println("Off");
            }
        }else if(merek == "Yamaha"){
            if(kontakOn == true ){
                if(kecepatan <= 380 && kecepatan >= 0){
                    kecepatan += 15;
                }
            }else{
                System.out.println("Off");
            }
        }else if(merek == "Suzuki"){
            if(kontakOn == true ){
                if(kecepatan <= 200 && kecepatan >= 0){
                    kecepatan += 25;
                }
            }else{
                System.out.println("Off");
            }
        }else if(merek == "Ducati"){
            if(kontakOn == true ){
                if(kecepatan <= 380 && kecepatan >= 0){
                    kecepatan += 50;
                }
            }else{
                System.out.println("Off");
            }
        }else{
            System.out.println("No other merek");
        }
    }
    
    public void kurangiKecepatan(){
        if(merek == "Honda"){
            if(kontakOn == true){
                kecepatan -= 5;
            }else{
                System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
            }
        }else if(merek == "Yamaha"){
            if(kontakOn == true){
                kecepatan -= 10;
            }else{
                System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
            }
        }else if(merek == "Suzuki"){
            if(kontakOn == true){
                kecepatan -= 15;
            }else{
                System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
            }
        }else if(merek == "Ducati"){
            if(kontakOn == true){
                kecepatan -= 30;
            }else{
                System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
            }
        }
    }
    
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak off");
        }
        System.out.println("Merk mesin :"+merek);
        System.out.println("Kecepatan "+kecepatan+"\n");
    }
    
}
