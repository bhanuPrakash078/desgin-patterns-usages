package designpatterns.command;

public class CommandRunner {

    public CommandRunner() {

    }

    public static void main(String[] args) {
        Command openCommand = new OpenCommand("myFile.pdf");
        Command closeCommand = new CloseCommand("myFile.pdf");
        Command writeCommand = new WriteCommand("myFile.pdf");
        DocumentEditor documentEditor = new DocumentEditor();
        documentEditor.openDocument(openCommand);
        documentEditor.writeDocument(writeCommand);
        documentEditor.writeDocument(writeCommand);
        documentEditor.writeDocument(writeCommand);
        documentEditor.writeDocument(writeCommand);
        documentEditor.closeDocument(closeCommand);
        documentEditor.printCommands();
    }
}
