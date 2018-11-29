package rohit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		BufferedReader br=null;
		String line;
		try {
			br=new BufferedReader(new FileReader("/home/uttara/Desktop/rohit/src/Item.java"));
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(br!=null)
			try {
				br.close();
				}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		

	}

}
