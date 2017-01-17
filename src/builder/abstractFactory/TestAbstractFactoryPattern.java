package builder.abstractFactory;

import builder.abstractFactory.abstractFactory.ComputerFactory;
import builder.abstractFactory.bean.Computer;
import builder.abstractFactory.bean.Laptop;
import builder.abstractFactory.factory.LaptopFactory;
import builder.abstractFactory.factory.PCFactory;
import builder.abstractFactory.factory.ServerFactory;

/**
 * Created by Kuma on 16/01/2017.
 * <p>
 * Abstract Factory se deshace de los bloques if-else y tiene una clase Factory
 * para cada SubClase y luego una clase Abstract Factory que retorna la SubClase
 * basada en la clase Abstract Factroy ingresada.
 */
public class TestAbstractFactoryPattern {

    public static void main(String... args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("4Gb", "500Gb", "AMD Phenom ii x4"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("128Gb", "32Pb", "Intel xeon"));
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("4Gb", "500Gb", "Intel Core i3"));

        System.out.println("Abstract factory PC Config: " + pc);
        System.out.println("Abstract factory Server Config: " + server);
        System.out.println("Abstract factory Laptop Config: " + laptop);
    }

}

/**
 * Beneficios del patrón Abstract Factory:
 * <p>
 * Provee enfoque a codear Interfaces en lugar de implementaciones
 * <p>
 * Al ser una Fabrica de Fabricas, se le puede extender facilmente para acomodar
 * más productos como agregar una sub clase Laptop y una LaptopFactory
 * <p>
 * Es robusta y evita la lógica condicional del patron Factory Method
 */