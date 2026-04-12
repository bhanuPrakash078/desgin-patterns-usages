package designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {

    List<Command> commandList = new ArrayList<>();

    public DocumentEditor() {

    }

    public void openDocument(Command command) {
        commandList.add(command);
        command.execute();
    }

    public void closeDocument(Command command) {
        commandList.add(command);
        command.execute();
    }

    public void writeDocument(Command command) {
        commandList.add(command);
        command.execute();
    }

    public void printCommands() {
        for (Command command : commandList) {
            System.out.println(command.toString());
        }
    }
}
