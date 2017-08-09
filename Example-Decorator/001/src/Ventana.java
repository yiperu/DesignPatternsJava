/**
 * Created by yiperu on 8/8/17.
 */
public class Ventana implements IVentana {

    public Ventana() {
    }

    @Override
    public void dibujar(int columna, int fila) {
        System.out.println("Dibujada Ventana Basica [" + columna + "], [" + fila +"]");
    }
}
