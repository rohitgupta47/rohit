package rohit;

import java.util.TreeSet;

public class Laptop implements Comparable
{
	String name;
	int engCap;
	public boolean equals(Object o) {
		if(o instanceof Laptop)
		{
			Laptop v = (Laptop)o;
		if(this.name.equals(v.name)&&this.engCap==(v.engCap))
			
			return true;
		
		else 
			return false;
		}
		return false;
	}
	public int compareTo(Object o) {
		if(o instanceof Laptop)
		{
			Laptop v=(Laptop)o;
			return this.name.compareTo(v.name);
		}
	}
	Laptop(String n,int e){
		this.name=n;
		this.engCap=e;
	}
	
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
	Laptop v=new Laptop("Acerasus",2);
	Laptop v1=new Laptop("AcerAsus",2);
	System.out.println(set.add(v));
	System.out.println(set.add(v1));
	System.out.println(v.equals(v1));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEngCap() {
		return engCap;
	}
	public void setEngCap(int engCap) {
		this.engCap = engCap;
	}
}
	
	
