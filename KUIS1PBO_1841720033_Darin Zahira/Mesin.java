/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1;

/**
 *
 * @author asus
 */
public class Mesin {
    private int kecepatan;
    private String jenis;
    private boolean kunci = false;
    
    Mesin(){
        
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public String getJenis() {
        return jenis;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public void nyalaMesin() {
        kunci = true;
    }
    
    public void matiMesin(){
        kunci = false;
        kecepatan = 0;
    }


    public void tambahKecepatan(){
        if(kunci == true){
        if(jenis.equalsIgnoreCase("Honda")){
            if (kecepatan >= 380){
                System.out.println("Kecepatan Maksimum");
                kecepatan = 380;
            }else{
                kecepatan +=10;
            }
            
        }else if(jenis.equalsIgnoreCase("Yamaha")){
            if(kecepatan >= 380){
                System.out.println("Kecepatan Maksimum");
                kecepatan = 380;
            }else{
                kecepatan += 15;
            }
        }else if(jenis.equalsIgnoreCase("Suzuki")){
            
            if(kecepatan >= 200){
                System.out.println("Kecepatan Maksimum");
                kecepatan = 200;
            }else{
                kecepatan +=25;
            }
        }else if(jenis.equalsIgnoreCase("Ducati")){
            
            if(kecepatan >= 380){
                System.out.println("Kecepatan Maksimum");
                kecepatan = 380;
            }else{
                kecepatan +=50;
            }
        }
        }else{
            System.out.println("Tidak dapat menambah kecepatan!");
            System.out.println("Nyalakan Mesin dahulu");
        }
        
    }
    
    public void kurangiKecepatan(){
        if(kunci == true){
            if(jenis.equalsIgnoreCase("Honda")){
            
            if(kecepatan < 1){
                System.out.println("Kecepatan Minimum");
                kecepatan = 0;
            }else{
                kecepatan -=5;
            }
        }else if(jenis.equalsIgnoreCase("Yamaha")){
            
            if(kecepatan < 1){
                System.out.println("Kecepatan Minimum");
                kecepatan = 0;
            }else{
                kecepatan -=10;
            }
        }else if(jenis.equalsIgnoreCase("Suzuki")){
            
            if(kecepatan < 1){
                System.out.println("Kecepatan Minimum");
                kecepatan = 0;
            }else{
                kecepatan -=15;
            }
        }else if(jenis.equalsIgnoreCase("Ducati")){
           
            if(kecepatan < 1){
                System.out.println("Kecepatan Minimum");
                kecepatan = 0;
            }else{
                 kecepatan -=30;
            }
        }
        }else{
            System.out.println("Tidak dapat mengurangi kecepatan!");
            System.out.println("Nyalakan Mesin dahulu");
        }
        
    }
    
    public void info(){
        if(kunci == false){
            System.out.println("Mesin Mati");
        }else{
            System.out.println("Mesih hidup");
            System.out.println("Kecepatan "+ kecepatan);
        }
    }
}
