package builder.factoryMethod;

import builder.factoryMethod.bean.PC;
import builder.factoryMethod.bean.Server;

/**
 * Created by Kuma on 16/01/2017.
 *
 * Factory Class:
 * Una vez que tenemos la SuperClase y las SubClases listas,
 * podemos escribir nuestra Clase Factory.
 * Aquí está la implemtanción básica.
 */
public class ComputerFactory {
    public static final String PC = "PC";
    public static final String SERVER = "SERVER";

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if (PC.equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        } else if (SERVER.equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }

        return null;
    }

}