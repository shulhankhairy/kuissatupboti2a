/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1PBO;

/**
 *
 * @author Mahendra
 */
public class SepedaMotor extends mesin {
    public String namaMerk;
    public mesin Mesin;

    public SepedaMotor() {
    }

    public SepedaMotor(String namaMerk, mesin Mesin) {
        this.namaMerk = namaMerk;
        this.Mesin = Mesin;
    }

    public String getNamaMerk() {
        return namaMerk;
    }

    public void setNamaMerk(String namaMerk) {
        this.namaMerk = namaMerk;
    }
    public void info(){
        System.out.println("merk : "+namaMerk);
        super.printStatus();
        
       
        }
     public void tampilMotor(){
            System.out.println("====================");
            System.out.println("BISMILAH MOTOR JAYA");
            System.out.println("===================");
    }
}