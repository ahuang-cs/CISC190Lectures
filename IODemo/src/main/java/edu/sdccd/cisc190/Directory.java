package edu.sdccd.cisc190;


import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Directory {
    private File dir;

    public Directory(String destinationPath) throws IOException {
        setDir(destinationPath);
    }

    public void setDir(String destinationPath) throws IOException {
        dir = new File(destinationPath);
        if(!dir.isDirectory() && dir.exists()) {
            throw new IOException(destinationPath + " is not a directory!");
        }
    }

    public boolean exists() {
        return dir.exists() && dir.isDirectory();
    }

    //CRUD create, read, update, delete
    public boolean create() {
        return dir.mkdirs();
    }

    public boolean delete() {
        return dir.delete();
    }

    public Set<String> list() {
        Set<String> files = new HashSet<>();
        for(String file: dir.list()) {
            files.add(file);
        }
        return files;
    }
}
