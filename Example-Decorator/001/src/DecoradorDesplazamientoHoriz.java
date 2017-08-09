/**
 * Created by yiperu on 8/8/17.
 */
public class DecoradorDesplazamientoHoriz extends DecoradorDesplazamiento{

    public DecoradorDesplazamientoHoriz(IVentana v) {
        super(v);
    }

    // - -  - - - -


    @Override
    public void dibujar(int columna, int fila) {

        // Dibujar la Ventna
        super.dibujar(columna, fila);

        // Agregar barra de desplazamiento
        this.dibujarBarraDespHorizontal();
    }

    private void dibujarBarraDespHorizontal(){

        System.out.println("Agregar barra de desplazamiento Horizontal...");
    }
}
