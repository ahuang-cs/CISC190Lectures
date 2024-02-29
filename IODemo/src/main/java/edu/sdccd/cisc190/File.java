package edu.sdccd.cisc190;

import java.io.*;

public class File {
    public static int BUFFER_SIZE = 1024;
    private java.io.File file;

    public File(String filePath) throws IOException {
        setFile(filePath);
    }

    private void setFile(String filePath) throws IOException {
        file = new java.io.File(filePath);
        if(!file.isFile() && file.exists()) {
            throw new IOException(filePath + " is not a file!");
        }
    }
    public String getPath() {
        return file.getAbsolutePath();
    }

    public void copyFromResourcesBuffered(String resourcePath) throws IOException {
        InputStream is;
        OutputStream os;

        is = new BufferedInputStream(File.class.getClassLoader().getResourceAsStream(resourcePath), BUFFER_SIZE);
        os = new BufferedOutputStream(new FileOutputStream(file));

        int bytesRead;
        while( ( bytesRead = is.read() ) > 0) {
            os.write(bytesRead);
        }
        os.close();
        is.close();
    }

    public boolean exists() {
        return file.exists() && file.isFile();
    }

    public boolean delete() {
        return file.delete();
    }
}
