package builder.abstractFactory.factory;

import builder.abstractFactory.bean.Computer;
import builder.abstractFactory.bean.PC;
import builder.abstractFactory.abstractFactory.ComputerAbstractFactory;

/**
 * Created by Kuma on 16/01/2017.
 *
 * Notar que createComputer() devuelve una instancia de la SúperClase Computer.
 * Ahora nuestras clases Factory implementar[an esta interface y retornarán
 * las respectivas SubClases
 */
public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }

}