package rohit;

public class T extends Device{
public void watch() {
	
	System.out.println("Tv watch() delta function");
}
public void doSomething() {
	System.out.println("watching tv in dosomething() shouting name"+name);
}
public void switchChannel() {
	System.out.println("switching channel ");
}
public T(String name) {
	super(name);
	System.out.println("TV args constructor");
}
}
