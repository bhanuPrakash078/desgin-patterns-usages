package designpatterns.builder;

import designpatterns.builder.pojos.Maze;

public interface MazeBuilder {

    public void buildDoor();

    public void buildWall();

    public void buildDoor(int x, int y);

    public void buildRoom();

    public void buildMaze();

    public Maze getMaze();
}
