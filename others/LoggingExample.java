import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {
    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        // Log messages at different levels
        logger.severe("This is a SEVERE message");
        logger.warning("This is a WARNING message");
        logger.info("This is an INFO message");
        logger.config("This is a CONFIG message");
        logger.fine("This is a FINE message");
        logger.finer("This is a FINER message");
        logger.finest("This is a FINEST message");

        // Adjust the logging level to display all levels
        logger.setLevel(Level.ALL);
        logger.finest("This FINEST message is now visible!");

        // Turn off logging
        logger.setLevel(Level.OFF);
        logger.info("This message will not be logged because logging is OFF.");
    }
}

