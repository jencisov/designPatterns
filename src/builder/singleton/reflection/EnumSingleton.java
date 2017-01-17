package builder.singleton.reflection;

/**
 * Created by Kuma on 16/01/2017.
 *
 * Para evitar que el Singleton sea destruido por medio de la reflección,
 * Joshua Bloch sugiere el uso de Enum para implementar el patrón Singleton,
 * puesto que Java se asegura de que cualquier valor enum sea instanciado
 * solo una vez en un programa Java. Una desventaja es que el enum es muy
 * poco flexible. Por ejemplo, la inicialización floja es imposible.
 */
public enum EnumSingleton {
    INSTANCE;

    public static void doSomething(){
        //do something
    }

}