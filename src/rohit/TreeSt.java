package rohit;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSt {

	public static void main(String[] args) {
		TreeSet tree=new TreeSet();
		tree.add("AA");tree.add("BB");tree.add("CC");tree.add("DD");tree.add("EE");
	System.out.println(tree);//[AA,BB,CC,DD,EE]
	Iterator itr=tree.descendingIterator();
	while(itr.hasNext()){
	System.out.println(itr.next());//	EE,DD,CC,BB,AA
	}
	TreeSet tree2=(TreeSet)tree.clone();
	System.out.println("clone"+tree2.equals(tree2));
	Students s1=new Students("a",7);
	Students s2=new Students("b",17);
	Students s3=new Students("c",72);
	Students s4=new Students("d",73);
	Students s5=new Students("e",47);
	TreeSet set=new TreeSet();
	set.add(s1);set.add(s2);set.add(s3);set.add(s4);set.add(s5);
	System.out.println(set);//[e,d,c,b,a]
	
	}
}
