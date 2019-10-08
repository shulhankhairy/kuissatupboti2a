package KUIS1PBO;

public class Mesin {
    private String jenis;
    private int kecepatan = 0;
    private int cekKecepatan = kecepatan;
    private boolean mesin = false;

    public Mesin(String jenis) {
        this.jenis = jenis;
    }
    
    public void hidupkanMesin(){
        this.mesin = true;
    }
    
    public void matikanMesin(){
        this.mesin = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if(mesin){
            if(jenis.equalsIgnoreCase("Honda")){
                if((cekKecepatan += 10) >= 380){
                    System.out.println("Anda telah mencapai kecepatan maksimum 380 Km/jam");
                    kecepatan = 380;
                } else {
                    kecepatan += 10;
                }
            } else if(jenis.equalsIgnoreCase("Yamaha")){
                if((cekKecepatan += 15) >= 380){
                    System.out.println("Anda telah mencapai kecepatan maksimum 380 Km/jam");
                    kecepatan = 380;
                } else {
                    kecepatan += 15;
                }
            } else if(jenis.equalsIgnoreCase("Suzuki")){
                if((cekKecepatan += 25) >= 200){
                    System.out.println("Anda telah mencapai kecepatan maksimum 200 Km/jam");
                    kecepatan = 200;
                } else {
                    kecepatan += 25;
                }
            } else if(jenis.equalsIgnoreCase("Ducati")){
                if((cekKecepatan += 50) >= 380){
                    System.out.println("Anda telah mencapai kecepatan maksimum 380 Km/jam");
                } else {
                    kecepatan += 50;
                }
            }
        } else {
            System.out.println("Mesin dalam kondisi mati!");
        }
    }
    
    public void kurangKecepatan(){
        if(mesin){
            if(jenis.equalsIgnoreCase("Honda")){
                if((cekKecepatan -= 5) <= 0){
                    System.out.println("Anda telah mencapai kecepatan minimum 0 Km/jam");
                    kecepatan = 0;
                }
                kecepatan -= 5;
            } else if(jenis.equalsIgnoreCase("Yamaha")){
                if((cekKecepatan -= 10) <= 0){
                    System.out.println("Anda telah mencapai kecepatan minimum 0 Km/jam");
                    kecepatan = 0;
                }
                kecepatan -= 10;
            } else if(jenis.equalsIgnoreCase("Suzuki")){
                if((cekKecepatan -= 15) <= 0){
                    System.out.println("Anda telah mencapai kecepatan minimum 0 Km/jam");
                    kecepatan = 0;
                }
                kecepatan -= 15;
            } else if(jenis.equalsIgnoreCase("Ducati")){
                if((cekKecepatan += 30) <= 0){
                    System.out.println("Anda telah mencapai kecepatan minimum 0 Km/jam");
                    kecepatan = 0;
                } else {
                    kecepatan -= 30;
                }
            }
        } else {
            System.out.println("Mesin dalam kondisi mati!");
        } 
    }
    
    public void infoMesin(){
        System.out.println("Jenis Mesin\t: " + jenis);
        System.out.print("Kondisi Mesin\t: ");
        if(mesin)
            System.out.println("Hidup");
        else
            System.out.println("Mati");
        System.out.println("Kecepatan\t: " + kecepatan);
    }
}