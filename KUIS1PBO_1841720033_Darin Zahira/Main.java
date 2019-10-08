/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SepedaMotor sp1 = new SepedaMotor("honda");
        System.out.println("Jenis Mesin : "+sp1.getJenis());
        System.out.println("===============================");
        sp1.tambahKec();
        sp1.nyalakanSpd();
        sp1.tambahKec();
        sp1.tambahKec();
        sp1.kurangKec();
        sp1.matikanSpd();
        
        SepedaMotor sp2 = new SepedaMotor("ducati");
        System.out.println("Jenis Mesin : "+sp2.getJenis());
        System.out.println("===============================");
        sp2.tambahKec();
        sp2.nyalakanSpd();
        sp2.tambahKec();
        sp2.tambahKec();
        sp2.kurangKec();
        sp2.matikanSpd();
    }
}
