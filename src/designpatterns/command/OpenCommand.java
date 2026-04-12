package designpatterns.command;

public class OpenCommand implements Command {

    FileOpener fileOpener;

    public OpenCommand(String fileName) {
        fileOpener = new FileOpener(fileName);
    }

    @Override
    public void execute() {
        fileOpener.open();
    }
}
