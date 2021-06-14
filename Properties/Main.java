import Parsers.IParse;
import Parsers.XMLParser;
import Parsers.PropertiesParser;
import java.util.InvalidPropertiesFormatException;
import java.io.IOException;
import java.io.FileNotFoundException;

class Main
{
	public static void main(String[] args)
	{
		IParse<XMLParser> xmlParser = new XMLParser();
		IParse<PropertiesParser> propsParser = new PropertiesParser();

		try {
                        System.out.println(xmlParser.parse("resources/test.xml").get("john"));	
			System.out.println(propsParser.parse("resources/test.properties").get("foo"));
		} catch (InvalidPropertiesFormatException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
                        System.out.println(e.getMessage());
		}
	}
}
