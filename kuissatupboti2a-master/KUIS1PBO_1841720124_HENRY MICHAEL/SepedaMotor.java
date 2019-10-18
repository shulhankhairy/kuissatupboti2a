package Quis;

public class SepedaMotor {
    private Mesin mesin;
    private String merekMotor;

    public SepedaMotor() {
    }

    public SepedaMotor(Mesin mesin, String merekMotor) {
        this.mesin = mesin;
        this.merekMotor = merekMotor;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public String getMerekMotor() {
        return merekMotor;
    }

    public void setMerekMotor(String merekMotor) {
        this.merekMotor = merekMotor;
    }
    
    public void tambahKecepatanMotor(){
        this.mesin.tambahKecepatan();
    }
    
    public void kurangKecepatanMotor(){
        this.mesin.kurangKecepatan();
    }
    
    public void nyalakanMesin(){
        this.mesin.nyalakanMesin();
    }

    public void matikanMesin(){
        this.mesin.matikanMesin();
    }

    public void tampilSepeda(){
        System.out.println("Merek Motor : " + merekMotor);
        this.mesin.tampilMesin();
    }
}