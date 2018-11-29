package rohit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrintFilePalindrom {

	public static void main(String[] args) {
		System.out.println("Enter the path");
		Scanner s=new Scanner(System.in);
		String sr=s.nextLine();
		File file=new File(sr); 
		BufferedReader br=null;
		String line;
		try {
			br=new BufferedReader(new FileReader(file));
			while((line=br.readLine())!=null) {
				System.out.println(line);
				
			line=line.toLowerCase();
			String[] array=line.split(" ");
			String reverse="";
			for(String word:array) {
				int len=word.length();
				for(int i=len-1;i>=0;i--) {
					reverse=reverse+word.charAt(i);
				}
				if(word.equals(reverse)) 
					System.out.println(reverse+" is palindrom word");
					else System.out.println(reverse+" not a palindrom word");
			reverse="";	
			}
				
			}
		}
			
			catch(IOException e) {
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


