import java.util.ArrayList;

/**
 * Created by yiperu on 7/22/17.
 */
public abstract class Lista {

    private ArrayList<String> elementos = new ArrayList<>();

    public String getElemento(int position) {
        return elementos.get(position);
    }

    public void inesrtarElemento(String texto) {
        this.elementos.add(texto);
    }

    // - - - -
    public void dibujar(){
        System.out.println("Dibujando la Lista");
    }

    // - - - - -
    public abstract void configurar();
}
