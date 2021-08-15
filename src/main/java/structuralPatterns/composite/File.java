package structuralPatterns.composite;

import java.util.List;

public interface File {

    String getPermissions();
    void setPermissions(String permissions);
    void addFile(File file);
    List<File> getFiles();
    String getName();
    boolean removeFile(File file);
    void setName(String name);
    void ls();
}
