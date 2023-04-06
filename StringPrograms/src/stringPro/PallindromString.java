
package stringPro;

public class PallindromString {

	public static void main(String[] args) {
		String  str = "velocity";
		System.out.println(str);
		String rev ="";
		char ch =' ';
		int x=str.length();
		for(int i=0;i<x;i++)
		{
			 ch=str.charAt(i);
			 rev = ch+rev;
		}
		
		System.out.println(rev);
		if(str.equals(rev))
		{
			System.out.println("it is pallindrom");
		}
		else
		{
			System.out.println("it is not pallindron");
		}
	}

}
