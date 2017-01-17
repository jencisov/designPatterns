package builder.builder;

/**
 * Created by Kuma on 17/01/2017.
 * <p>
 * Notar que la clase Computer tiene solo métodos getter y no un
 * constructor público, de modo que la única manera de obtener un
 * objeto Computer es a través de la clase ComputerBuilder.
 */
public class TestBuilderPattern {

    public static void main(String... args) {
        Computer computer = new Computer
                .ComputerBuilder("500Gb", "2Gb")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(computer);
    }

}

/**
 * El patrón Builder se usa en:
 * StringBuilder.append()
 * StringBuffer.append()
 * OutputStreamWriter (retorna un Writer)
 */