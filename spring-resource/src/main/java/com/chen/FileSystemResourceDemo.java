package com.chen;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;

public class FileSystemResourceDemo {
    public static void main(String[] args) throws IOException {
        loadFileSystemResource("/Users/chenzilong/Desktop/notes/Docker.md");
    }

    public static void loadFileSystemResource(String path) throws IOException {
        FileSystemResource resource = new FileSystemResource(path);
        InputStream in = resource.getInputStream();
        byte[] b = new byte[1024];
        int len;
        while ((len = in.read(b)) != -1) {
            System.out.println(new java.lang.String(b, 0, len));
        }
    }
}
