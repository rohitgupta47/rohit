package rohit;

public class Students implements Comparable<Students> {
	private String name;
	private double height;
	public Students(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean equals(Object o) {
		Students s=(Students)o;
		if(this.name.equals(s.name)&&this.height==s.height)
			return true;
		else return false;
	}
	public int hashCode() {
		return (name+height).hashCode();
	}
	public String toString() {
		return "name= "+name+" ::: height= "+height;
	}
	public int compareTo(Students s) {
	
			return -this.name.compareTo(s.name);
		
		}
		
	
	

}

