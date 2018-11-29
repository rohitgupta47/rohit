package rohit;

public class Device {
	String name;
	public void doSomething() {
		System.out.println("Parent class of all devices has name "+name);
	}
	public Device() {
		System.out.println("device no args constructor");
	}
	public Device(String n) {
		this.name=n;
		System.out.println("device args constructor" );
	}
}
