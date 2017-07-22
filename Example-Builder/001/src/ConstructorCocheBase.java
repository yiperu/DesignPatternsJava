/**
 * Created by yiperu on 7/22/17.
 */
public class ConstructorCocheBase extends BuilderCoche {
    public ConstructorCocheBase() {
    }
// - - - -
    @Override
    public void construirMotor() {
        this.coche.setMotor("Motor de potencia minima");
    }

    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria("Carroceria de baja proteccion");
    }

    @Override
    public void construirAireAcondicionado() {
        this.coche.setAirAcond(false);
    }

    @Override
    public void construirElevadorLunas() {
        this.coche.setElevaLunaElec(false);
    }
}
