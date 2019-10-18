package Quis;
        
public class Mesin {
    public String mesin;
    public int kecepatan = 0;
    public int kecepatanMax = 380;
    public boolean kontakOn = false;

    public Mesin() {
    }

    public Mesin(String mesin) {
        this.mesin = mesin;
    }
    
    public String getMesin() {
        return mesin;
    }

    public void setMesin(String mesin) {
        this.mesin = mesin;
    }
    
    void nyalakanMesin(){
        kontakOn = true;
        System.out.println("Mesin nyala");
    }
    
    void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if(mesin.equalsIgnoreCase("Honda")){
            if(kontakOn == true){
                kecepatan += 10;
                System.out.println("Kecepatan anda masih masih " + kecepatan + "km/jam");
                if(kecepatan >= kecepatanMax){
                    System.out.println("Gas anda sudah pol");
                }
            }else{
                System.out.println("Mesin masih mati cuy");
            }
        }else if(mesin.equalsIgnoreCase("Yamaha")){
            if(kontakOn == true){
                kecepatan += 15;
                System.out.println("Kecepatan anda masih " + kecepatan + "km/jam");
                if(kecepatan >= kecepatanMax){
                    System.out.println("Anda Semakin dekat dengan tuhan");
                }
            }else{
                System.out.println("Mesin masih mati cuy");
            }
        }else if(mesin.equalsIgnoreCase("Suzuki")){
            if(kontakOn == true){
                kecepatan += 25;
                System.out.println("Kecepatan anda masih " + kecepatan + "km/jam");
                if(kecepatan >= kecepatanMax){
                    System.out.println("Gas anda sudah pol");
                }
            }else{
                System.out.println("Mesin masih mati cuy");
            }
        }else if(mesin.equalsIgnoreCase("Ducati")){
            if(kontakOn == true){
                kecepatan += 50;
                System.out.println("Kecepatan anda masih " + kecepatan + "km/jam");
                if(kecepatan >= kecepatanMax){
                    System.out.println("Gas anda sudah pol");
                }
            }else{
                System.out.println("Mesin masih mati cuy");
            }
        }else{
            System.out.println("Mesin masih mati cuy");
        }
    }
    
    public void kurangKecepatan(){
        if(mesin.contentEquals("Honda")){
            if(kontakOn == true){
                kecepatan -= 5;
            }else{
                System.out.println("Mesin masih mati apanya yang mau dikurangi");
            }
        }else if(mesin.contentEquals("Yamaha")){
            if(kontakOn == true){
                kecepatan -= 10;
            }else{
                System.out.println("Mesin masih mati apanya yang mau dikurangi");;
            }
        }else if(mesin.contentEquals("Suzuki")){
            if(kontakOn == true){
                kecepatan -= 15;
            }else{
                System.out.println("Mesin masih mati apanya yang mau dikurangi");
            }
        }else if(mesin.contentEquals("Ducati")){
            if(kontakOn == true){
                kecepatan -= 30;
            }else{
                System.out.println("Mesin masih mati apanya yang mau dikurangi");
            }
        }else{
            System.out.println("Mesin masih mati cuy");
        }
    }
    
    public void tampilMesin(){
        System.out.println("Merek Mesin : " + mesin);
        if(kontakOn == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "km/jam");
    }
}
