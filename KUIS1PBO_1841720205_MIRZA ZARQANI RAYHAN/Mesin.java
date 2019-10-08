package Kuis;

public class Mesin {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    public void nyalakanMesin(){
       kontakOn = true;
        System.out.println("Mesin Telah dinyalakan");
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
        System.out.println("Mesin Telah dimatikan");
    }
    
    public void tambahKecepatanHonda(){
        if (kontakOn == true){
            if (kecepatan<=380 && kecepatan>=0){
               kecepatan += 10; 
               System.out.println("Kecepatan Mesin anda Naik menjadi : "+kecepatan);
            } else {
                System.out.println("Melebihi maksimal");
            }    
        } else {
            System.out.println("Kecepatan tidak bisa ditambahkan karena mesin masih dalam keaadaan mati\n");
        }
    }
    
    public void tambahKecepatanYamaha(){
        if (kontakOn == true){
            if (kecepatan<=380 && kecepatan>=0){
               kecepatan += 15; 
               System.out.println("Kecepatan Mesin anda Naik menjadi : "+kecepatan);
            } else {
                System.out.println("Melebihi maksimal");
            }    
        } else {
            System.out.println("Kecepatan tidak bisa ditambahkan karena mesin masih dalam keaadaan mati\n");
        }
    }
    
    public void tambahKecepatanSuzuki(){
        if (kontakOn == true){
            if (kecepatan<=200 && kecepatan>=0){
               kecepatan += 25; 
               System.out.println("Kecepatan Mesin anda Naik menjadi : "+kecepatan);
            } else {
                System.out.println("Melebihi maksimal");
            }    
        } else {
            System.out.println("Kecepatan tidak bisa ditambahkan karena mesin masih dalam keaadaan mati\n");
        }
    }
    
    public void tambahKecepatanDucati(){
        if (kontakOn == true){
            if (kecepatan<=380 && kecepatan>=0){
               kecepatan += 50;
               System.out.println("Kecepatan Mesin anda Naik menjadi : "+kecepatan);
            } else {
                System.out.println("Melebihi maksimal");
            }    
        } else {
            System.out.println("Kecepatan tidak bisa ditambahkan karena mesin masih dalam keaadaan mati\n");
        }
    }
    
    public void kurangiKecepatanHonda(){
        if (kontakOn == true){
            kecepatan -= 5;
            System.out.println("Kecepatan Mesin anda Turun menjadi : "+kecepatan);
        } else {
            System.out.println("Kecepatan tidak bisa ditambahkan karena mesin masih dalam keaadaan mati\n");
        }
    }
    
    public void kurangiKecepatanYamaha(){
        if (kontakOn == true){
            kecepatan -= 10;
            System.out.println("Kecepatan Mesin anda Turun menjadi : "+kecepatan);
        } else {
            System.out.println("Kecepatan tidak bisa ditambahkan karena mesin masih dalam keaadaan mati\n");
        }
    }
    
    public void kurangiKecepatanSuzuki(){
        if (kontakOn == true){
            kecepatan -= 15;
            System.out.println("Kecepatan Mesin anda Turun menjadi : "+kecepatan);
        } else {
            System.out.println("Kecepatan tidak bisa ditambahkan karena mesin masih dalam keaadaan mati\n");
        }
    }
    
    public void kurangiKecepatanDucati(){
        if (kontakOn == true){
            kecepatan -= 30;
            System.out.println("Kecepatan Mesin anda Turun menjadi : "+kecepatan);
        } else {
            System.out.println("Kecepatan tidak bisa ditambahkan karena mesin masih dalam keaadaan mati\n");
        }
    }
    
    public void printStatus(){
        if (kontakOn==true){
            System.out.println("Mesin dalam keadaan menyala");
        } else {
            System.out.println("Mesin dalam keadaan mati");
        }
    }
}
