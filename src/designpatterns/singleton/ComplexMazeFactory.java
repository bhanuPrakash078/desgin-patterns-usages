package designpatterns.singleton;

import designpatterns.builder.pojos.Door;
import designpatterns.builder.pojos.Room;
import designpatterns.builder.pojos.Wall;

public class ComplexMazeFactory extends MazeFactory {

    //Overriding the methods as per your requirements in the custom factory.
    public Room createRoom() {
        System.out.println("Creating Complex Room");
        return new Room();
    }

    public Door createDoor() {
        System.out.println("Creating Complex Door");
        return new Door();
    }

    public Wall createWall() {
        System.out.println("Creating Complex Wall");
        return new Wall();
    }
}
