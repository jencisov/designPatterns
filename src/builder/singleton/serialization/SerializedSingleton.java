package builder.singleton.serialization;

import java.io.Serializable;

/**
 * Created by Kuma on 16/01/2017.
 * <p>
 * A veces, en sistemas distribuidos, necesitamos implementar la interfaz Serializable
 * en la clase Singleton de modo que podamos guardar su estado en un archivo del sistema
 * y recuperarlo más adelante.
 */
public class SerializedSingleton implements Serializable {

    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SerializedSingleton.SingletonHelper.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

}