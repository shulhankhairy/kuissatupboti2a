package kuis1;

/**
 *
 * @author RioFebrian
 */
public class Mesin {
    int kecepatan;
    boolean kontakOn = false;
    
    public void engineOn(){
        kontakOn = true;
    }
    public void engineOff(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void kurangiKecepatan(int decreasment){
        kecepatan = kecepatan - decreasment;
    }
    public void speedUpSuzuki(){
        if (kecepatan!=200) {
            if (kontakOn == true) {
                kecepatan += 25;
            }
            else{
                System.out.println("nyalakan mesin terlebih dahulu!");
            }
        } 
        else {
            System.out.println("wes pol 200 km/jam! \n");
        }
    }
    public void speedUpHonda(){
        if (kecepatan!=380) {
            if (kontakOn == true) {
                kecepatan += 10;
            }
            else{
                System.out.println("nyalakan mesin terlebih dahulu!");
            }
        } 
        else {
            System.out.println("wes pol 380 km/jam! \n");
        }
    }
    public void speedUpYamaha(){
        if (kecepatan!=380) {
            if (kontakOn == true) {
                kecepatan += 15;
            }
            else{
                System.out.println("nyalakan mesin terlebih dahulu!");
            }
        } 
        else {
            System.out.println("wes pol 380 km/jam! \n");
        }
    }
    public void speedUpDucati(){
        if (kecepatan!=380) {
            if (kontakOn == true) {
                kecepatan += 50;
            }
            else{
                System.out.println("nyalakan mesin terlebih dahulu!");
            }
        } 
        else {
            System.out.println("wes pol 380 km/jam! \n");
        }
    }
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Mesin sudah Menyala");
        }else{
            System.out.println("Mesin Keadaan mati");
        }
        System.out.println("kecepatan = "+kecepatan+" km/jam");
    }
}