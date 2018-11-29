package rohit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Frequency {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	//System.out.println("Enter text");
	String str="this this that that that that this and it is fixed below sea level";
	List<String>list=new ArrayList<String>();
	Set<String>setComp=new TreeSet<String>(new FrequencyClassComparator());
	Set<String>set=new TreeSet<String>();
	String[] arr=str.split(" ");
	for(String s1:arr)
	{
		list.add(s1);
		//set.add(s1);// first i'm sorting without duplicates 
		//setComp.addAll(set);
	}
	int max=0;
	String s3="";
	for(String s2:list) {
		int i=Collections.frequency(list, s2);
		//System.out.println(s2+ ": has occured " +i+" times" );
		if(i>max) {
			max=i;
			s3=s2;
		}
		//System.out.println(s2+ ": has occured " +i+" times" );
	} System.out.println("maximum occurence of wor="+s3+ "has occured "+max+" times");

	System.out.println(setComp+"::: sorting without repitition alphabetically reverse order");
	System.out.println(set+" sorting without repitition alphabetically order");
	System.out.println("Now we will do sorting using lists");
	Collections.sort(list);
	System.out.println(list+" here alphabetical increasing sorting with repetation bcz using List");
	Collections.sort(list,new FrequencyClassComparator());
	System.out.println(list+"::: now aplphabetical decreasing order with repetation bcs using Arraylist and passing comparator");
	}

}
