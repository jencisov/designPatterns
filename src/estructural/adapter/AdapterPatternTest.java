package estructural.adapter;

import estructural.adapter.adapter.SocketAdapter;
import estructural.adapter.adapter.implementation.SocketClassAdapterImpl;
import estructural.adapter.adapter.implementation.SocketObjectAdapterImpl;
import estructural.adapter.bean.Volt;

/**
 * Created by Kuma on 17/01/2017.
 * <p>
 * El patron Adapter es usado para que dos Interfaces no relacionadas
 * puedan trabajar juntas.
 * <p>
 * El Objeto que une dos interfaces no relacionadas se llama Adapter.
 * <p>
 * En este ejemplo se usara un adaptador de energia, porque una bateria necesita 3 voltios
 * para cargarse, pero en USA, el socket produce 120v y en Perú 240v
 */
public class AdapterPatternTest {

    public static void main(String... args) {
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println("v3 volts using Class Adapter: " + v3.getVolts());
        System.out.println("v12 volts using Class Adapter: " + v12.getVolts());
        System.out.println("v120 volts using Class Adapter: " + v120.getVolts());
    }

    private static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println("v3 volts using Class Adapter: " + v3.getVolts());
        System.out.println("v12 volts using Class Adapter: " + v12.getVolts());
        System.out.println("v120 volts using Class Adapter: " + v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 3:
                return socketAdapter.get3Volt();
            case 12:
                return socketAdapter.get12Volt();
            case 120:
                return socketAdapter.get120Volt();
            default:
                return socketAdapter.get120Volt();
        }
    }

}

/**
 * El patrón Adapter se usa en:
 * Arrays.asList()
 * InputStreamReader (retorna un Reader)
 * OutputStreamWriter (retorna un Writer)
 */