package designpatterns.builder;

import designpatterns.builder.pojos.Maze;

public class ComplexDirectorObj {

    //It's a builder director which initiates the maze

    MazeBuilder mazeBuilder; //It takes a input of builder object to work

    public ComplexDirectorObj(MazeBuilder mazeBuilder) {
        this.mazeBuilder = mazeBuilder;
    }

    public Maze createMaze() {
        mazeBuilder.buildMaze();
        mazeBuilder.buildRoom();
        mazeBuilder.buildRoom(); //Here we can alter a creation steps for new kind of Maze and create a new director object
        mazeBuilder.buildWall();
        mazeBuilder.buildDoor(0, 1);
        mazeBuilder.buildRoom();
        mazeBuilder.buildRoom(); //Here we can alter a creation steps for new kind of Maze and create a new director object
        mazeBuilder.buildWall();
        mazeBuilder.buildDoor(0, 1);
        return mazeBuilder.getMaze();
    }
}
