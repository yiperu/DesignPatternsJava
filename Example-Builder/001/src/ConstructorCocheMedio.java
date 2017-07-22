/**
 * Created by yiperu on 7/22/17.
 */
public class ConstructorCocheMedio extends BuilderCoche {
    public ConstructorCocheMedio() {
    }

    @Override
    public void construirMotor() {
       this.coche.setMotor("Motor potencia media");
    }

    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria("Carroceria de proteccion media");
    }

    @Override
    public void construirAireAcondicionado() {
        this.coche.setAirAcond(false);
    }

    @Override
    public void construirElevadorLunas() {
        this.coche.setElevaLunaElec(true);
    }
}
