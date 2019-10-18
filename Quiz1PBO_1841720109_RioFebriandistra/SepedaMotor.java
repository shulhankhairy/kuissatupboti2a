package kuis1;

/**
 *
 * @author RioFebrian
 */
public class SepedaMotor extends Mesin{
    public String merek;
    public String Warna;
    public Mesin m;
    
    public SepedaMotor(){
        
    }
    
    public SepedaMotor(String merek, String Warna, Mesin m) {
        this.merek = merek;
        this.Warna = Warna;
        this.m = m;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }
  
    public void printStatusMotor(){
        System.out.println("-----------Motorcycle-----------");
        System.out.println("Merek = "+merek);
        System.out.println("Warna = "+Warna);
        super.printStatus();
    }
}