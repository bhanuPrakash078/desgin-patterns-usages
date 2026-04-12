package designpatterns.command;

public class CloseCommand implements Command {

    FileOpener fileOpener;

    public CloseCommand(String fileName) {
        fileOpener = new FileOpener(fileName);
    }

    @Override
    public void execute() {
        fileOpener.close();
    }
}
