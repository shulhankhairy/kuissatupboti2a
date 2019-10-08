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
public class SepedaMotor {

    private String merk;
    private boolean status=false;
    public Mesin mesin;

    public SepedaMotor(){
    
    }
    
    public SepedaMotor(String merk) {
        this.merk = merk;
    }

    public boolean getStatus() {
        return status;
    }
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }
    
    public void nyalakanMesin(){
        status = true;
    }
    
    public void info() {
        System.out.println("+=====================================+");
        System.out.println("| Merk Mobil : " + getMerk());
        if (getStatus() == true) {
            System.out.println("+=====================================+");
            System.out.println("|         Sepeda Motor Hidup          |");
        } else {
            System.out.println("+=====================================+");
            System.out.println("|          Sepeda Motor Mati          |");
        }
        System.out.println("| Kecepatan : " + mesin.getKecepatan());
        System.out.println("+=====================================+");
    }
}
