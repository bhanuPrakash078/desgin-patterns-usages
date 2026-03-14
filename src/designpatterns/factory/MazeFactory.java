package designpatterns.factory;

import designpatterns.builder.pojos.Door;
import designpatterns.builder.pojos.Maze;
import designpatterns.builder.pojos.Room;
import designpatterns.builder.pojos.Wall;

public abstract class MazeFactory {

    public MazeFactory() {

    }

    //We can make the creation steps final, so that subclasses cant override it
    //But the Door and wall those creations are deferred to subclass, while default implementation is present here.
    public final Maze createMaze() {
        Maze maze = new Maze();
        createDoor();
        createWall();
        createRoom();
        createDoor();
        createWall();
        createRoom();
        return maze;
    }

    //Below all are factory methods to create the objects which subclasses can overwrite.

    public Room createRoom() {
        System.out.println("Creating Default Room");
        return new Room();
    }

    public Door createDoor() {
        System.out.println("Creating Default Door");
        return new Door();
    }

    public Wall createWall() {
        System.out.println("Creating Default Wall");
        return new Wall();
    }
}
