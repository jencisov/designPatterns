package builder.abstractFactory.abstractFactory;

import builder.abstractFactory.bean.Computer;

/**
 * Created by Kuma on 16/01/2017.
 *
 * getComputer acepta ComputerAbstractFactory como argumento y retorna
 * el objeto Computer.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }

}