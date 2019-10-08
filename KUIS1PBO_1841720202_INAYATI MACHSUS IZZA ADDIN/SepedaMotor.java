
package kuis1;

public class SepedaMotor {
    private String merk;
    private Mesin mesin;

    public SepedaMotor() {
    }

    public SepedaMotor(String merk, Mesin mesin) {
        this.merk = merk;
        this.mesin = mesin;
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
    
    public void printData(){
        System.out.println("Sepeda Motor "+merk);
        mesin.printStatus();
        System.out.println("\n");
    }
}
