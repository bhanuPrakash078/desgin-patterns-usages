package designpatterns.singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    private static Map<String, Logger> registry = new HashMap<String, Logger>();
    private static Logger instance;

    protected Logger() {

    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            //Logic to look up the which logger you need from the registry. Here defaulting to cloud logger
            instance = lookup("cloud");
        }
        return instance;
    }


    private static Logger lookup(String type) {
        if (!registry.containsKey(type)) {
            return new Logger();
        }
        return registry.get(type);
    }

    protected static void register(String type, Logger logger) {
        registry.put(type, logger);
    }

    public void log(String message) {
        System.out.println("Standard logger :: " + message);
    }
}

