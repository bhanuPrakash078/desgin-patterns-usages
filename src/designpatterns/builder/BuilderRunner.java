package designpatterns.builder;

import designpatterns.builder.pojos.Maze;

//This is the client object
public class BuilderRunner {

    public Maze buildMaze(MazeBuilder  mazeBuilder) {
        DirectorObj directorObj = new DirectorObj(mazeBuilder);
        Maze maze = directorObj.createMaze();
        return maze;
    }

    public static void main(String[] args) {
        MazeBuilder mazeBuilder = new SimpleMazeBuilder();
        DirectorObj directorObj = new DirectorObj(mazeBuilder);
        Maze maze = directorObj.createMaze();
        System.out.println(maze);

        System.out.println("Building Complex maze");
        MazeBuilder mazeBuilderComplex = new ComplexMazeBuilder();
       ComplexDirectorObj directorObjComplex = new ComplexDirectorObj(mazeBuilderComplex);
       Maze mazeComplex = directorObjComplex.createMaze();
        System.out.println(mazeComplex);
    }
}
