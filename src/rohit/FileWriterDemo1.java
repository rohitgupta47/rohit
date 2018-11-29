package rohit;
import java.io.*;
public class FileWriterDemo1 {

	public static void main(String[] args) throws IOException {
		File f=new File("/home/uttara/Desktop/rohit/rg.txt");
		File f1=new File("/home/uttara/Desktop/rohit/rg1.txt");

		BufferedReader br=null;
		BufferedWriter bw=null;
		String line;
		try {
		br=new BufferedReader(new FileReader(f));
		bw=new BufferedWriter(new FileWriter(f1));
		
		
		while((line=br.readLine())!=null) 
		{
			
			System.out.println(line);
			bw.write(line);
			bw.write("lyrics of coldplay...see sky full of starrs");
			bw.newLine();
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		finally {
			if(br!=null)
				try {
					br.close();
				}
				catch(IOException e) {
					e.printStackTrace();
					}
			if(bw!=null)
				try {
					bw.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
}}}
