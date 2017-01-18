package behavior.command.commands;

import behavior.command.receiver.FileSystemReceiver;

/**
 * Created by Kuma on 18/01/2017.
 */
public class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }

}