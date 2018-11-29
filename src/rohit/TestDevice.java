package rohit;

public class TestDevice {

	public static void main(String[] args) {
		Device d=new Device(" main device");
		d.doSomething();
		d=new T(" onida TV ");
		d.doSomething();
		T t=(T)d;
		t.watch();
		t.switchChannel();
		d=new Printer(" Canon printer ");
		d.doSomething();
		Printer p=(Printer)d;
		p.print();
		d=new Microwave(" IFB microwave");
		d.doSomething();
		Microwave m=(Microwave)d;
		m.cook();
		//T t1=(T)d;
		//t1.doSomething();
	}

}
