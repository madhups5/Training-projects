

import java.util.HashMap;
import java.util.Map;

public class GreetingImpl implements Greetings{

	private static Map<String,String> map;
	public GreetingImpl()
	{
		map=new HashMap();
		map.put("Hindi","Namasthey");
		map.put("Kannada", "Namaskara");
		map.put("Tamil", "Vanakkam");
		map.put("Telugu", "Namaskaram");
		map.put("English", "Hello");
		
	}
	
	@Override
	public String greet(String name, String language) {
	    String lang=language.toUpperCase();
	    String value=map.get(lang);
	    return value+" "+name;
	}
	

}
