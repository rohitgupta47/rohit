package rohit;

public class HashBook {
String name;String author;int pageno;

public HashBook(String name, String author, int pageno) {
	super();
	this.name = name;
	this.author = author;
	this.pageno = pageno;
}
public String toString() {
	return this.name+this.author+this.pageno;
}
public int hashcode() {
	return (name+author+pageno).hashCode();
}
public boolean equals(HashBook b) {
	if(this.author.equals(b.author)&&this.author.equals(b.author)&&this.pageno==b.pageno)
		return true;
	return false;
}

}
