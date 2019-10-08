/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizTI2A;

/**
 *
 * @author Husnul
 */
public class Mesin {
    private int kecepatan;
    private String mesin;
    private boolean kontakOn = false;

    public Mesin() {
        
    }
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public String getMesin() {
        return mesin;
    }

    public void setMesin(String mesin) {
        this.mesin = mesin;
    }
    
    public void tambahKecepatan(){
        if (kontakOn == true){
            if(mesin.equalsIgnoreCase("Honda")){
                if(kecepatan == 380){
                    System.out.println("Kecepatan tidak bisa ditambah karena Mencapai Batas Maksimum  380 km/jam"); 
                }
                else{
                    kecepatan += 10;
                    if(kecepatan >= 380){
                        System.out.println("Kecepatan Mencapai Batas Maksimum  380 km/jam ;");
                    }
                }
            }
            else if(mesin.equalsIgnoreCase("Yamaha")){
                if(kecepatan == 380){
                    System.out.println("Kecepatan tidak bisa ditambah karena Mencapai Batas Maksimum  380 km/jam"); 
                }
                else{
                    kecepatan += 15;
                    if(kecepatan >= 380){
                        System.out.println("Kecepatan Mencapai Batas Maksimum  380 km/jam ;");
                    }
                }
            }
            
            else if(mesin.equalsIgnoreCase("Suzuki")){
                if(kecepatan == 200){
                    System.out.println("Kecepatan tidak bisa ditambah karena Mencapai Batas Maksimum  200 km/jam"); 
                }
                else{
                    kecepatan += 25;
                    if(kecepatan >= 200){
                        System.out.println("Kecepatan Mencapai Batas Maksimum  200 km/jam ;");
                    }
                }
            }
            
            else if(mesin.equalsIgnoreCase("Ducati")){
                if(kecepatan == 380){
                    System.out.println("Kecepatan tidak bisa ditambah karena Mencapai Batas Maksimum  380 km/jam"); 
                }
                else{
                    kecepatan += 50;
                    if(kecepatan >= 380){
                        System.out.println("Kecepatan Mencapai Batas Maksimum  380 km/jam ;");
                    }
                }
            }
        }
        else {
            System.out.println("Mesin Off!");
            System.out.println("Nyalakan Mesin Terlebih Dahulu");
        }
    }
    
    public void kurangiKecepatan() {
        if (kontakOn == true){
            if(mesin.equalsIgnoreCase("Honda")){
                kecepatan -= 5;
                if (kecepatan < 0) {
                    kecepatan = 0;
                    System.out.println("Kecepatan Min 0 km/jam");
                }
            }
            else if(mesin.equalsIgnoreCase("Yamaha")){
                kecepatan -= 10;
                if (kecepatan < 0) {
                    kecepatan = 0;
                    System.out.println("Kecepatan Min 0 km/jam");
                }
            }
            
            else if(mesin.equalsIgnoreCase("Suzuki")){
                kecepatan -= 15;
                if (kecepatan < 0) {
                    kecepatan = 0;
                    System.out.println("Kecepatan Min 0 km/jam");
                }
            }
            
            else if(mesin.equalsIgnoreCase("Ducati")){
                kecepatan -= 30;
                if (kecepatan < 0) {
                    kecepatan = 0;
                    System.out.println("Kecepatan Mencapai Batas Minimum 0 km/jam");
                }
            }
        }
        else {
            System.out.println("Tidak bisa mengurangi kecepatan karena Mesin Off! \n");
        }
    }
    
    public int getKecepatan() {
        return kecepatan;
    }
    
    public void info(){
        System.out.println("");
        System.out.println("Jenis Mesin \t: "+getMesin());
        if(kontakOn == true) {
            System.out.println("Kondisi Mesin \t: ON");
        }
        else {
            System.out.println("Kondisi Mesin \t: OFF");
        }
        
        System.out.println("Kecepatan \t: "+getKecepatan()+" km/jam");
        
    }
}
