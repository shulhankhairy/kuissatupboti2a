package Kuis1;
public class SepedaMotor extends Mesin{
    String merekMotor;
    Mesin mesin;

    public SepedaMotor() {
    }

    public SepedaMotor(String merekMotor, Mesin mesin) {
        this.merekMotor = merekMotor;
        this.mesin = mesin;
    }

    public String getMerekMotor() {
        return merekMotor;
    }

    public void setMerekMotor(String merekMotor) {
        this.merekMotor = merekMotor;
    }
    
    public void tampilData(){
        System.out.println("======================");
        System.out.println("Merk : "+merekMotor);
        super.printStatus();
    }
} 


