package behavior.command;

import behavior.command.commands.CloseFileCommand;
import behavior.command.commands.OpenFileCommand;
import behavior.command.commands.WriteFileCommand;
import behavior.command.invoker.FileInvoker;
import behavior.command.receiver.FileSystemReceiver;
import behavior.command.utils.FileSystemReceiverUtil;

/**
 * Created by Kuma on 18/01/2017.
 * <p>
 * El patrón Command se usa para implementar un modelo
 * request-response de bajo acoplamiento.
 *
 * El request se envía a un Invoker y este lo pasa al
 * Objeto Command encapsulado.
 *
 * El Objeto Command le pasa el request al método del
 * Receiver adecuado para realizar la acción especifica.
 */
public class FilesSystemClientTest {

    public static void main(String... args) {
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        fileInvoker.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.execute();
    }

}