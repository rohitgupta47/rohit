package rohit;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("array");v.add("arr");v.add("ray");v.add("ay");v.add("arrwa");
		System.out.println(v);
		Enumeration e=v.elements();
		System.out.println("printing vector elements by using enumeration");
		while(e.hasMoreElements()) {
			
			String s=(String)e.nextElement();
			System.out.println(s);
		}
		Iterator itr=v.iterator();
		System.out.println("printing vector elements by using iterator");
		while(itr.hasNext()) {
			
			String i=(String)itr.next();
			System.out.println(i);
		}
	}

}
