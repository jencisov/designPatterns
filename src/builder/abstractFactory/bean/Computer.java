package builder.abstractFactory.bean;

/**
 * Created by Kuma on 16/01/2017.
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