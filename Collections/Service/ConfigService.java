package Service;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.InvalidPropertiesFormatException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Collections;

public class ConfigService {

    private Map<String, String> config;

    public ConfigService(String configPath) throws InvalidPropertiesFormatException, IOException, FileNotFoundException {
        var props = new Properties();
        props.load(new FileInputStream(configPath));
        this.config = Collections.unmodifiableMap((Map)props);
    }

    public String get(String key) {
        return this.config.get(key);
    }
}