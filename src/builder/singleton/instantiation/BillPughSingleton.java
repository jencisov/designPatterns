package builder.singleton.instantiation;

/**
 * Created by Kuma on 16/01/2017.
 * <p>
 * En Java 5, el modelo de memoria de Java tenía muchos problemas y los enfoques
 * Eager, Lazy, StaticBlock y ThreadSafe solían fallar en ciertos escenarios
 * donde varios hilos intentan obtener la instancia de la clase Singleton a la vez.
 * Entonces Bill Pugh apareció con un enfoque diferente para crear la clase Singleton
 * usando una INNER STATIC HELPER CLASS.
 */
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    /**
     * La clase PRIVATE INNER STATIC que contiene la instancia de la clase Singleton.
     * Cuando la clase Singleton es cargada, SingletonHelper no es cargada en la memoria
     * y solo cuando alguien llama al método getInstance esta clase se carga y se crea la
     * instancia de la clase Singleton
     * <p>
     * Este es el enfoque más usado de clases Singleton puesto que no requiere de sincronización.
     */
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

}