package Parsers;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.InvalidPropertiesFormatException;
import java.io.IOException;
import java.io.FileNotFoundException;

public class XMLParser implements IParse<XMLParser>
{
        private Properties props = new Properties();

	public XMLParser parse(String path) throws InvalidPropertiesFormatException, IOException, FileNotFoundException 
	{
                this.props.loadFromXML(new FileInputStream(path));

		return this;
	}

	public String get(String key)
	{
		return this.props.getProperty(key);
	}
}
