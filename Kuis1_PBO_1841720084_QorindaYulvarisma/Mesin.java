/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1PBO;

/**
 *
 * @author TOSHIBA
 */
public class Mesin {
    private String jenisMotor;
    private int kecepatan= 0;
    private int kecMaksimum = 380;
    private boolean sepedaMotorOn = false;

    public Mesin() {
    }

    public Mesin(String merk) {
        this.jenisMotor = merk;
    }

    public String getMerk() {
        return jenisMotor;
    }

    public void setMerk(String merk) {
        this.jenisMotor = merk;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getMaksimum() {
        return kecMaksimum;
    }

    public void setMaksimum(int maksimum) {
        this.kecMaksimum = maksimum;
    }

    public boolean isMesin() {
        return sepedaMotorOn;
    }

    public void setMesin(boolean mesin) {
        this.sepedaMotorOn = mesin;
    }
    
    public void nyalakanMesin(){
        sepedaMotorOn = true;
    }
    
    public void matikanMesin(){
        sepedaMotorOn = false;
        kecepatan= 0;
        
    }
    
    public void tambahKecepatan(){
        if(this.jenisMotor == "Honda"){
            kecepatan += 10;
        }
        else if(this.jenisMotor == "Yamaha"){
            kecepatan += 15;
        }
        else if(this.jenisMotor == "Suzuki"){
            kecepatan += 25;
        }
        else if(this.jenisMotor == "Ducati"){
            kecepatan += 50;
        }
    }
    
    public void kurangiKecepatan(){
        if(sepedaMotorOn == true){
            if(this.jenisMotor == "Honda"){
                kecepatan -= 5;
            }
            else if(this.jenisMotor == "Yamaha"){
                kecepatan -= 10;
            }
            else if(this.jenisMotor == "Suzuki"){
                kecepatan -= 15;
            }
            else if(this.jenisMotor == "Ducati"){
                kecepatan -= 30;
            }
        }else{
            System.out.println("Mesin OFF!");
        }
    }
    
    public void tampilMesin() {
        System.out.println("Jenis : "+jenisMotor);
        if (sepedaMotorOn == true){
            System.out.println("Mesin Nyala");
        }
        else {
            System.out.println("Mesin Mati");
        }
        System.out.println("Kecepatan " + kecepatan);
    }
    
}
