package designpatterns.prototype.pojos;

public class Wall implements Cloneable {

    @Override
    public Wall clone() {
        try {
            return (Wall) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Wall() {
        System.out.println("Initiating a wall object");
    }
}
