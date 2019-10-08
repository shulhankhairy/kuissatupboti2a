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
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Motor mb = new Motor();
        Mesin ms = new Mesin();
        
        mb.setType("Bebek");
        mb.setWarna("Merah");
        mb.cetakMotor();
        ms.setJenis("Honda");
        ms.nyalakanMesin();
        ms.cetakMesin();
        ms.setKecepatan(20);
        ms.cetakMesin();
        ms.tambahKecepatan();
        ms.cetakMesin();
        ms.kurangiKecepatan();
        ms.cetakMesin();
        ms.matikanMesin();
        ms.cetakMesin();
        System.out.println("--------------------");
        mb.setType("Bebek");
        mb.setWarna("Biru");
        mb.cetakMotor();
        ms.setJenis("Yamaha");
        ms.nyalakanMesin();
        ms.cetakMesin();
        ms.setKecepatan(40);
        ms.cetakMesin();
        ms.tambahKecepatan();
        ms.cetakMesin();
        ms.kurangiKecepatan();
        ms.cetakMesin();
        ms.matikanMesin();
        ms.cetakMesin();
        System.out.println("--------------------");
        mb.setType("Sport");
        mb.setWarna("Hitam");
        mb.cetakMotor();
        ms.setJenis("Suzuki");
        ms.nyalakanMesin();
        ms.cetakMesin();
        ms.setKecepatan(190);
        ms.cetakMesin();
        ms.tambahKecepatan();
        ms.cetakMesin();
        ms.kurangiKecepatan();
        ms.cetakMesin();
        ms.matikanMesin();
        ms.cetakMesin();
        System.out.println("--------------------");
        mb.setType("Sport");
        mb.setWarna("Abu-abu");
        mb.cetakMotor();
        ms.setJenis("Ducati");
        ms.nyalakanMesin();
        ms.cetakMesin();
        ms.setKecepatan(350);
        ms.cetakMesin();
        ms.tambahKecepatan();
        ms.cetakMesin();
        ms.kurangiKecepatan();
        ms.cetakMesin();
        ms.matikanMesin();
        ms.cetakMesin();
    }
}
