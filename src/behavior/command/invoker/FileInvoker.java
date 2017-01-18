package behavior.command.invoker;

import behavior.command.commands.Command;

/**
 * Created by Kuma on 18/01/2017.
 * Invoker es una Clase simple que encapsula el
 * Command y le pasa el Request al objeto Command
 * para que lo procese
 */
public class FileInvoker {
    Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }

}