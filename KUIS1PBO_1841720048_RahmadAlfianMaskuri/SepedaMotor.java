/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispraktikum;

/**
 *
 * @author RahmadAL
 */
public class SepedaMotor {
    private int platNomor;
    private String jenisMotor;
    private Mesin mesin;

    public SepedaMotor() {
    }

    public int getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(int platNomor) {
        this.platNomor = platNomor;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }
    
    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }
    
    
    public void info() {
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Jenis Motor  :" + jenisMotor);
        System.out.println("Plat Nomor   :" +"N "+ platNomor);
        mesin.printStatus();
    }
}
