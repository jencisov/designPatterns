package behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kuma on 18/01/2017.
 */
public class MyTopic implements Subject {
    private List observerList;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null observer");
        synchronized (MUTEX) {
            if (!observerList.contains(observer)) observerList.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        synchronized (MUTEX) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        synchronized (MUTEX) {
            if (!changed)
                return;
            observersLocal = new ArrayList<>(this.observerList);
            this.changed = false;
        }
        for (Observer observer : observersLocal) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted to topic: " + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }

}