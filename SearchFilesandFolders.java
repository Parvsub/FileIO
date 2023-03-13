package com.employeeserviceproblem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SearchFilesandFolders {
    public void search() throws IOException {
        File folder = new File("C:\\Users\\bodap\\OneDrive\\Desktop\\Praveen");
        File[] files = folder.listFiles();

        //iterate the files array
        for (File file : files) {
            //check if the file
            if (file.isFile()) {
                System.out.println("File ->" + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("Folder ->" + file.getName());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        SearchFilesandFolders searchObj = new SearchFilesandFolders();
        searchObj.search();
    }
}
