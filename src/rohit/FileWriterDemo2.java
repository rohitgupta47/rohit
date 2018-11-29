package rohit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileWriterDemo2 {

	public static void main(String[] args) 
	{
		/*BufferedWriter bw=null;
		String line = null;
		try {
			bw=new BufferedWriter(new FileWriter("/home/uttara/Desktop/rg.txt"));
			line="from BufferedWriter im writing this at 9:47 am";
			bw.write(line);
			System.out.println("infosolution");
		}
		catch(IOException e)
		{
			e.printStackTrace();
			}
		finally
		{
			try 
			{
				bw.close();
			}catch(IOException e)
			{e.printStackTrace();}
		}
		File f=new File("Desktop/rohit/raga.txt");
		f.createNewFile();*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file path ");
		String s1=sc.next();
		File f=new File(s1);
		File f1=new File("/home/uttara/Desktop/rohit/src");
		//File f=new File();
		try {
			f1.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(f.exists());
	}

}
