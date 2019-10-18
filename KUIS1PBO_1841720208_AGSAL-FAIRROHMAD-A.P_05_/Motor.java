/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author Aegis
 */
public class Motor extends MesinMotor {
    String nama;
    int tambah,kurang;

    public Motor(String nama, boolean mesinOn, boolean kontakOn, int kecepatan) {
        super(mesinOn, kontakOn, kecepatan);
        this.nama = nama.toLowerCase();
    }
    

    void kurang() {
        if(this.kecepatan >=0){
            if(nama.toLowerCase() =="honda"){
                this.kurang=5;
                this.kecepatan -= kurang;
            }else if(nama.toLowerCase()=="yamaha"){
                this.kurang=10;
                this.kecepatan -=kurang;
            }else if(nama.toLowerCase()=="suzuki"){
                this.kurang=15;
                this.kecepatan -= kurang;
            }else if(nama.toLowerCase()=="ducati"){
                this.kurang=30;
                this.kecepatan -= kurang;
            }

        }else{
            this.kecepatan = 0;
        }
        System.out.println("kurang :"+kurang);
    }
    
    void tambah() {
        if(mesinOn == true && kontakOn ==  true){
            if(nama.toLowerCase() == "suzuki"){
                if(this.kecepatan <= 200){
                    this.tambah=25;
                    this.kecepatan += tambah;
                }else{
                    this.kecepatan = 200;
                }
            }else if(this.kecepatan <=380){
                if(nama.toLowerCase() =="honda"){
                    this.tambah=10;
                    this.kecepatan += tambah;
                }else if(nama.toLowerCase()=="yamaha"){
                    this.tambah=15;
                    this.kecepatan +=tambah;
                }else if(nama.toLowerCase()=="ducati"){
                    this.tambah=50;
                    this.kecepatan += tambah;
                }
            }else{
                this.kecepatan = 380;
            }
        }else
            System.out.println("mesin tidak hidup");
        System.out.println("tambah :"+tambah);
    }
    
    void print(){
        System.out.println("merk :"+nama);
        System.out.println("kec :"+kecepatan);
        

    }
}
    /*String merk;
    MesinMotor motor;
    boolean kontakOn = false;
    int increase,decrease;
    
    public Motor(String merk, MesinMotor motor, int kecepatan) {
        super(kecepatan);
        this.merk = merk;
        this.motor = motor;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public MesinMotor getMotor() {
        return motor;
    }

    public void setMotor(MesinMotor motor) {
        this.motor = motor;
    }

    public int getKecepatan() {
        if(kontakOn==true){
            kecepatan = kecepatan;
        }
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public boolean isMesinOn() {
        return mesinOn;
    }

    public void setMesinOn(boolean mesinOn) {
        this.mesinOn = mesinOn;
    }

}*/
