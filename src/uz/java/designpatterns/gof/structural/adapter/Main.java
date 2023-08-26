package uz.java.designpatterns.gof.structural.adapter;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        RemoteFileStorage remoteFileStorage = new RemoteFileStorage();
        File file = File.createTempFile("", "");
        remoteFileStorage.store(file);

        remoteFileStorage = new FileStorageAdapter(new LocalFileStorage());
        remoteFileStorage.store(file);
    }
}
