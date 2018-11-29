package rohit;

public class Printer extends Device {
public void print() {
	System.out.println("print() of printer delta function");
}
public void doSomething() {
	System.out.println("printer machine shouting name"+name);
}
public Printer(String name) {
	super(name);
	System.out.println("Printer args constructer");
}
}
