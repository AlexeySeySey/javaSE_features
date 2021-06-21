package Log.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MakersFormatter extends Formatter {

    @Override
    public String format(LogRecord logRecord) {

        String time = logRecord.getInstant().toString();
        try {
            var parsedTime = new SimpleDateFormat("dd-MM-yyyy").parse(time);
            time = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(parsedTime);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return String.format(
                "\nTime: %s\nLevel: %s\n%s@%s\nMessage:%s\n",
                time,
                logRecord.getLevel(),
                logRecord.getSourceClassName(),
                logRecord.getSourceMethodName(),
                logRecord.getMessage()
        );
    }
}
