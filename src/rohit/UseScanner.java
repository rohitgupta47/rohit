package rohit;

import java.io.File;
import java.util.Scanner;

public class UseScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter file path");
		String s1=sc.next();
		File f=new File(s1);
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isDirectory());
		System.out.println(f.length());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		File[] ff=f.listFiles();
		for(File f1:ff)
		{
			System.out.println(f1.getName());
		}
	
		}

}
