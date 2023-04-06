  package stringPro;

import java.util.Scanner;

public class MaxCharOcurrence {

	public static void main(String[] args) {
		/*
		 * Scanner sc= new Scanner(System.in); System.out.println("enter the string");
		 * String str= sc.nextLine();
		 */
		String str="my name is neetujaiswal wife of pawanjaiswal";
		str=str.toUpperCase();
		int count=0;
		int max=0;
		char chr=str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
			count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
					
				}
			}
			if(count>=max)
			{
				max=count;
				chr=str.charAt(i);
			}
		}
		System.out.println("max occurence character is "+chr+" and the no of occurence is"+max);
		
	}

}
