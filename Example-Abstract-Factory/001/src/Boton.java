/**
 * Created by yiperu on 7/22/17.
 */
public abstract class Boton {
    private String texto;
    // - - - - - - -

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void dibujar(){
        System.out.println("Dibujando el Boton . . . . .");
    }
    // = = = = =
    // Metodo a implementar por las clases que hereden
    public abstract void configurar();
}
