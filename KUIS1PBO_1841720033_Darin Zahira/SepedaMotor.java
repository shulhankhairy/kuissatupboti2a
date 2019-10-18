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
public class SepedaMotor {
    private Mesin mesin;
    
    SepedaMotor(String jenis){
        this.mesin = new  Mesin();
        mesin.setJenis(jenis);
    }
    
    public String getJenis(){
        return mesin.getJenis();
    }
    
    public void tambahKec(){
        mesin.tambahKecepatan();
        System.out.println("Kecepatan : "+mesin.getKecepatan()+" Km/Jam");
    }
    
     public void kurangKec(){
        mesin.kurangiKecepatan();
        System.out.println("Kecepatan : "+mesin.getKecepatan()+" Km/Jam");
    } 
    
    public void status(){
        mesin.info();
    }
    
    public void nyalakanSpd(){
        mesin.nyalaMesin();
        System.out.println("Mesin Sepeda Nyala");
    }
    
    public void matikanSpd(){
        mesin.matiMesin();
        System.out.println("Mesin Sepeda Mati");
    }
    
      
}
