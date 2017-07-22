/**
 * Created by yiperu on 7/22/17.
 */
public class ComponentesRojos implements Componentes {

    public ComponentesRojos(){

    }

    @Override
    public Boton getBoton() {
        return new BotonRojo();
    }

    @Override
    public Lista getLista() {
        return new ListaRoja();
    }
}
