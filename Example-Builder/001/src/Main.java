/**
 * Created by yiperu on 7/22/17.
 */
public class Main {

    public static void main(String[] args){

        // Crear el objeto Director
        Director objFabrica = new Director();

        // Crear los objetos Concrete Builder
        BuilderCoche base = new ConstructorCocheBase();
        BuilderCoche medio = new ConstructorCocheMedio();
        BuilderCoche full = new ConstructorCocheFull();

        // Construir un coche con equipamiento base
        objFabrica.construir(base);
        Coche cocheBase = base.getCoche();

        // Construir un coche con equipamiento medio
        objFabrica.construir(medio);
        Coche cocheMedio = medio.getCoche();

        // Construir un coche con equipamiento full
        objFabrica.construir(full);
        Coche cocheFull = full.getCoche();

        // Mostrar la informacion de cada coche creado
        mostrarCaracteristicas(cocheBase);
        mostrarCaracteristicas(cocheMedio);
        mostrarCaracteristicas(cocheFull);
    }

    // - - - - --
    public static void mostrarCaracteristicas(Coche coche){
        System.out.println("Motor: " + coche.getMotor());
        System.out.println("Carroceria: " + coche.getCarroceria());
        System.out.println("Elevalunas electrico: " + coche.getElevaLunaElec());
        System.out.println("Aire acondicionado: " + coche.getAirAcond());

        System.out.println("= = == = = = = = =");
    }
}
