package rohit;

import java.util.Scanner;

public class TestThreadQ5 {

	public static void main(String[] args) throws InterruptedException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter path");
		String path=s.nextLine();
		LetterCounterJob l=new LetterCounterJob(path);
		Thread t1=new Thread(l);
		t1.start();
		System.out.println("next prime jobb");
		NextPrimeJob j=new NextPrimeJob(6783);
		Thread t2=new Thread(j);
		t2.start();
		t1.join();
		t2.join();
	}

}
