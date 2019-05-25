package ua.edu.chmnu.fks.oop.lab09;

/**
 *
 * @author Алексей
 * Створити програму для копіювання файлу з однієї директорії в іншу.
 */

import java.io.*;
import java.nio.file.*;

public class Lab09 {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("G:\\1.txt");
        File destFolder = new File("G:\\2.txt");
        if (!srcFolder.exists()) {
            System.err.println("Файлу не iснує!");
        } else {
            copyDirectory(srcFolder, destFolder);
        }
    }
     public static void copyDirectory(File src, File dst) throws IOException {
        try {
            if (src.isDirectory()) {
                if (!dst.exists()) {
                    dst.mkdir();
                    System.out.println("Директорiю скопiйовано з " + src + "  в " + dst);
                }
                String files[] = src.list();

                for (String file : files) {
                    File srcFile = new File(src, file);
                    File dstFile = new File(dst, file);
                    copyDirectory(srcFile, dstFile);
                }
            } else {
                InputStream in = new FileInputStream(src);
                OutputStream out = new FileOutputStream(dst);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);
                }
                in.close();
                out.close();
                System.out.println("Файл скопiйовано з " + src + " в " + dst);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}