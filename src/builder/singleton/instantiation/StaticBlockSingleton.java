package builder.singleton.instantiation;

/**
 * Created by Kuma on 16/01/2017.
 * <p>
 * La inicialización de Bloque Estático es similar a la Inicialización Impaciente,
 * excepto que la instancia de la clase es creada en un bloque estático que provee
 * la opción de manejo de Excepciones
 *
 * Ambas inicializaciones: Impaciente y de Bloque estático (Eager StaticBlock)
 * crean la instancia antes de que esta sea usada y esa no es la mejor práctica.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Runtime exception");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}