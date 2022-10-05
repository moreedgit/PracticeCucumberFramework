package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;
    public static Properties readProperties(String filePath)  {

        try {
            FileInputStream fis = new  FileInputStream(filePath);
            prop =  new Properties();
            prop.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;

    }
    // this method get single value based on the key
    public static String getPropertyValue(String key){
        return prop.getProperty(key);
    }
}
