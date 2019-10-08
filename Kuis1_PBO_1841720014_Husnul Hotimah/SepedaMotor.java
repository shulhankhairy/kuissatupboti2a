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
public class SepedaMotor {
    private String jenis;
    private String warna;
    private Mesin mesin;

    public SepedaMotor() {
        
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }
    
    
    public void info(){
        mesin.info();
        System.out.println("Jenis Motor \t: "+jenis);
        System.out.println("Warna \t\t: "+warna);
        System.out.println("");
    }
}
