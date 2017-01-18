package behavior.observer;

/**
 * Created by Kuma on 18/01/2017.
 *
 * Se crea un contrato para el Observer.
 * Se hace un método para adherir el Subject al Observer
 * y otro método que usará el Subject para notificar cambios
 */
public interface Observer {

    //Método para actualizar el Observer, usado por Subject
    public void update();

    //Adherir Subject para observar
    public void setSubject(Subject subject);

}