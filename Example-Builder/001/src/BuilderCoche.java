/**
 * Created by yiperu on 7/22/17.
 */
public abstract class BuilderCoche {
    protected Coche coche;

    // - - - -

    public Coche getCoche() {
        return this.coche;
    }

    public void crearNodeCoche() {
        this.coche = new Coche();
    }

    // - - - -  Abstrac methods

    public abstract void construirMotor();
    public abstract void construirCarroceria();
    public abstract void construirAireAcondicionado();
    public abstract void construirElevadorLunas();
}
