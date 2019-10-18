/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ;

/**
 *
 * @author akhdanhifzhan
 */
public class Motor extends Mesin{
    private String warna,type;

    public Motor() {
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void cetakMotor(){
        System.out.println("Warna Motor : "+warna);
        System.out.println("Type Motor  : "+type);
    }
}
