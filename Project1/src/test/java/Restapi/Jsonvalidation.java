package Restapi;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Jsonvalidation {
public static void main(String[] args) throws IOException, ParseException {
	File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Project1\\src\\test\\java\\payload\\json\\payload.json");
	FileReader reader =new FileReader(f);
	JSONParser parser=new JSONParser();
	 Object obj = parser.parse(reader);
JSONObject  jsonobj=(JSONObject)obj;
Object ob = jsonobj.get("team");
String value = obj.toString();
System.out.println("team:"+value);

}
}
