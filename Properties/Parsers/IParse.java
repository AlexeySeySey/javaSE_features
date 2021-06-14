package Parsers;

import java.util.InvalidPropertiesFormatException;
import java.io.IOException;
import java.io.FileNotFoundException;

public interface IParse<T>
{
	public T parse(String path) throws InvalidPropertiesFormatException, IOException, FileNotFoundException;

	public String get(String key);
}
