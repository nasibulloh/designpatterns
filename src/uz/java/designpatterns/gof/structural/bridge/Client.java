package uz.java.designpatterns.gof.structural.bridge;

import java.io.File;
import java.io.IOException;

class Client {
    public static void main(String[] args) throws IOException {
        FileStorage localFileStorage = new LocalFileStorage(new LinuxFileSystemManager());
        FileStorage remoteFileStorage = new RemoteFileStorage(new WindowsFileSystemManager());

        File file = File.createTempFile("", "");

        localFileStorage.store(file);
        remoteFileStorage.store(file);
    }
}
