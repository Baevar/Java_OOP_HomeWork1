package familyTree.view.commands;

import familyTree.view.ConsoleUI;

public class SortbyName extends Command{
    private String description;
    private ConsoleUI consoleUI;

    public SortbyName(ConsoleUI consoleUI) {
        super("Сортировать по имени", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortByName();
    }
}
