package builder.abstractFactory.factory;

import builder.abstractFactory.abstractFactory.ComputerAbstractFactory;
import builder.abstractFactory.bean.Computer;
import builder.abstractFactory.bean.Laptop;

/**
 * Created by Kuma on 17/01/2017.
 * <p>
 * Notar que createComputer() devuelve una instancia de la SúperClase Computer.
 * Ahora nuestras clases Factory implementar[an esta interface y retornarán
 * las respectivas SubClases
 */
public class LaptopFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public LaptopFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Laptop(ram, hdd, cpu);
    }

}