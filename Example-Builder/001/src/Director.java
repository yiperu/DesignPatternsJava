/**
 * Created by yiperu on 7/22/17.
 */
public class Director {

    public Director() {

    }

    public void construir(BuilderCoche builder){

        builder.crearNodeCoche();

        builder.construirMotor();
        builder.construirCarroceria();
        builder.construirElevadorLunas();
        builder.construirAireAcondicionado();
    }
}
