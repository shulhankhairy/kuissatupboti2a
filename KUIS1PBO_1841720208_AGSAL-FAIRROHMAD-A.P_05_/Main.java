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
public class Main {
    public static void main(String[] args) {
        Motor m1 = new Motor("honda", false, true, 0);
        m1.print();
        m1.tambah();
        m1.tambah();
        m1.kurang();
        m1.kurang();
        m1.print();
        System.out.println("---------------------------------");
        Motor m2 = new Motor("ducati", true, true, 0);
        m2.print();
        m2.tambah();
        m2.print();
        System.out.println("----------------------------------");
        Motor m3 = new Motor("suzuki", true, true, 10);
        m3.print();
        m3.tambah();
        m3.kurang();
        m3.print();
        
    }
}
