package estructural.adapter.adapter.implementation;

import estructural.adapter.adapter.SocketAdapter;
import estructural.adapter.bean.Socket;
import estructural.adapter.bean.Volt;

/**
 * Created by Kuma on 17/01/2017.
 * <p>
 * Esta implementación usa la Herencia y extiende el objeto fuente,
 * en nuestro caso, la clase Socket
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = getVolt();
        return convertVolt(volt, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = getVolt();
        return convertVolt(volt, 40);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }

}