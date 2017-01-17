package estructural.decorator.bean;

import estructural.decorator.decorator.Car;
import estructural.decorator.decorator.CarDecorator;

/**
 * Created by Kuma on 17/01/2017.
 */
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of luxury car");
    }

}