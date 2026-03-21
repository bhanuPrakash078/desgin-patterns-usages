package designpatterns.prototype.pojos;

public class Maze implements  Cloneable{
    public Maze() {

    }

    @Override
    public Maze clone() {
        try {
            return (Maze) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }


    private Door door;

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    private Wall wall;

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }
}
