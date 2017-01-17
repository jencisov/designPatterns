package builder.singleton.instantiation;

/**
 * Created by Kuma on 16/01/2017.
 * <p>
 * La manera más sencilla de crear un Singleton con Seguridad en Hilos es hacer
 * el método global de acceso SYNCHRONIZED, de modo que solo un hilo puede
 * ejectuar este método a la vez.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    /**
     * Esta implementación funciona bien pero reduce el desempeño por el costo asociado
     * con el método synchronized. Para evitar esto, el principio DOUBLE CHECKED LOCKING
     * debe ser usado.
     */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null)
            instance = new ThreadSafeSingleton();
        return instance;
    }

    /**
     * En este enfoque, el bloque SYNCHRONIZED es usado dentro de la condición IF con un check
     * adicional para asegurarse de que solo una instancia de la clase Singleton está creada.
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }



}