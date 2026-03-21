package designpatterns.builder;

import designpatterns.builder.pojos.Maze;

//This is the client object
public class BuilderRunner {

    public static void main(String[] args) {
        MazeBuilder mazeBuilder = new SimpleMazeBuilder();
        //We can create different Director objects by giving different Maze builders
        DirectorObj directorObj = new DirectorObj(mazeBuilder);
        //This is the client, and client dont know the internal subparts of the maze and how its assembled
        Maze maze = directorObj.createMaze();
        System.out.println(maze);

        System.out.println("Building Complex maze");
        MazeBuilder mazeBuilderComplex = new ComplexMazeBuilder();
       ComplexDirectorObj directorObjComplex = new ComplexDirectorObj(mazeBuilderComplex);
       Maze mazeComplex = directorObjComplex.createMaze();
        System.out.println(mazeComplex);
    }
}
