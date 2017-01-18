package behavior.observer;

/**
 * Created by Kuma on 18/01/2017.
 *
 * Contiene una lista de Observers para notificar
 * cualquier cambio en su estado.
 */
public interface Subject {

    //methods to register and unregister observers
    public void register(Observer observer);

    public void unregister(Observer observer);

    //method to notify observers of change
    public void notifyObservers();

    //method to get updates from subject
    public Object getUpdate(Observer observer);

}