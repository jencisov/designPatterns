package builder.singleton.instantiation;

/**
 * Created by Kuma on 16/01/2017.
 *
 * La inicialización Impaciente de la clase Singleton es creada en tiempo de ejecución.
 * Esta es la más sencilla manera de crear una clase Singleton, pero tiene la
 * desventaja de que la instancia es creada incluso cuando la aplicación no la use.
 * <p>
 * Si tu clase Singleton no usa muchos recursos, esta es la mejor opción.
 * Pero en la mayoría de los escenarios, las clases Singleton son creadas
 * para recursos como Sistema de Archivos o Conexión con Base de Datos y
 * se debería evitar su instancia a menos que el cliente llame al método
 * getInstance().
 * Además, esta manera no provee ninguna opción de manejo de Excepciones
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

}