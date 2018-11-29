package rohit;

import java.util.*;
import java.util.Map.Entry;

public class HashMapQ {

	public static void main(String[] args) {
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		h.put("lion", 1);
		h.put("tiger", 3);
		h.put("octopus", 6);
		h.put("donkey", 2);
		System.out.println(h);
		System.out.println(h.get("tiger"));
		Set<Entry<String, Integer>> e=h.entrySet();
		for(Entry<String,Integer>o:e) {
			System.out.println("entryset()"+o);
			System.out.println(o.getKey()+"  "+o.getValue());
		}
		System.out.println("h.values() "+h.values());
		System.out.println("h.keySet() "+h.keySet());
		System.out.println("h.values() "+h.entrySet());
		HashMap<String,Integer> map2=new HashMap<String,Integer>();
		map2.putAll(h);
		System.out.println(map2.values());
		System.out.println(h.values());
	map2.clear();
	System.out.println(map2);
	}

}
