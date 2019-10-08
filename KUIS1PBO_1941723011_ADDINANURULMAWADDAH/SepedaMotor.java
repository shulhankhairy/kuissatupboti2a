package quiz1;


public class SepedaMotor {
    private String jenis;
    private boolean kontakOn = false;
    private Mesin msn;

    public SepedaMotor() {
    }

    public SepedaMotor(String jenis, Mesin msn) {
        this.jenis = jenis;
        this.msn = msn;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Mesin getMsn() {
        return msn;
    }

    public void setMsn(Mesin msn) {
        this.msn = msn;
    }
    
    public void nyalakanMotor(){
        kontakOn= true;
    }
    
    public void info(){
        System.out.println("Jenis Motor = " + jenis);
        msn.info();
    }
}
