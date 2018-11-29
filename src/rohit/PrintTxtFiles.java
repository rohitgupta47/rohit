package rohit;

import java.io.File;
import java.util.Scanner;
//iolab Q5
public class PrintTxtFiles {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("enter path ");
		String s=d.nextLine();
		File f=new File(s);
		/*System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.length());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());		
		System.out.println(f.getParentFile());
		System.out.println(f.getPath());
		System.out.println(f.toString());
		//System.out.println(f.);
		File[] ff=f.listFiles();
				for(File e:ff)
					System.out.println(e.getName());*/
		if(f.isDirectory())
		{
			int c=0;
			File[] fa=f.listFiles();
			for(File file:fa)
			{
				if(file.isFile()&&file.getName().endsWith(".java"))
				{
				System.out.println(file.getName());
				}
			}
		}
	}

}
