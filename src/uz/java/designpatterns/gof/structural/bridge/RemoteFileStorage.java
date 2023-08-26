package uz.java.designpatterns.gof.structural.bridge;

import java.io.File;

public class RemoteFileStorage implements FileStorage {

    private final FileSystemManager fileSystemManager;

    public RemoteFileStorage(FileSystemManager fileSystemManager) {
        this.fileSystemManager = fileSystemManager;
    }

    @Override
    public String store(File file) {
        return fileSystemManager.storeFile(file);
    }

    @Override
    public byte[] download(String filename) {
        return fileSystemManager.downloadFile(filename);
    }
}
