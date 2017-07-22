/**
 * Created by yiperu on 7/22/17.
 */
public class ConstructorCocheFull extends BuilderCoche {

    public ConstructorCocheFull() {
    }

    @Override
    public void construirMotor() {
        this.coche.setMotor("Motor de potencia alta");
    }

    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria("Carroceria de alta proteccion");
    }

    @Override
    public void construirAireAcondicionado() {
        this.coche.setAirAcond(true);
    }

    @Override
    public void construirElevadorLunas() {
        this.coche.setElevaLunaElec(true);
    }
}
