package builder.singleton.instantiation;

/**
 * Created by Kuma on 16/01/2017.
 * <p>
 * La Inicicialización Floja crea la instancia en un método de acceso global.
 * <p>
 * La implementación que aquí se presenta trabaja bien en casos en los que
 * se trabaje con un solo hilo; pero cuando se trate de trabajar con
 * multiples hilos pueden existir problemas que destruyan el patrón Singleton
 * si estos entran dentro del if más de una vez.
 */
public class LazyInitializatiedSingleton {
    private static LazyInitializatiedSingleton instance;

    private LazyInitializatiedSingleton() {
    }

    public static LazyInitializatiedSingleton getInstance() {
        if (instance == null)
            instance = new LazyInitializatiedSingleton();
        return instance;
    }

}