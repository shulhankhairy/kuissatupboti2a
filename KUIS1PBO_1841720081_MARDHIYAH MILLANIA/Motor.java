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
public class Motor {
    private Mesin mesin;
    private String merk;
    
    public Motor(String merk, String tipe){
        this.merk=merk;
        this.mesin=new Mesin();
        mesin.setTipe(tipe);
    }
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public String getTipe() {
        return mesin.getTipe();
    }
    
    public void tambahKecepatan(){
        mesin.tambahKecepatan();
        System.out.println(mesin.getKecepatan()+ "  Km/Jam");
    }
    
    public void kurangKecepatan(){
        mesin.kurangKecepatan();
        System.out.println(mesin.getKecepatan()+ "  Km/Jam");
    }
     public void status(){
        mesin.info();
    }
    
    public void hidup(){
        mesin.mesinHidup();
    }
    
    public void mati(){
        mesin.mesinMati();
    }

}

