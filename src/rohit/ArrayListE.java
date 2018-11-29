package rohit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListE {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList();
		arr.add("red");arr.add("brown");arr.add("black");arr.add("pink");arr.add("green");arr.add("blue");
	/*Iterator itr=arr.iterator();
	System.out.println("using iterator");
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("using for-each");
	for(Object a:arr) {
		System.out.println(a);
	}*/
		StringBuffer s=new StringBuffer(arr.get(3));
		System.out.println(s.reverse());
	CarList c0=new CarList("maruti","honda");
	CarList c1=new CarList("bmw","merce");
	CarList c2=new CarList("volkswagen","ferari");
	CarList c3=new CarList("taxi","ambassdor");
	CarList c4=new CarList("fare","fuel");
	ArrayList<CarList> car=new ArrayList();
		car.add(c0);car.add(c1);	car.add(c2);car.add(c3);
	System.out.println("ArrayList "+car);
	LinkedList<CarList> list=new LinkedList(car);
	System.out.println("LinkedList "+list);
	int i=list.size()/2;
	System.out.println("middle index "+i);
	list.add(i, c4);
	System.out.println(list);
	/*CarList o1=list.get(3);
	CarList o2=list.get(2);
	CarList temp=null;temp=o1;o1=o2;o2=temp;
	list.add(2, o1);list.add(3, o2);
	System.out.println(list);*/
	Collections.swap(list, 2, 3);
	System.out.println(list);
	}

}
