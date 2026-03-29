package designpatterns.singleton.registry;

public class CloudLogger extends Logger {

    protected CloudLogger() {
        super();
    }

    @Override
    public void log(String message) {
        System.out.println("Cloud logger :: " + message);
    }

    static {
        Logger.register("cloud", new CloudLogger());
    }
}
