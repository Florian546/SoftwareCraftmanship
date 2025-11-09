import Domain.*;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command cross = new CrossCommand(receiver);
        Command triangle = new TriangleCommand(receiver);
        Command square = new SquareCommand(receiver);
        Command circle = new CircleCommand(receiver);

        GameController controller = new GameController();
        controller.setCommand("X", cross);
        controller.setCommand("Triangle", triangle);
        controller.setCommand("Square", square);
        controller.setCommand("Circle", circle);

        controller.pressButton("X");
        controller.pressButton("Square");
        controller.pressUndo();

        // Remap at runtime
        controller.setCommand("X", triangle);
        controller.pressButton("X");
    }
}
