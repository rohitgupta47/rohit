package rohit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestIO {

	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the path");
		String str=s.next();
		String line;
		BufferedReader br=null;
		File f=new File(str);
		if(f.exists()&&f.getName().contains(".txt"))
		{
			List<String>words=new ArrayList();
			try {
				br=new BufferedReader(new FileReader(f));
				while((line=br.readLine())!=null) 
				{
					System.out.println(line);
					String[] array=line.split(" ");
					for(String ss:array)
						words.add(ss);
			
					
					
				}
				System.out.println(words);
				System.out.println(Collections.frequency(words,"is"));
				int max=0;
				String sa="";
				
				
			}
			 catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
			finally
			{
				if(br!=null)
					br.close();
				}
			}
		}
	}
