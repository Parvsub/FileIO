package com.employeeserviceproblem;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public void createFile() throws IOException {
        File f = new File("C:\\Users\\bodap\\OneDrive\\Desktop\\Praveen");
        f.createNewFile();
        System.out.println(f.exists());
    }
    public void createDirectory() throws IOException {
        File f = new File("C:\\Users\\bodap\\OneDrive\\Desktop\\Praveen");
        f.mkdir();
        System.out.println(f.exists());
    }
    public void createFiles() throws IOException {
        for (int startNo = 12; startNo < 51; startNo++) {
            File f = new File("C:C:\\Users\\bodap\\OneDrive\\Desktop\\Praveen" +
                    startNo + ".txt");
            f.createNewFile();
        }
    }
    public void checkFiles() {
        File f = new File("C:\\Users\\bodap\\OneDrive\\Desktop\\Praveen");
        String[] listFiles = f.list();
        for (String str : listFiles) {
            System.out.println(str);
        }
    }


    public static void main(String[] args) throws IOException {
        FileOperations fcObj = new FileOperations();
        fcObj.createFile();
        fcObj.createFiles();
        fcObj.checkFiles();
        fcObj.createDirectory();
    }
}
