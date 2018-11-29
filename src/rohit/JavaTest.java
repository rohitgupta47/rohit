/*WAP to take input of path of file & do the following:
1) count the number of words that have only digit in it
2) identify if a word contains only digits and if yes, find out if it is prime
3) sort words based on num of occurrences 
4) replace "and" word by "&" symbol and write it back to the file

If you do not know Java IO, take sentences as input in 
a string and then do the above. Note that points will be
deducted if you do not do IO operations.*/
package rohit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class JavaTest {

	public static void main(String[] args) throws IOException {
		File file=new File("/home/uttara/Desktop/Test.txt");
		File f2=new File("/home/uttara/Desktop/Test1.txt");
		f2.createNewFile();
		System.out.println("f2.exists():::"+f2.exists());
		BufferedReader br=null;
		BufferedWriter bw=null;
		List<String>list=new ArrayList();
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		
		//map.
		String line;
	//	System.out.println(file.exists());
		try {
			br=new BufferedReader(new FileReader(file)); 
			bw=new BufferedWriter(new FileWriter(f2));
		while((line=br.readLine())!=null)
		{/*open the letter1 23 5454 74 94 this is forth446 and fifth567 and and adn and*/
				System.out.println(line);
				String[] str=line.split(" ");
				for(String addto:str) 
				{
					if(!map.containsKey(addto))
						map.put(addto, 1);
					else
						map.put(addto, map.get(addto)+1);
				}
				 line = line.replaceAll("and","&");
				 bw.write(line);
				 bw.write(100);
				 bw.flush();
				 System.out.println(line);
				 int count=0;
				 for(String ex:str) {
				if(ex.matches("[0-9]+"))
					count++;
				
					 }System.out.println(count);
			}
		System.out.println(map);
		/*for(String s: list) {
			int i=Collections.frequency(list, s);
			System.out.println(s+": is occuring "+i+" times");
		}*/
		}
	catch(IOException e)
		{e.printStackTrace();}
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
		}

	}

}
