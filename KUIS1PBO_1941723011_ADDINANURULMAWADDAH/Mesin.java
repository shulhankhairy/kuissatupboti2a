package quiz1;

public class Mesin {
    private String jenis;
    private int kecepatan= 0;
    private int maksimum = 380;
    private boolean mesin = false;

    public Mesin() {
    }

    public Mesin(String merk) {
        this.jenis = merk;
    }

    public String getMerk() {
        return jenis;
    }

    public void setMerk(String merk) {
        this.jenis = merk;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getMaksimum() {
        return maksimum;
    }

    public void setMaksimum(int maksimum) {
        this.maksimum = maksimum;
    }

    public boolean isMesin() {
        return mesin;
    }

    public void setMesin(boolean mesin) {
        this.mesin = mesin;
    }
    
    public void nyalakanMesin(){
        mesin = true;
    }
    
    public void matikanMesin(){
        mesin = false;
        kecepatan= 0;
        
    }
    
    public void tambahKecepatan(){
        if(this.jenis == "Yamaha"){
            kecepatan += 15;
        }else if(this.jenis == "Honda"){
            kecepatan += 10;
        }else if(this.jenis == "Suzuki"){
            kecepatan += 25;
        }else if(this.jenis == "Ducati"){
            kecepatan += 50;
        }
    }
    
    public void kurangiKecepatan(){
        if(mesin == true){
            if(this.jenis == "Yamaha"){
                kecepatan -= 10;
            }else if(this.jenis == "Honda"){
                kecepatan -= 5;
            }else if(this.jenis == "Suzuki"){
                kecepatan -= 15;
            }else if(this.jenis == "Ducati"){
                kecepatan -= 30;
            }
        }else{
            System.out.println("Kecepatan tidak bisa berkurang");
        }
    }
    
    public void info() {
        System.out.printf("Jenis = %s\n", jenis);
        if (mesin == true){
            System.out.println("Mesin Nyala");
        }else {
            System.out.println("Mesin Mati");
        }
        System.out.println("Kecepatan " + kecepatan+ "\n");
    }
    
}
