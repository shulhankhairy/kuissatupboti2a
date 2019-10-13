
package kuis1;

public class Mesin {
    private String jenis;
    private int kecepatan =0;
    private boolean kontakOn=false;

    public Mesin() {
    }
    
    public Mesin(String jenis) {
        this.jenis = jenis;
    }
    
    public void nyalakanMesin(){
        kontakOn=true;
    }
    
    public void matikanMesin(){
        kontakOn=false;
        kecepatan=0;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public void tambahKecepatan(){
        if(jenis.equalsIgnoreCase("Honda")){
            if(kontakOn==true){
                kecepatan +=10;
            }
            else{
                kecepatan=0;
            }
        }
        else if(jenis.equalsIgnoreCase("Yamaha")){
            if(kontakOn==true){
                kecepatan +=15;
            }
            else{
                kecepatan=0;
            }
        }
        else if(jenis.equalsIgnoreCase("Suzuki")){
            if(kontakOn==true){
                kecepatan +=25;
            }
            else{
                kecepatan=0;
            }
        }
        else if(jenis.equalsIgnoreCase("Ducati")){
            if(kontakOn==true){
                kecepatan +=50;
            }
            else{
                kecepatan=0;
            }
        }
        else{
            System.out.println("Jenis tidak tersedia");
        }
    }
    
    public void kurangiKecepatan(){
        if(jenis.equalsIgnoreCase("Honda")){
            if(kontakOn==true){
                kecepatan -=5;
            }
            else{
                kecepatan=0;
            }
        }
        else if(jenis.equalsIgnoreCase("Yamaha")){
            if(kontakOn==true){
                kecepatan -=10;
            }
            else{
                kecepatan=0;
            }
        }
        else if(jenis.equalsIgnoreCase("Suzuki")){
            if(kontakOn==true){
                kecepatan -=15;
            }
            else{
                kecepatan=0;
            }
        }
        else if(jenis.equalsIgnoreCase("Ducati")){
            if(kontakOn==true){
                kecepatan -=30;
            }
            else{
                kecepatan=0;
            }
        }
        else{
            System.out.println("Jenis tidak tersedia");
        }
    }
    
    public void printStatus(){
        System.out.println("Jenis Mesin : "+this.jenis);
        if(kontakOn == true){
            System.out.println("Kontak ON");
        }
        else{
            System.out.println("Kontak OFF");
        }
        
        if(jenis.equalsIgnoreCase("Suzuki")){
            if(kecepatan>200){
                System.out.println("Kecepatan Maks");
                kecepatan=200;
                System.out.println("Kecepatan "+kecepatan);
            }
            else if(kecepatan<0){
                System.out.println("Kecepatan Minimal");
                kecepatan=0;
                System.out.println("Kecepatan "+kecepatan);
            }
            else{
                System.out.println("Kecepatan "+kecepatan);
            }
        }
        else{
            if(kecepatan>380){
                System.out.println("Kecepatan Maks");
                kecepatan=380;
                System.out.println("Kecepatan "+kecepatan);
            }
            else if(kecepatan<0){
                System.out.println("Kecepatan Minimal");
                kecepatan=0;
                System.out.println("Kecepatan "+kecepatan);
            }
            else{
                System.out.println("Kecepatan "+kecepatan);
            }
        }
    }   
}
