package builder.abstractFactory;

import builder.abstractFactory.abstractFactory.ComputerFactory;
import builder.abstractFactory.factory.PCFactory;
import builder.abstractFactory.factory.ServerFactory;

/**
 * Created by Kuma on 16/01/2017.
 */
public class TestAbstractFactoryPattern {

    public static void main(String... args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("4Gb", "500Gb", "AMD Phenom ii x4"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("128Gb", "32Pb", "Intel xeon"));

        System.out.println("Abstract factory PC Config: " + pc);
        System.out.println("Abstract factory Server Config: " + server);
    }

}