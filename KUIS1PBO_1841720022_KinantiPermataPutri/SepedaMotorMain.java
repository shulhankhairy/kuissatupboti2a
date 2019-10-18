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
public class SepedaMotorMain {
    public static void main(String[] args) {
        Mesin h = new Mesin(0, "honda");
        h.jnMesinSepeda();
        
        Mesin y = new Mesin(0, "yamaha");
        y.jnMesinSepeda();
        
        Mesin s = new Mesin(0, "suzuki");
        s.jnMesinSepeda();
        
        Mesin d = new Mesin(0, "ducati");
        d.jnMesinSepeda();
    }
}