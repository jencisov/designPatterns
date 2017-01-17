package builder.factoryMethod;

/**
 * Created by Kuma on 16/01/2017.
 */
public class TestFactory {

    public static void main(String... args) {
        Computer pc = ComputerFactory.getComputer(ComputerFactory.PC, "4Gb", "500Gb", "AMD Phenom II x4");
        Computer server = ComputerFactory.getComputer(ComputerFactory.SERVER, "128Gb", "24Tb", "Intel Xeon");

        System.out.println("Factory PC Config: " + pc);
        System.out.println("Factory Server Config: " + server);
    }

}