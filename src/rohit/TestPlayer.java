package rohit;

import java.util.Arrays;
import java.util.HashSet;

public class TestPlayer {

	public static void main(String[] args) {
	/*HashSet<Player>set=new HashSet<Player>();
	Player p1=new Player("vansh",140);
	Player p2=new Player("rohit",173);
	Player p3=new Player("mohit",160);
	Player p4=new Player("Rajan",156);
	Player p5=new Player("Ram",144);
	set.add(p1);set.add(p2);set.add(p3);set.add(p4);set.add(p5);
	Object[] arr=set.toArray();
	System.out.println("Object[] arr=set.toArray(); "+Arrays.toString(arr));
	System.out.println("HashSet<Player>set=new HashSet<Player>(); "+set);
	Player[] play=new Player[set.size()];
	set.toArray(play);
	System.out.println("Arrays.toString(play) "+Arrays.toString(play));
	Object[] arr1=new Object[set.size()];
	set.toArray(arr1);
	for(Object o:arr1) {
		System.out.println(o.toString());
	}*/
	HashSet s1=new HashSet();
	HashSet s2=new HashSet();
	s1.add("java");s1.add("good");s2.add("gtg");s2.add("gta 5");
	for(Object o:s2) {
		System.out.println("element "+o+" s1 "s1.contains(o));
	}
	}

}
