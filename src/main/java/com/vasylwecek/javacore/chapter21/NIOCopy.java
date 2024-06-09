package chapter21;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("");
            return;
        }

        try {
            Path source = Paths.get(args[0]);
            Path target = Paths.get(args[1]);

            // copy file
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        }catch (InvalidPathException e){
            System.out.println("Invalid path" + e);
        }catch (IOException e){
            System.out.println("IO exception" + e);
        }
    }
}
