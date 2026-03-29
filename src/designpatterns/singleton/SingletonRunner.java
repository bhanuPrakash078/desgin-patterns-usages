package designpatterns.singleton;

public class SingletonRunner {

    public static void main(String[] args) {
        //Here either we can send the type or set the MazeFactory via env variables
        MazeFactory simpleMazeFactory = MazeFactory.getInstance("simpleMazeFactory");

    }
}
