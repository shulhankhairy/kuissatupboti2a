/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1;

/**
 *
 * @author ASUS
 */
public class Mesin extends SepedaMotor{
    public String jnMesin;
    
    public Mesin(int kec, String jnMesin){
        super(kec);
        this.jnMesin = jnMesin;
    }
    
    public void tampilMotor(){
        super.tampilKec();
        System.out.println("Jenis Mesin: " +jnMesin);
    }
    
    public void jnMesinSepeda(){
        if (jnMesin == "honda"){
            if(kec >= 380){
                super.kurangKecepatan(5);
            }
            tampilMotor();
        } else if (jnMesin == "yamaha"){
            super.tambahKecepatan(15);
            if(kec >= 380){
                super.kurangKecepatan(10);
            }
            tampilMotor();
        } else if (jnMesin == "suzuki"){
            super.tambahKecepatan(25);
            if(kec >= 200){
                super.kurangKecepatan(15);
            }
            tampilMotor();
        } else if (jnMesin == "ducati"){
            super.tambahKecepatan(50);
            if(kec >= 380){
                super.kurangKecepatan(30);
            }
            tampilMotor();
        } else{
            System.out.println("Jenis Motor tidak ada");
        }
    }
}