package Util;

import Log.LoggerBuilder;

import java.io.IOException;
import java.util.logging.Level;

import Log.Filter.MakersFilter;
import Log.Formatter.MakersFormatter;

public class Maker {
    public void make() {
        try {
            var logger = (new LoggerBuilder())
                    .setClassName(Maker.class.getName())
                    .setFilter(new MakersFilter())
                    .setFormatter(new MakersFormatter())
                    .build();
            logger.info("Looks like maker definitely trying to make something");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
