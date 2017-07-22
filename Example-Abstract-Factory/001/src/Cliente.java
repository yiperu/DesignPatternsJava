/**
 * Created by yiperu on 7/22/17.
 */
public class Cliente {

    public Cliente(Componentes style){
        Boton boton = style.getBoton();
        boton.dibujar();
        Lista lista = style.getLista();
        lista.dibujar();
    }
}
