package designpatterns.command;

public class FileOpener {

    String fileName;

    public FileOpener(String fileName) {
        this.fileName = fileName;
    }

    public void open() {
        System.out.println("Opening " + fileName);
    }

    public void close() {
        System.out.println("Closing " + fileName);
    }

    public void write() {
        System.out.println("Writing " + fileName);
    }

}
