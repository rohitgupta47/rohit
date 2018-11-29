package rohit;
import java.util.*;
import java.util.Map.Entry;
public class Treemap {

	public static void main(String[] args) {
		TreeMap<String,String> t=new TreeMap<String,String>();
		t.put("lucknow", "inawab");
		t.put("delhi", "pfunnnn");
		t.put("jodhpur", "vnever");
		t.put("wasseypur", "Dgangs");
		System.out.println(t.keySet());//sorting check
		System.out.println(t.values());//random check but whyy
		//System.out.println(t.entrySet());//sorting on keys check
		List<Entry<String,String>>list=new ArrayList<Entry<String,String>>(t.entrySet());
		Collections.sort(list,new ValueComp());
		
		//System.out.println(t.values());
		System.out.println(list);
	}

}
class ValueComp implements Comparator<Entry<String,String>>{
	
	public int compare(Entry<String, String> arg0, Entry<String, String> arg1) {
		
		return arg0.getValue().compareTo(arg1.getValue());
	}}