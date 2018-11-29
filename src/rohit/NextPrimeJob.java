package rohit;

public class NextPrimeJob implements Runnable {
private long range;
private long primeNum;
public long getPrimeNum() {
	return primeNum;
}
public NextPrimeJob(long n) {
	range=n;
}
public void run() {
	boolean flag=true;
	outer:while(flag) {
		long val=(long)(Math.random()*range);
		if(val%2==0)
			continue;
		for(int i=3;i<(long)Math.sqrt(val);i+=2) {
			if(val%i==0)
		continue outer;
			
		}long t1=System.currentTimeMillis();
		System.out.println("time taken by prime no. thread "+t1);
	primeNum=val;
	System.out.println("prime num generated "+val);
	flag=false;
	}
}
}
