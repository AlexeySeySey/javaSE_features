package Log;

import java.io.IOException;
import java.util.logging.*;

public class LoggerBuilder {
    String logFile = "Desktop/JAVA/Logging/resources/app.log";

    String className = LoggerBuilder.class.getName();

    Formatter formatter = null;

    Filter filter = null;

    public LoggerBuilder setClassName(String className) {
        this.className = className;

        return this;
    }

    public LoggerBuilder setLoggingFile(String path) {
        this.logFile = path;

        return this;
    }

    public LoggerBuilder setFilter(Filter filter) {
        this.filter = filter;

        return this;
    }

    public LoggerBuilder setFormatter(Formatter formatter) {
        this.formatter = formatter;

        return this;
    }

    public Logger build() throws IOException {
        var handler = new FileHandler("%h/" + this.logFile);
        if (this.formatter != null) {
            handler.setFormatter(this.formatter);
        }
        if (this.filter != null) {
            handler.setFilter(this.filter);
        }
        var logger = Logger.getLogger(this.className);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);

        return logger;
    }
}
