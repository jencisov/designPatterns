package estructural.decorator;

import estructural.decorator.bean.BasicCar;
import estructural.decorator.bean.LuxuryCar;
import estructural.decorator.bean.SportsCar;
import estructural.decorator.decorator.Car;

/**
 * Created by Kuma on 17/01/2017.
 * <p>
 * El patrón Decorator se usa para modificar la funcionalidad de un Objeto
 * en tiempo de ejecución. Al mismo tiempo, otras instancias de la misma
 * clase no se veran afectadas.
 */
public class DecoratorPatternTest {

    public static void main(String... args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println("\n*****\n");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}

/**
 * Puntos Importantes
 * <p>
 * El patron Decorator es de mucha ayuda al proveer modificación en tiempo
 * de ejecución. Es fácil de mantener y extender cuando las opciones son mayores.
 * <p>
 * La desventaja del patrón decorador es que usa muchas clases similares (Decorators)
 * <p>
 * El patrón Decorator es usado en varias clases IO de Java como FileReader y BufferedReader
 */