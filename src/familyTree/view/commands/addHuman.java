package familyTree.view.commands;

import familyTree.view.ConsoleUI;

public class addHuman extends Command{
    private String description;
    private ConsoleUI consoleUI;

    public addHuman(ConsoleUI consoleUI) {
        super("Добавить человека", consoleUI);
    }

    @Override
    public void execute() {
    getConsoleUI().addHuman();
    }
}
