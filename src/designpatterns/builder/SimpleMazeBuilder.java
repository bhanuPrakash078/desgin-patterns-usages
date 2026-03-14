package designpatterns.builder;

import designpatterns.builder.pojos.Door;
import designpatterns.builder.pojos.Maze;

public class SimpleMazeBuilder implements MazeBuilder {

    Maze maze;

    public SimpleMazeBuilder() {
    }

    @Override
    public void buildDoor() {
        System.out.println("Building simple Door");
        maze.setDoor(new Door());
    }

    @Override
    public void buildWall() {
        System.out.println("Building simple wall");
    }

    @Override
    public void buildDoor(int x, int y) {
        System.out.println("Building simple door");
    }

    @Override
    public void buildRoom() {
        System.out.println("Building simple room");
    }

    @Override
    public void buildMaze() {
        this.maze = new Maze();
    }

    @Override
    public Maze getMaze() {
        return this.maze;
    }
}
