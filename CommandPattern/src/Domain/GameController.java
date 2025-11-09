package Domain;
import java.util.HashMap;
import java.util.Map;

public class GameController {
    private Map<String, Command> buttonMap = new HashMap<>();
    private Command lastCommand;

    public void setCommand(String button, Command command) {
        buttonMap.put(button, command);
    }

    public void pressButton(String button) {
        Command command = buttonMap.get(button);
        if (command != null) {
            command.execute();
            lastCommand = command;
        } else {
            System.out.println("No command assigned to " + button);
        }
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }
}