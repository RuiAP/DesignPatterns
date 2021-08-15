package structuralPatterns.composite;

public class Main {
    public static void main(String[] args) {
        //great video about this pattern : https://www.youtube.com/watch?v=EWDmWbJ4wRA
        //the discussion about adding the add() and remove() methods to the component interface/abstraction is very
        // interesting but it comes down to:

        //These methods should be only on to the Composite class because it doesn't make sense to force the Leaf class
        // to implement methods it doesn't support.
        //It makes everything more error/bug prone. (and breaks Interface Segregation from SOLID)
        //__BUT__
        // for the client class to work only with Component Interface, these methods need to be on
        //the Component Interface and not on the composite.


        //TLDR; Personally I think that the hole purpose of the pattern is for the client code to be able to treat
        //either leaf or composite the same way and for that the component interface needs the add() and remove()
        //methods, so I'll implement them in this example.

        File file = new BinaryFile("file1");
        File file2 = new BinaryFile("file2");
        File file3 = new BinaryFile("file3");
        File file4 = new BinaryFile("file4");
        File folder = new Directory("dir1");
        folder.addFile(file2);
        folder.addFile(file3);
        folder.addFile(file4);

        file.ls();
        System.out.println("------------------");
        folder.ls();
        System.out.println("------------------");
        folder.setPermissions("read only");
        folder.ls();
        System.out.println("------------------");
        System.out.println("file4 removed?: "+folder.removeFile(file4));
        folder.ls();
        System.out.println("------------------");
        System.out.println("adding file to file");
        file.addFile(file2); //throws exception


    }


}
