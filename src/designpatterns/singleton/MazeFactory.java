package designpatterns.singleton;


public class MazeFactory {

    private static MazeFactory instance;

    protected MazeFactory() {

    }

    public static MazeFactory getInstance(String mazeType) {
        if (mazeType.equalsIgnoreCase("SimpleMazeFactory")) {
            instance = new SimpleMazeFactory();
        }

        if (mazeType.equalsIgnoreCase("ComplexMazeFactory")) {
            instance = new SimpleMazeFactory();
        }
        return instance;
    }
}
