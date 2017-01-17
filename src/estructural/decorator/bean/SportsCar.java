package estructural.decorator.bean;

import estructural.decorator.decorator.Car;
import estructural.decorator.decorator.CarDecorator;

/**
 * Created by Kuma on 17/01/2017.
 */
public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.println("Adding features of sports car");
    }

}