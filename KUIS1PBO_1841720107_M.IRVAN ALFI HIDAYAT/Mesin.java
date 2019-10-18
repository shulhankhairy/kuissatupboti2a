/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author IRVAN
 */
public class Mesin {
    private int kecepatan = 0;
    public SepedaMotor semo;
    
    public Mesin(){
    
    }
    
    public Mesin(int kecepatan){
        this.kecepatan=kecepatan;
    }
    
    public SepedaMotor getsemo() {
        return semo;
    }

    public void setsemo(SepedaMotor semo) {
        this.semo = semo;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public void tambahkanKecepatan() {
        if (semo.getStatus() == true) {
            if (semo.getMerk().equalsIgnoreCase("Honda")) {
                kecepatan += 10;
                if (kecepatan > 380) {
                    System.out.println("Kecepatan maksimal adalah 380Km/jam");
                    kecepatan = 380;
                }
            }else if(semo.getMerk().equalsIgnoreCase("Yamaha")) {
                kecepatan += 15;
                if (kecepatan > 380) {
                    System.out.println("Kecepatan maksimal adalah 380Km/jam");
                    kecepatan = 380;
                }
            }else if(semo.getMerk().equalsIgnoreCase("Suzuki")) {
                kecepatan = 25;
                if (kecepatan > 200) {
                    System.out.println("Kecepatan maksimal adalah 200Km/jam");
                    kecepatan = 200;
                }
            }else if (semo.getMerk().equalsIgnoreCase("Ducati")) {
                kecepatan += 50;
                if (kecepatan > 380) {
                    System.out.println("Kecepatan maksimal adalah 380Km/jam");
                    kecepatan = 380;
                }
            }
            else{
                System.out.println("Sepeda Off!! Hidupkan Kontak anda");
            }
        }
    }

    public void kurangiKecepatan() {
        if (semo.getStatus() == true) {
            if (semo.getMerk().equalsIgnoreCase("Honda")) {
                kecepatan -= 10;
                if (kecepatan > 380) {
                    System.out.println("Kecepatan maksimal adalah 380Km/jam");
                    kecepatan = 0;
                }
            }else if(semo.getMerk().equalsIgnoreCase("Yamaha")) {
                kecepatan -= 10;
                if (kecepatan > 380) {
                    System.out.println("Kecepatan maksimal adalah 380Km/jam");
                    kecepatan = 0;
                }
            }else if(semo.getMerk().equalsIgnoreCase("Suzuki")) {
                kecepatan -= 25;
                if (kecepatan > 200) {
                    System.out.println("Kecepatan maksimal adalah 200Km/jam");
                    kecepatan = 0;
                }
            }else if (semo.getMerk().equalsIgnoreCase("Ducati")) {
                kecepatan -= 50;
                if (kecepatan > 380) {
                    System.out.println("Kecepatan maksimal adalah 380Km/jam");
                    kecepatan = 0;
                }
            }
            else{
                System.out.println("Sepeda Off!! Hidupkan Kontak anda");
            }
        }
    }
    public int getKecepatan() {
        return kecepatan;
    }
}
