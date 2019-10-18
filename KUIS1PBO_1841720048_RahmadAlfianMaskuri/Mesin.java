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
public class Mesin {

    private String jenisMesin;
    private boolean kontakOn = false;
    private int kecepatan;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
    }

    public String getJenisMesin() {
        return jenisMesin;
    }

    public void setJenisMesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void tambahKecepatan() {
        if (jenisMesin.equalsIgnoreCase("Honda")) {
            if (kontakOn == true) {
                if (kecepatan >= 0 && kecepatan <= 380) {
                    kecepatan += 10;
                }else {
                    kecepatan = 380;
                    System.out.println("Kecepatan Maksimum HONDA 380km/h");
                }
            }else {
                kecepatan = 0;
            }
        }else if (jenisMesin.equalsIgnoreCase("Yamaha")) {
            if (kontakOn == true) {
                if (kecepatan >= 0 && kecepatan <= 380) {
                    kecepatan += 15;
                } else {
                    kecepatan = 380;
                    System.out.println("Kecepatan Maksimum YAMAHA 380km/h");
                }
            }else {
                kecepatan = 0;
            }
        }else if (jenisMesin.equalsIgnoreCase("Suzuki")) {
            if (kontakOn == true) {
                if (kecepatan >= 0 && kecepatan <= 200) {
                    kecepatan += 25;
                } else {
                    kecepatan = 200;
                    System.out.println("Kecepatan Maksimum SUZUKI 200km/h");
                }
            } else {
                kecepatan = 0;
            }
        } else if (jenisMesin.equalsIgnoreCase("Ducati")) {
            if (kontakOn == true) {
                if (kecepatan >= 0 && kecepatan <= 380) {
                    kecepatan += 50;
                } else {
                    kecepatan = 380;
                    System.out.println("Kecepatan Maksimum DUCATI 380km/h");
                }
            }
        }
    }

    public void kurangiKecepatan() {
        if (jenisMesin.equalsIgnoreCase("Honda")) {
            if (kontakOn == true) {
                if (kecepatan > 0 && kecepatan <= 380) {
                    kecepatan -= 5;
                } else {
                    kecepatan = 0;
                    System.out.println("Kecepatan tidak boleh 0 km/jam");

                }
            }else{
                
            }
        } else if (jenisMesin.equalsIgnoreCase("Yamaha")) {
            if (kontakOn == true) {
                if (kecepatan > 0 && kecepatan <= 380) {
                    kecepatan -= 10;
                } else {
                    kecepatan = 0;
                    System.out.println("Kecepatan tidak boleh 0 km/jam");

                }
            }else{
                
            }
        } else if (jenisMesin.equalsIgnoreCase("Suzuki")) {
            if (kontakOn == true) {
                if (kecepatan > 0 && kecepatan <= 200) {
                    kecepatan -= 15;
                } else {
                    kecepatan = 0;
                    System.out.println("Kecepatan tidak boleh 0 km/jam");

                }
            }
        } else if (jenisMesin.equalsIgnoreCase("Ducati")) {
            if (kontakOn == true) {
                if (kecepatan > 0 && kecepatan <= 380) {
                    kecepatan -= 30;
                } else {
                    kecepatan = 0;
                    System.out.println("Kecepatan tidak boleh 0 km/jam");

                }
            }else{
                
            }
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println();
            System.out.println("Kontak On");
        } else {
            System.out.println();
            System.out.println("Kontak Off");
            if (jenisMesin.equalsIgnoreCase("Honda")) {
                System.out.println("Nyalakan Mesin HONDA!");
                System.out.println("Tidak dapat melakukan penambahan/pengurangan");
            }
            else if (jenisMesin.equalsIgnoreCase("Yamaha")) {
               System.out.println("Nyalakan Mesin YAMAHA!");
                System.out.println("Tidak dapat melakukan penambahan/pengurangan");
            }else if(jenisMesin.equalsIgnoreCase("Suzuki")){
                System.out.println("Nyalakan Mesin SUZUKI!");
                System.out.println("Tidak dapat melakukan penambahan/pengurangan");
            }else if(jenisMesin.equalsIgnoreCase("Ducati")){
                System.out.println("Nyalakan Mesin DUCATI!");
                System.out.println("Tidak dapat melakukan penambahan/pengurangan");
        }else{
                System.out.println("Kategori Mesin Tidak Tersedia!");
            }
        }
        if (jenisMesin.equalsIgnoreCase("Ducati")) {
            System.out.println("Kecepatan DUCATI   :" + kecepatan);
            System.out.println("---------------------------------");
        }else if (jenisMesin.equalsIgnoreCase("Yamaha")) {
            System.out.println("Kecepatan YAMAHA   :" + kecepatan);
            System.out.println("---------------------------------");
        }else if (jenisMesin.equalsIgnoreCase("Suzuki")) {
            System.out.println("Kecepatan Suzuki   :" + kecepatan);
            System.out.println("---------------------------------");
        }else{
            System.out.println("Kecepatan Ducati   :" + kecepatan);
            System.out.println("---------------------------------");
        }
    }
}
