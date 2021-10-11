package com.LockedMe.service;

import java.io.File;

import com.LockedMe.entities.*;


public class DirectoryService {

    private static Directory fileDirectory = new Directory();
    
    public static void PrintFiles() {
    	
    	fileDirectory.fillFiles();
    	System.out.println();
        for (File file : DirectoryService.getFileDirectory().getFiles())
        {
            System.out.println(file.getName());
        }
        System.out.println();
    }
    public static Directory getFileDirectory() {
        return fileDirectory;
    }

    public static void setFileDirectory(Directory fileDirectory) {
        DirectoryService.fileDirectory = fileDirectory;
    }


}