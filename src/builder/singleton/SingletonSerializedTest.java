package builder.singleton;

import builder.singleton.instantiation.SerializedSingleton;

import java.io.*;

/**
 * Created by Kuma on 16/01/2017.
 */
public class SingletonSerializedTest {

    public static void main(String... args) throws IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        String fileName = "filename.ser";

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(fileName));
        out.writeObject(instanceOne);
        out.close();

        //deserealize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(fileName));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode = " + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode = " + instanceTwo.hashCode());
    }

}