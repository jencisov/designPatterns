package builder.abstractFactory;

/**
 * Created by Kuma on 16/01/2017.
 *
 * Abstract Factory se deshace de los bloques if-else y tiene una clase Factory
 * para cada SubClase y luego una clase Abstract Factory que retorna la SubClase
 * basada en la clase Abstract Factroy ingresada.
 */
public abstract class Computer {
    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM = " + this.getRAM() + " HDD = " + this.getHDD() + " CPU = " + this.getCPU();
    }

}