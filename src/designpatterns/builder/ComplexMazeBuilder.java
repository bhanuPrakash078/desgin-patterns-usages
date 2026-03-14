package designpatterns.builder;

import designpatterns.builder.pojos.Door;
import designpatterns.builder.pojos.Maze;

public class ComplexMazeBuilder implements MazeBuilder{

    Maze maze;

    public ComplexMazeBuilder() {
    }

    @Override
    public void buildDoor() {
        System.out.println("Building Complex Door");
        maze.setDoor(new Door());
    }

    @Override
    public void buildWall() {
        System.out.println("Building Complex wall");
    }

    @Override
    public void buildDoor(int x, int y) {
        System.out.println("Building Complex door");
    }

    @Override
    public void buildRoom() {
        System.out.println("Building Complex room");
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
