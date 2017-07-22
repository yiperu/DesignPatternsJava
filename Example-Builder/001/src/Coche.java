/**
 * Created by yiperu on 7/22/17.
 */
public class Coche {

    private String motor = "";
    private String carroceria = "";
    private Boolean elevaLunaElec = false;
    private Boolean airAcond = false;

    public Coche(){

    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public Boolean getElevaLunaElec() {
        return elevaLunaElec;
    }

    public void setElevaLunaElec(Boolean elevaLunaElec) {
        this.elevaLunaElec = elevaLunaElec;
    }

    public Boolean getAirAcond() {
        return airAcond;
    }

    public void setAirAcond(Boolean airAcond) {
        this.airAcond = airAcond;
    }
}
