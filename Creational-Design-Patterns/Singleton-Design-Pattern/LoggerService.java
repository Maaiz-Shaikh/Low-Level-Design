// Eager Loading 
// Thread Safe

class Logger {
    private static final Logger logger = new Logger();

    private Logger() {
    }

    public static Logger getLogger() {
        return logger;
    }
}

public class LoggerService {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        System.out.println(logger1);
        System.out.println(logger2);
    }

}
