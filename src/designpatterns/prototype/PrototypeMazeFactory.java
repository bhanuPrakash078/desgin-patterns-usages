package designpatterns.prototype;


import designpatterns.prototype.pojos.Door;
import designpatterns.prototype.pojos.Maze;
import designpatterns.prototype.pojos.Room;
import designpatterns.prototype.pojos.Wall;

public class PrototypeMazeFactory {

    private Maze maze;
    private Door door;
    private Wall wall;
    private Room room;


    public PrototypeMazeFactory(Maze maze, Wall wall, Room room, Door door) {
        this.maze = maze;
        this.wall = wall;
        this.room = room;
        this.door = door;
    }

    //We use clone to work with starter pieces instead of creating objects from scratch
    public Maze createMaze() {
        System.out.println("Creating Maze");
        Maze clone = this.maze.clone();
        clone.setDoor(createDoor());
        clone.setWall(createWall());
        clone.setRoom(createRoom());
        return clone;
    }

    public Door createDoor() {
        System.out.println("Creating Maze");
        return this.door.clone();
    }


    public Wall createWall() {
        System.out.println("Creating Maze");
        return this.wall.clone();
    }

    public Room createRoom() {
        System.out.println("Creating Maze");
        return this.room.clone();
    }

}
