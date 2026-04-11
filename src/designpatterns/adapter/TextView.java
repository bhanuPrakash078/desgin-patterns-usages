package designpatterns.adapter;


//This is the adaptee, this is completely a different class.
public class TextView {

    public TextView() {}

    public void getExtent() {
        System.out.println("This is a TextView and using an extent");
    }
}
