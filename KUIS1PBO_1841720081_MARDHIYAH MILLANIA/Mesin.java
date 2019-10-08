/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KuisPBO;

/**
 *
 * @author mmillania
 */
public class Mesin {
    private int kecepatan;
    private String tipe;
    private boolean kunci =false;
    
    public Mesin(){
        
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void mesinHidup(){
        kunci=true;
    }
    
    public void mesinMati(){
        kunci=false;
        kecepatan=0;
    }

  
    public void tambahKecepatan(){
        if (kunci == true) {
            if(tipe.equalsIgnoreCase("TipeHonda")){
                if(kecepatan>=380){
                    System.out.println("Tidak bisa menambah kecepatan lagi! Tipe Honda memiliki batas kecepatan maksimum 380km/jam");
                }else{
                     kecepatan = kecepatan += 10;  
                }
            }else if(tipe.equalsIgnoreCase("TipeYamaha")){
                if(kecepatan>=375){
                    System.out.println("Tidak bisa menambah kecepatan lagi! Tipe Yamaha memiliki batas kecepatan maksimum 380 km/jam");
                }else{
                     kecepatan = kecepatan += 15;  
                }
            }else if(tipe.equalsIgnoreCase("TipeSuzuki")){
                if(kecepatan>=200){
                    System.out.println("Tidak bisa menambah kecepatan lagi! Tipe Suzuki memiliki batas kecepatan maksimum 200 km/jam ");
                }else{
                     kecepatan = kecepatan +=25;  
                }
            }else if(tipe.equalsIgnoreCase("TipeDucati")){
                if(kecepatan>=350){
                    System.out.println("Tidak bisa menambah kecepatan lagi! Tipe Ducati memiliki batas kecepatan maksimum 380 km/jam");
                }else{
                     kecepatan = kecepatan += 50;  
                }
            }
            
            else{
                System.out.println("tipe motor tidak tersedia");
            }
        }else{
            System.out.println("Tidak bisa menambah kecepatan karena mesin dalam keadaan mati\n");
        }
    }
    public void kurangKecepatan(){
        if(kunci==true){
            if(tipe.equalsIgnoreCase("TipeHonda")){
                kecepatan = kecepatan - 5;
            }else if(tipe.equalsIgnoreCase("TipeYamaha")){
                kecepatan = kecepatan - 10;
            }else if(tipe.equalsIgnoreCase("TipeSuzuki")){
                kecepatan = kecepatan - 15;
            }else if(tipe.equalsIgnoreCase("TipeDucati")){
                kecepatan = kecepatan - 30;
            }
        }else{
            System.out.println("Tidak bisa mengurangi kecepatan karena mesin dalam keadaan mati \n");
        }
    }
    public void info(){
        if(kunci == true){
            System.out.println("Mesin Nyala");
        }else{
            System.out.println("Mesin Mati");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
    }
}
  