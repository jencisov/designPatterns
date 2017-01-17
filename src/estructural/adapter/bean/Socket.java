package estructural.adapter.bean;

/**
 * Created by Kuma on 17/01/2017.
 */
public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }

}