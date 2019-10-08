/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ;

/**
 *
 * @author akhdanhifzhan
 */
public class Mesin {
    private String jenis;
    private int kecepatan;
    private boolean kontakOn = false;

    public Mesin() {
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if(kontakOn == true){
        this.kecepatan = kecepatan;
        }
    }
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if(kontakOn == true){
            if(jenis == "Honda"){
                if(kecepatan >= 380){
                kecepatan += 10; 
                }
                kecepatan = 380;
            }else if(jenis == "Yamaha"){
                if(kecepatan >= 380){
                kecepatan += 15;
                }
                kecepatan = 380;
            }else if(jenis == "Suzuki"){
                if(kecepatan >= 200){
                kecepatan += 5;
                }
                kecepatan = 200;
            }else if(jenis == "Ducati"){
                if(kecepatan >= 380){
                kecepatan += 50;
                }
                kecepatan = 380;
            }
        }else{
            System.out.println("Mesinnya masih mati brow!");
        }
    }
    public void kurangiKecepatan(){
        if(kontakOn == true){
            if(kecepatan <= 0){
                kecepatan = 0;
            }
            if(jenis == "Honda"){
                kecepatan -= 5;
            }else if(jenis == "Yamaha"){
                kecepatan -= 10;
            }else if(jenis == "Suzuki"){
                kecepatan -= 15;
            }else if(jenis == "Ducati"){
                kecepatan -= 30;
            }
        }else{
            System.out.println("Mesinnya masih mati brow!");
        }
    }
    public void cetakMesin(){
        if (kontakOn == true){
            System.out.println("Kontak On");
        } else{
            System.out.println("Kontak Off");
        }
        System.out.println("Jenis Mesin : "+jenis);
        System.out.println("Kecepatan   : "+kecepatan);
    }
}
