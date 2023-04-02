package com.chen;

import org.springframework.core.io.UrlResource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

public class UrlResourceDemo {
    public static void main(String[] args) {
        //访问http资源
        loadUrlResource("https://blkcor-blog.netlify.app/cover/dark.png");
        //访问file资源
        loadUrlResource("file:demo.txt");
    }

    public static void loadUrlResource(String path) {
        try {
            UrlResource resource = new UrlResource(path);
            if (resource.getFilename().endsWith(".txt")) {
                InputStream inputStream = resource.getInputStream();
                byte[] b = new byte[1024];
                int len;
                while ((len = inputStream.read(b)) != -1) {
                    System.out.println(new String(b, 0, len));
                }
            }
//            System.out.println(resource.getFilename());
//            System.out.println(resource.getDescription());
//            System.out.println(resource.getURI());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
