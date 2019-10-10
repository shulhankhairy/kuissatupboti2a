package Kuis;


public class SepedaMotor {
    private String merk;
    private Mesin mesin;

    public SepedaMotor(String merk, Mesin mesin) {
        this.merk = merk;
        this.mesin = mesin;
    }

    public SepedaMotor() {
    }
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }
    
    public void info(){
        System.out.println("Merk Sepeda = "+merk);
    }
}
