package rohit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LetterCounterJob implements Runnable{

	Scanner s=new Scanner(System.in);
	String path=s.nextLine();
	int count=0;
	public LetterCounterJob(String path) {
		this.path=path;
	}
	public void run() {
		BufferedReader br=null;
		String l;
		File f=new File(path);
		try {
			br=new BufferedReader(new FileReader(f));
			
				while((l=br.readLine())!=null)
				{
					String[] sa=l.split(" ");
					for(String d:sa)
					{
						for(int i=0;i<d.length();i++)
						{
							if(Character.isAlphabetic(d.charAt(i)))
							{
								count++;
							}
						}
						
					}
				}
				System.out.println(count);
			long t2=System.currentTimeMillis();
			System.out.println("time taken by countLetterjob class "+t2);
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
}
}
