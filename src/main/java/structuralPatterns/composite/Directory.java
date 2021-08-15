package structuralPatterns.composite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Composite
 */
public class Directory implements File{

    private List<File> fileList;
    private String permissions = "read and write";
    private String name;

    public Directory(String name) {
        this.name = name;
        this.fileList = new ArrayList<>();
    }

    public Directory(String name, List<File> fileList) {
        this.name=name;
        this.fileList = fileList;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("/"+this.name+":");
        fileList.forEach(File::ls);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPermissions() {
        return this.permissions;
    }

    @Override
    public void setPermissions(String permissions) {
        this.permissions = permissions;
        fileList.forEach(f->f.setPermissions(permissions));
    }

    @Override
    public void addFile(File file) {
        fileList.add(file);
    }

    @Override
    public List<File> getFiles() {
        return this.fileList;
    }



    @Override
    public boolean removeFile(File file) {
       return this.fileList.remove(file);
    }



}
