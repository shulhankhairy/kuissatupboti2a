package KUIS1PBO_1841720059_AlfanNoufalNasruddin;

/**
 *
 * @author Asus FX
 */
public class SepedaMotor {
    private String genreSepeda;
    private Mesin mesin;

    public SepedaMotor(){
        
    }
    
    public SepedaMotor(String genreSepeda, Mesin Mesin) {
        this.genreSepeda = genreSepeda;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public String getGenreSepeda() {
        return genreSepeda;
    }

    public void setGenreSepeda(String genreSepeda) {
        this.genreSepeda = genreSepeda;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void tampilkanData(){
        System.out.println("Jenis Sepeda          :"+genreSepeda); 
    } 
}
