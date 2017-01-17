package builder.factoryMethod;

/*
 * Created by Kuma on 16/01/2017.
 *
 * Factory Method (Fábrica):
 * Se usa cuando tenemos una SúperClase con multiples SubClases.
 * Este patrón toma la responsabilidad de la instanciación de
 * una clase desde el Cliente hacia la clase Factory
 *
 * SuperClase:
 * La SuperClase en el patrón Factory puede ser una Interface,
 * una Clase Abstracta o una clase Java normal.
 * Para este ejemplo tenemos una SuperClase como una clase abstracta
 * con el método toString() sobreescrito con propósito de Test
 */
public abstract class Computer {

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM: " + this.getRAM() + ", HDD: " + this.getHDD() + " , CPU: " + this.getCPU();
    }

}