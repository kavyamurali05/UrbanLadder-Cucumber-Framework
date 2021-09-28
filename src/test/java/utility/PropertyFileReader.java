package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	Properties prop;
	public static Properties generateProp() throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\kavya\\eclipse-workspace\\urbanLadder\\config.properties");
		prop.load(fis);
		return prop;
	}

}
