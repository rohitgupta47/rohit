package rohit;
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) {
	BufferedReader br=null;
	String line;
	try {
		br=new BufferedReader(new FileReader("/home/uttara/Desktop/rg.txt"));
	
		while((line=br.readLine())!=null) 
		{
			System.out.println(line);
		}}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	finally {
		if(br!=null)
			try {
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
	}

}
