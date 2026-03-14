package designpatterns.factory;

public class MazeFactoryRunner {
    public static void main(String[] args) {

        MazeFactory mazeFactory = new ComplexMazeFactory();
        mazeFactory.createMaze();

        MazeFactory mazeFactory2 = new SimpleMazeFactory();
        mazeFactory2.createMaze();
    }
}
