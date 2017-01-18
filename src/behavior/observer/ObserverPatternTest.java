package behavior.observer;

/**
 * Created by Kuma on 18/01/2017.
 *
 * El patrón Observer sirve cuando se está interesado
 * en el estado de un Objeto y se quiere ser notificado
 * cuando este sufra un cambio.
 *
 * El Objeto que será usado para ver el estado de otro
 * se llama Observer y el Objeto que es vigilado se
 * llama Subject.
 */
public class ObserverPatternTest {

    public static void main(String... args) {
        //Crear Subject
        MyTopic myTopic = new MyTopic();

        //Crear Observers
        Observer observer1 = new MyTopicSubscriber("Obs1");
        Observer observer2 = new MyTopicSubscriber("Obs2");
        Observer observer3 = new MyTopicSubscriber("Obs3");

        //Registrar Observers al Subject
        myTopic.register(observer1);
        myTopic.register(observer2);
        myTopic.register(observer3);

        //Adherir Observer al Subject
        observer1.setSubject(myTopic);
        observer2.setSubject(myTopic);
        observer3.setSubject(myTopic);

        //Revisar si alguna actualización está disponible
        observer1.update();

        //Ahora enviar un mensage al Subject
        myTopic.postMessage("New message");
    }

}