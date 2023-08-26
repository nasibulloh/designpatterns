package uz.java.designpatterns.gof.structural.bridge;

import java.io.File;

public class LinuxFileSystemManager implements FileSystemManager{
    @Override
    public String storeFile(File file) {
        return null;
    }

    @Override
    public byte[] downloadFile(String filename) {
        return null;
    }
}
