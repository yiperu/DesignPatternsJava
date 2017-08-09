/**
 * Created by yiperu on 8/8/17.
 */
public abstract class DecoradorDesplazamiento implements  IVentana{

    protected IVentana v;

    public DecoradorDesplazamiento(IVentana v) {
        this.setV(v);
    }

    public IVentana getV() {
        return v;
    }

    public void setV(IVentana v) {
        this.v = v;
    }

    @Override
    public void dibujar(int columna, int fila) {
        this.getV().dibujar(columna, fila);
    }
}
