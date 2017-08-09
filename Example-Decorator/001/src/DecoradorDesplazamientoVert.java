/**
 * Created by yiperu on 8/8/17.
 */
public class DecoradorDesplazamientoVert extends DecoradorDesplazamiento {

    public DecoradorDesplazamientoVert(IVentana v) {
        super(v);
    }

    @Override
    public void dibujar(int columna, int fila) {
        super.dibujar(columna, fila);

        this.dibujarBarraDespVertical();
    }

    private void dibujarBarraDespVertical(){

        System.out.println("Agregar barra de desplazamiento Vertical..");
    }
}
