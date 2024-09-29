package interview.coding.java.standardapi.props;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        FileReader file=new FileReader(System.getProperty("user.dir") +"/src/main/java/interview/coding/java/standardapi/props/props.properties");

        Properties props=new Properties();
        props.load(file);

        System.out.println(props.getProperty("name"));
    }
}
