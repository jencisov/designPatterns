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

/**
 * Beneficios del patrón Factory Method:
 * <p>
 * Provee enfoque a codear Interfaces en lugar de implementaciones
 * <p>
 * Quita la instanciación de la implementación de clases del código Cliente
 * haciéndo que sea más robusto, menos acoplado y fácil de extender
 * <p>
 * Provee de abstracción entre la implementación y las clases cliente a través
 * de la herencia
 */