package rohit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class DoHashMap {

	public static void main(String[] args) {
		HashMap<String,String>map=new HashMap<String, String>();
		map.put("ram", "sita");//put() return value.
		map.put("rajan","van");
		map.put("respect", "pride");
		map.put("kind", "knoledge");
		Collection s=map.keySet();
		Collection s1=map.values();
		Collection s2=map.entrySet();
		boolean b=map.containsKey("respect");
		System.out.println("containsKey(\"respect\") "+b);
		System.out.println(s+",,,"+s1);
		System.out.println(s2);
		System.out.println(map.get("ram"));
		
	}

}
