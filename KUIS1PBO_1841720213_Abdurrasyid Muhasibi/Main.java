package KUIS1PBO;

import java.util.Scanner;

public class Main {
    static SepedaMotor pemilik;
    static Scanner scString = new Scanner(System.in);
    static Scanner scInt = new Scanner(System.in);
    static String nama;
    static boolean menu = true;
    static int pil;
    
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.print("Nama Anda\t: ");
        pemilik = new SepedaMotor(scString.nextLine());
        System.out.println("=========================");
        pilihMesin();
        while(menu){
            tampilMenu();
        }
    }
    
    public static void pilihMesin(){
        System.out.println("Pilih Mesin Anda:");
        System.out.println("1. Honda");
        System.out.println("2. Yamaha");
        System.out.println("3. Suzuki");
        System.out.println("4. Ducati");
        System.out.print("Pilihan = ");
        pil = scInt.nextInt();
        System.out.println("=========================");
        switch(pil){
            case 1:
                Mesin honda = new Mesin("Honda");
                pemilik.setMesin(honda);
                //Montor milik pemilik, memiliki (has-a) mesin jenis Honda
                break;
            case 2:
                Mesin yamaha = new Mesin("Yamaha");
                pemilik.setMesin(yamaha);
                //Montor milik pemilik, memiliki (has-a) mesin jenis Yamaha
                break;
            case 3:
                Mesin suzuki = new Mesin("Suzuki");
                pemilik.setMesin(suzuki);
                //Montor milik pemilik, memiliki (has-a) mesin jenis Suzuki
                break;
            case 4:
                Mesin ducati = new Mesin("Ducati");
                pemilik.setMesin(ducati);
                //Montor milik pemilik, memiliki (has-a) mesin jenis Ducati
                break;
        }
    }
    
    public static void tampilMenu(){
        System.out.println("Pilih Menu :");
        System.out.println("1. Hidupkan Mesin");
        System.out.println("2. Matikan Mesin");
        System.out.println("3. Ganti Mesin");
        System.out.println("4. Tambah Kecepatan");
        System.out.println("5. Kurangi Kecepatan");
        System.out.println("6. Info");
        System.out.println("7. Keluar");
        System.out.print("Pilihan : ");
        pil = scInt.nextInt();
        System.out.println("=========================");
        switch(pil){
            case 1:
                pemilik.hidupkanMesin();
                break;
            case 2:
                pemilik.matikanMesin();
                break;
            case 3:
                pilihMesin();
                break;
            case 4:
                pemilik.tambahKecepatan();
                break;
            case 5:
                pemilik.kurangKecepatan();
                break;
            case 6:
                pemilik.info();
                break;
            case 7:
                menu = false;
                break;
        }
    }
}