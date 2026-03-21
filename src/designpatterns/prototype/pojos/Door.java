package designpatterns.prototype.pojos;

public class Door implements Cloneable {

    @Override
    public Door clone() {
        try {
            return (Door) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Door() {
        System.out.println("Initiating a door object");
    }

}
