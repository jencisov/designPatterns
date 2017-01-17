package estructural.adapter.adapter;

import estructural.adapter.bean.Volt;

/**
 * Created by Kuma on 17/01/2017.
 * <p>
 * Queremos construir un Adapter que pueda producir 3 voltios, 12 voltios
 * y por defecto 120 voltios.
 * Primero creamos una interface Adapter con esos métodos.
 */
public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();

}