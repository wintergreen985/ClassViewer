package com.mbovard.classviewer.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by Matthew on 9/3/2014.
 */
public class FileLoader extends ClassLoader {
    private Logger logger = Logger.getLogger(FileLoader.class.getName());
    public Class<?> loadClass(File f) throws IOException {
        String name = f.getName().replaceAll(".class", "").replace("/", ".");
        DataInputStream dis = new DataInputStream(new FileInputStream(f));
        byte[] bytes = new byte[dis.available()];
        dis.readFully(bytes);
        return defineClass(name, bytes, 0, bytes.length);
    }
    
}
