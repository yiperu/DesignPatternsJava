/**
 * Created by yiperu on 7/22/17.
 */
public class ComponentesAzules implements Componentes {

    public ComponentesAzules(){

    }

    @Override
    public Boton getBoton() {
        return new BotonAzul();
    }

    @Override
    public Lista getLista() {
        return new ListaAzul();
    }
}
