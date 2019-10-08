package Kuis1;
public class Mesin{
  private  int kecepatan = 0;
    private boolean kontakOn = false;
  
   Mesin(){
        
    }
    
   public void mesinOn(){
        kontakOn = true;
    }
    public void mesinOff(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void kurangiKecepatan(int decreasment){
        kecepatan = kecepatan - decreasment;
    }
 
    public void  tambahKecepatanSuzuki(){
        if (kecepatan<200) {
            if (kontakOn == true) {
                kecepatan += 20;
            }
            else{
                System.out.println("nyalakan mesin terlebih dahulu!");
            }
        } 
        else {
            System.out.println("Anda Berada Dalam Kecepatan Maksimum");
        }
    }
    public void  tambahKecepatanHonda(){
        if (kecepatan < 380) {
            if (kontakOn == true) {
                kecepatan += 10;
            }
            else{
                System.out.println("nyalakan mesin terlebih dahulu!");
            }
        } 
        else {
            System.out.println("Anda Berada Dalam Kecepatan Maksimum \n");
        }
    }
    public void tambahKecepatanYamaha(){
        if (kecepatan<380) {
            if (kontakOn == true) {
                kecepatan += 15;
            }
            else{
                System.out.println("nyalakan mesin terlebih dahulu!");
            }
        } 
        else {
            System.out.println("Anda Berada Dalam Kecepatan Maksimum \n");
        }
    }
    public void tambahKecepatanDucati(){
        if (kecepatan<380) {
            if (kontakOn == true) {
                kecepatan += 50;
            }
            else{
                System.out.println("nyalakan mesin terlebih dahulu!");
            }
        } 
        else {
            System.out.println("Anda Berada Dalam Kecepatan Maksimum \n");
        }
    }
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Mesin sudah Menyala");
        }else{
            System.out.println("Mesin Dalam Keadaan mati");
        }
        System.out.println("kecepatan = "+kecepatan+" km");
    }
   
}
    

