package uz.java.designpatterns.gof.structural.adapter;

import java.io.File;

public class FileStorageAdapter extends RemoteFileStorage {

    private final LocalFileStorage localFileStorage;

    public FileStorageAdapter(LocalFileStorage localFileStorage) {
        this.localFileStorage = localFileStorage;
    }

    @Override
    public void store(File file) {
        localFileStorage.store(file);
    }
}
