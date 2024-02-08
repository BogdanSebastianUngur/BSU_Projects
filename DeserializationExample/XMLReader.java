import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.*;

public class XMLReader {
    public static void main(String[] args) {
        try {
            // Load XML file
            File file = new File("C:\\Users\\ungurb\\Desktop\\programming\\Java_code\\Second_run\\Deserialization\\guidname.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            // Get all elements with guid and name
            NodeList guidList = doc.getElementsByTagName("Guid");
            NodeList nameList = doc.getElementsByTagName("Name");
            //System.out.println(guidList); --FAILED--
            //

            // Create Map
            Map<String, String> Map = new HashMap<>();

            // Put info in Map
            for (int i = 0; i < guidList.getLength(); i++) {
                String guid = guidList.item(i).getTextContent();
                String name = nameList.item(i).getTextContent();
                Map.put(guid, name);
            }

            // Print the map
            for (Map.Entry<String, String> map : Map.entrySet()) {
                System.out.println("Guid: " + map.getKey() + ", Name: " + map.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
