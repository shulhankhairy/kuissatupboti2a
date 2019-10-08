package quizpraktikumpbo;

/**
 *
 * @author asus
 */
public class Mesin {
    public int kecepatan=0;
    private boolean mesinOn = false;
    
    public void nyalakanMesin() {
        mesinOn = true;    
    }
    public void matikanmesin() {
        mesinOn = false; 
        kecepatan = 0;
    }
    public void tambahKecepatanHonda(){
        if (mesinOn == true){
            if (kecepatan<=380 && kecepatan>=0){
               kecepatan += 10;
               System.out.println("Kecepatan Mesin anda sekarang : " + kecepatan);
            } else {
                System.out.println("Kecepatan Maksimal 380");
            }    
        } else {
        }
    }
    public void tambahKecepatanYamaha(){
        if (mesinOn == true){
            if (kecepatan<=380 && kecepatan>=0){
               kecepatan += 15;
               System.out.println("Kecepatan Mesin anda sekarang : " + kecepatan);
            } else {
                System.out.println("Kecepatan Maksimal 380");
            }    
        } else {
        }
    }
    public void tambahKecepatanSuzuki(){
        if (mesinOn == true){
            if (kecepatan<=380 && kecepatan>=0){
               kecepatan += 25;
               System.out.println("Kecepatan Mesin anda sekarang : " + kecepatan);
            } else {
                System.out.println("Kecepatan Maksimal 380");
            }    
        } else {
        }
    }
    public void tambahKecepatanDucati(){
        if (mesinOn == true){
            if (kecepatan<=380 && kecepatan>=0){
               kecepatan += 50;
               System.out.println("Kecepatan Mesin anda sekarang : " + kecepatan);
            } else {
                System.out.println("Kecepatan Maksimal 380");
            }    
        } else {
        }
    }
    public void kurangiKecepatanHonda(){
        if (mesinOn == true){
            if (kecepatan<=380 && kecepatan>=0){
               kecepatan -= 5;
               System.out.println("Kecepatan Mesin anda sekarang : " + kecepatan);
            } else {
                System.out.println("Kecepatan Minimum 0");
            }    
        } else {
        }
    }
    public void kurangiKecepatanYamaha(){
        if (mesinOn == true){
            if (kecepatan<=380 && kecepatan>=0){
               kecepatan -= 10;
               System.out.println("Kecepatan Mesin anda sekarang : " + kecepatan);
            } else {
                System.out.println("Kecepatan Minimum 0");
            }    
        } else {
        }
    }
    public void kurangiKecepatanSuzuki(){
        if (mesinOn == true){
            if (kecepatan<=380 && kecepatan>=0){
               kecepatan -= 15;
               System.out.println("Kecepatan Mesin anda sekarang : " + kecepatan);
            } else {
                System.out.println("Kecepatan Minimum 0");
            }    
        } else {
        }
    }
    public void kurangiKecepatanDugati(){
        if (mesinOn == true){
            if (kecepatan<=380 && kecepatan>=0){
               kecepatan -= 30;
               System.out.println("Kecepatan Mesin anda sekarang : " + kecepatan);
            } else {
                System.out.println("Kecepatan Minimum 0");
            }    
        } else {
        }
    }
    public void printStatus() {
        if(mesinOn == true) 
            System.out.println("Mesin udah On");
        else
            System.out.println("Sepeda Motor tidak dapat melakukan penambahan / pengurangan kecepatan");
    }
}