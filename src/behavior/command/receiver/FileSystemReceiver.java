package behavior.command.receiver;

/**
 * Created by Kuma on 18/01/2017.
 *
 * Define el contrato para las clases implementadas.
 */
public interface FileSystemReceiver {

    void openFile();

    void writeFile();

    void closeFile();

}