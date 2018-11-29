package rohit;

public class Microwave extends Device{
	public Microwave(String n) {
		super(n);
		System.out.println("microwave args constructor");
	}
	public void cook() {
		System.out.println("microwave cooking in cook() delta function");
	}
	public void doSomething() {
		System.out.println("microwave doSomething() shouting name "+name);
	}
}
