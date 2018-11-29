package rohit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo2 {

	public static void main(String[] args) throws IOException {
		File f=new File("/home/uttara/Desktop/rohit/src/Textfile.txt");
		//System.out.println(f.exists());
		BufferedWriter bw=null;
		
		try {
			bw=new BufferedWriter(new FileWriter(f));
			bw.write(100);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			if(bw!=null)
			try {
				bw.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		

	}

}
