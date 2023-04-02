package com.chen;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

public class ClassPathResourceDemo {
    public static void main(String[] args) throws IOException {
        loadClassPathResource("demo.txt");
    }
    public static void loadClassPathResource(String path) throws IOException {
        ClassPathResource resource = new ClassPathResource(path);
        InputStream in = resource.getInputStream();
        byte[] b = new byte[1024];
        int len;
        while ((len = in.read(b)) != -1) {
            System.out.println(new java.lang.String(b, 0, len));
        }
    }
}
