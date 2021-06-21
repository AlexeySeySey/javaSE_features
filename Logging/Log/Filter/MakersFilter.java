package Log.Filter;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class MakersFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getMessage().contains("maker");
    }
}
