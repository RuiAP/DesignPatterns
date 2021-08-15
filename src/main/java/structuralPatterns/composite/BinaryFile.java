package structuralPatterns.composite;

import java.util.List;

/**
 * Leaf
 */
public class BinaryFile implements File{

    private String permissions = "read and write";
    private String name;

    public BinaryFile(String name) {
        this.name = name;
    }


    @Override
    public String getPermissions() {
        return this.permissions;
    }

    @Override
    public void setPermissions(String permissions) {
        this.permissions=permissions;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void ls() {
        System.out.println(this.name + "-- "+this.permissions );
    }
    //---------------------------------------------------

    @Override
    public List<File> getFiles() {
        throw new UnsupportedOperationException("It's only possible to various Files from directories.");
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("It's only possible to remove Files from directories.");
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("It's not possible to add Files to directories.");
    }


}
