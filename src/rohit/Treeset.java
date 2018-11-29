package rohit;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
	TreeSet<Integer> tree=new TreeSet<Integer>(new TreeSetCmprble());
	tree.add(4);tree.add(24);tree.add(89);tree.add(76);tree.add(78);tree.add(10);
	System.out.println(tree);
	Iterator itr=tree.iterator();
	
	}

}

