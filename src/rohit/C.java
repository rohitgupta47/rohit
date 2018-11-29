package rohit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class C {
	public static void main(String[] args) {
		File file=new File("/home/uttara/Desktop/Test.txt");
		BufferedReader br=null;
		String line;
		try {
			br=new BufferedReader(new FileReader(file)); 
		while((line=br.readLine())!=null) {
				System.out.println(line);
		}}catch(IOException e)
		{e.printStackTrace();}
		finally {
			if(br!=null)
				try {
					br.close();
				}
			catch(IOException e) {
				e.printStackTrace();
				}
		}

	}
}
