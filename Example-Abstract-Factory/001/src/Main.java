/**
 * Created by yiperu on 7/22/17.
 */
public class Main {

    public static void main(String[] args){
        // Se insertan los componentes con el borde azul
        Cliente cliente = new Cliente(new ComponentesAzules());
        System.out.println("---------------------------------------------");
        // Ahora se insertan los componentes con el boton rojo
        cliente = new Cliente(new ComponentesRojos());
    }
}
