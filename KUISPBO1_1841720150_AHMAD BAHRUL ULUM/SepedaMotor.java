/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUIS1;

/**
 *
 * @author asus
 */
public class SepedaMotor extends Mesin {
   private String MerkMotor;
   private Mesin mesin;
  
     SepedaMotor(){
         
     }
    public String getMerkMotor() {
        return MerkMotor;
    }

    public void setMerkMotor(String MerkMotor) {
        this.MerkMotor = MerkMotor;
    }

  
    public void TampilData(){
        System.out.println("-----------------------");
        System.out.println("Merk ="+MerkMotor);
        super.TampilData();
    }
    
    
}
 


 



