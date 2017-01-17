package builder.builder;

/**
 * Created by Kuma on 17/01/2017.
 * <p>
 * Este patrón existe para resolver algunos problemas con Factory y Abstract Factory
 * cuando el objeto contiene muchos atributos.
 * 1-Muchos argumentos para pasar del cliente a la clase Factory
 * 2-Algunos de los parametros pueden ser opcionales, pero en el patron Factory nos
 * vemos forzados a enviarlos todos
 * 3-Si el objeto es pesado y su creación es compleja, toda la complejidad será
 * parte de la clase Factory y se hace confuso.
 */
public class Computer {
    //required parameters
    private String HDD;
    private String RAM;
    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "RAM: " + this.RAM + " HDD: " + this.HDD + " graphicsCard: "
                + this.isGraphicsCardEnabled + " blueTooth: " + this.isBluetoothEnabled;
    }

    /**
     * 1-Se necesita crear una clase estática anidada y luego copiar
     * todos los argumentos de la clase externa a la clase Builder.
     * 2-La clase Builder debe tener un constructor publico con todos
     * los atributos obligatorios como parametros.
     * 3-La clase Builder debe tener métodos para setear los atributos opcionales.
     * 4-El paso final es proveer un método build() en la clase Builder, para que
     * retorne el objeto requerido.
     */
    //Clase Builder
    public static class ComputerBuilder {
        private String HDD;
        private String RAM;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

}