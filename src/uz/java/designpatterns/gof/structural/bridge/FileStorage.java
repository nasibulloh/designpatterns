package uz.java.designpatterns.gof.structural.bridge;

import java.io.File;

interface FileStorage {
    String store(File file);

    byte[] download(String filename);
}
