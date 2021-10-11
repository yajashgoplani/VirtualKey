package com.LockedMe.entities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;


public class Directory {

   public static final String name = "src/directory/";

    private ArrayList<File> files = new ArrayList<File>();
    
    Path path = FileSystems.getDefault().getPath(name).toAbsolutePath();
    
    File Dfiles = path.toFile();
       
    public String getName() {
        return name;
    }
    
    public void print() {
    	System.out.println("Existing Files: ");
    	files.forEach(f -> System.out.println(f));
    }

    public ArrayList<File> fillFiles() {
        File[] directoryFiles = Dfiles.listFiles();        
    	files.clear();
    	for (int i = 0; i < directoryFiles.length; i++) {
    		if (directoryFiles[i].isFile()) {
    			files.add(directoryFiles[i]);
    		}
    	}
    	return files;
    }

    public ArrayList<File> getFiles() {
    	
    	fillFiles();
    	//Sorting List in descending order using insertion sort (That can also be done using Collections.sort(merge Sort))
    	File file[]=sortFiles(files);
    	ArrayList<File> sortedFiles= new ArrayList<File>();
    	for(File f:file)
    		sortedFiles.add(f);
    	return sortedFiles;
    }
    
    public File [] sortFiles(ArrayList<File> file)
    {
    	File f[]=new File[file.size()];
    	int i=0;
    	for(File m:files) {
    		f[i]=m;
    		i++;
    	}	
    	 int n = file.size();
         for (i = 1; i < n; ++i) {
             File key = f[i];
             int j = i - 1;
             while (j >= 0 && (f[j].getName().compareToIgnoreCase(key.getName())<0)) {
                 f[j + 1] = f[j];
                 j = j - 1;
             }
            f[j + 1] = key;
         }
        return f;
    }
    public void SortFiles() {
    	
    }
    
}