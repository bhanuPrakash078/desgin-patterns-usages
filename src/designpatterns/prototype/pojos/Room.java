package designpatterns.prototype.pojos;

public class Room implements Cloneable {

    @Override
    public Room clone() {
        try {
            return (Room) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Room() {
        System.out.println("Initiating a room object");
    }
}
