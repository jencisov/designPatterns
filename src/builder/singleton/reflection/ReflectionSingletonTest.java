package builder.singleton.reflection;

import builder.singleton.instantiation.EagerInitializedSingleton;

import java.lang.reflect.Constructor;

/**
 * Created by Kuma on 16/01/2017.
 *
 * La reflección puede ser usada para destruir todos los enfoques de implementación
 * de Singletons.
 */
public class ReflectionSingletonTest {

    /**
     * Cuando se ejecute este método main(), notarás que el hashCode de ambas instancias no son las mismas.
     * Eso destruye el patrón Singleton. La reflección es muy poderosa y es usada en muchos frameworks
     * como Springs y Hibernate.
     */
    public static void main(String... args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = EagerInitializedSingleton.getInstance();

        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}