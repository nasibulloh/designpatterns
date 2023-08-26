package uz.java.designpatterns.gof.structural.bridge;

import java.io.File;

public interface FileSystemManager {
    String storeFile(File file);

    byte[] downloadFile(String filename);
}
