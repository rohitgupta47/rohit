package rohit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Q1ColLab3 implements Comparator{

	public static void main(String[] args) 
	{
		int count;
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
	List<String>list =new ArrayList();
		System.out.println("enter word to be search in sentence");
	
	String word=s.next();
	System.out.println("enter sentence");
	String line=s1.nextLine();
	String[] arr=line.split(" ");
	/*for(String id:arr) {
		if(id.equals(word)) {
			count++;
}
	}System.out.println(word+" repeating "+count+" times");
	*/for(String add:arr) {
		list.add(add);
	}
	count=Collections.frequency(list, word);
	System.out.println(word+" repeating "+count+" times");
	Collections.sort(list, new FrequencyClassComparator());
	System.out.println(list+" in alphabeticall decreasing order");
	Collections.sort(list);
	System.out.println(list+"  in alphabetical increasing order");
	for(String wo:arr) {
	if(!list.contains(wo))
		list.add(wo);
	}System.out.println("elements without repetition "+list);
}
}