package rohit;

import java.util.*;
import java.util.Map.Entry;

public class TestHashBook {

	public static void main(String[] args) {
		HashBook h1=new HashBook("java....","....lol....",156);
		HashBook h2=new HashBook("chemistry....","....chem....",510);
		HashBook h3=new HashBook("physics....","....pado....",106);
		HashBook h4=new HashBook("math....","....scary....",0);
		HashMap<HashBook,String>set=new HashMap<HashBook,String>();
		set.put(h2, "..khatam");set.put(h1, "..pyara");
		set.put(h3, "..bawal");
		set.put(h4, "..nahopayihumse");
		System.out.println(set.keySet()+" set.keySet()");
		System.out.println(set.entrySet()+" set.entrySet()");
		System.out.println(set.values()+" set.values()");
		
		Set<Entry<HashBook,String>>s=set.entrySet();
		
		for(Entry<HashBook,String> p:s) {
			System.out.println(p);
			System.out.println(p.getValue()+" p.getValue()");
			System.out.println(p.getKey()+" p.getKey()");
			
		}System.out.println(s.getClass()+" p.getClass()");
	System.out.println(set.containsKey(h4));
	
	


}
