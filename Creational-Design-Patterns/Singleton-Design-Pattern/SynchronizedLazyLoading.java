// Lazy Loading
// Thread Safe

class Logger {
    private static Logger logger;

    private Logger() {
    }

    public static synchronized Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}

public class SynchronizedLazyLoading {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        System.out.println(logger1);
        System.out.println(logger2);
    }
}
