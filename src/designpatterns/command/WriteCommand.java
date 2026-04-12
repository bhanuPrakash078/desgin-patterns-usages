package designpatterns.command;

public class WriteCommand implements Command {

    FileOpener fileOpener;

    public WriteCommand(String fileName) {
        fileOpener = new FileOpener(fileName);
    }

    @Override
    public void execute() {
        fileOpener.write();
    }
}
