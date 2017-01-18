package behavior.command.commands;

/**
 * Created by Kuma on 18/01/2017.
 * <p>
 * Se necesita crear implementaciones para los diferentes
 * tipos de acciones realizadas por el Receiver.
 * Ya que se tienen tres acciones, se crearán tres
 * implementaciones de Command y cada implementación
 * va a reenviar la Solicitud al método apropiado al receiver
 */
public interface Command {

    public void execute();

}