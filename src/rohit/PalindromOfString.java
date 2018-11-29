package rohit;

import java.util.Scanner;

public class PalindromOfString {
		public static void main(String[] ags) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter some string sentence");
			String s=scan.nextLine();
			String[] array=s.split(" ");
			String reverse="";
			for(String each:array) {	
			int len=each.length();
			for(int i=len-1;i>=0;i--) {
				reverse=reverse+each.charAt(i);
			}
			if(each.equals(reverse))
				System.out.println(reverse+" is a palindrom word");
			else System.out.println(reverse+" is not a palindrom");
			reverse = "";
			}
		}
}
