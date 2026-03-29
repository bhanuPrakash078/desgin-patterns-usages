package designpatterns.singleton.registry;

public class LoggerRunner {
    public static void main(String[] args) throws ClassNotFoundException {

        //This is because static block in the cloud logger wont be triggered and it wont get registered to Registry
        Class.forName("designpatterns.singleton.registry.CloudLogger");

        Logger.getInstance().log("HELLO WORLD !!");
    }
}
