package KUIS1PBO;

public class SepedaMotor {
    Mesin mesin;
    private String pemilik;

    public SepedaMotor(String pemilik) {
        this.pemilik = pemilik;
    }

    public SepedaMotor() {
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String merk) {
        this.pemilik = merk;
    }
    
    public void hidupkanMesin(){
        this.mesin.hidupkanMesin();
    }
    
    public void matikanMesin(){
        this.mesin.matikanMesin();
    }
    
    public void tambahKecepatan(){
        this.mesin.tambahKecepatan();
    }
    
    public void kurangKecepatan(){
        this.mesin.kurangKecepatan();
    }
    
    public void info(){
        System.out.println("Pemilik \t: " + pemilik);
        this.mesin.infoMesin();
        System.out.println("=========================");
    }
}