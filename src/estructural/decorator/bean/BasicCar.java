package estructural.decorator.bean;

import estructural.decorator.decorator.Car;

/**
 * Created by Kuma on 17/01/2017.
 * <p>
 * The basic implementation of the component Interface. Podemos tener
 * la clase BasicCar como la implementación de nuestro Componente.
 */
public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("This is a basic car");
    }

}