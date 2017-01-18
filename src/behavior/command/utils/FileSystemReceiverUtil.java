package behavior.command.utils;

import behavior.command.receiver.FileSystemReceiver;
import behavior.command.receiver.UnixFileSystemReceiver;
import behavior.command.receiver.WindowsFileSystemReceiver;

/**
 * Created by Kuma on 18/01/2017.
 */
public class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying os is: " + osName);

        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }

}