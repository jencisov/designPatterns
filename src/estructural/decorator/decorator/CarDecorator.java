package estructural.decorator.decorator;

/**
 * Created by Kuma on 17/01/2017.
 * <p>
 * La clase Decorator implementa el componente Interface.
 * <p>
 * The component variable should be accessible to the child
 * decorator, so we will make it protected.
 */
public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}