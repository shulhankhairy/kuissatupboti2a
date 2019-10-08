package quizpraktikumpbo;

/**
 *
 * @author asus
 */
public class SepedaMotor {
    public String jenis;
    Mesin mesin;

    public SepedaMotor() {
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public Mesin getMesin() {
        return mesin;
    }
    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }
    public void print() {
        System.out.println("Jenis Motor : " + jenis);
    }
}