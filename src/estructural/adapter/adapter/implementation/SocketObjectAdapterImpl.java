package estructural.adapter.adapter.implementation;

import estructural.adapter.adapter.SocketAdapter;
import estructural.adapter.bean.Socket;
import estructural.adapter.bean.Volt;

/**
 * Created by Kuma on 17/01/2017.
 * <p>
 * Esta implementación usa la Composición de Java y el Adapter contiene
 * el objeto fuente.
 */
public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 40);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }

}