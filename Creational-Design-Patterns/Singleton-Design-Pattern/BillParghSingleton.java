// Lazy Loading
// Thread Safe

class Logger {

    private Logger() {
    }

    private static class InnerLogger {
        private static final Logger logger = new Logger();
    }

    public static Logger getLogger() {
        return InnerLogger.logger;
    }
}

public class BillParghSingleton {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        System.out.println(logger1);
        System.out.println(logger2);
    }
}
