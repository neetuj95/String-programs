 package stringPro;

public class SwapString {

	public static void main(String[] args) {
		/*String ss="this";
		char[] chararray=ss.toCharArray();
		char temp=chararray[0];
		chararray[0]=chararray[chararray.length-1];
		chararray[chararray.length-1]=temp;
		System.out.println(String.valueOf(chararray));*/
		
		
		String str = "this is program for swap first letter with the last letter of word";
         
		String[] word=str.split(" ");
		String value =" ";
		
		for(int i=0;i<word.length;i++)
		{
		     value=word[i];
		    char[] chararray=value.toCharArray();
		 
			char temp=chararray[0];
		    chararray[0]=chararray[chararray.length-1];
		    chararray[chararray.length-1]=temp;
		    System.out.print(String.valueOf(chararray)+" ");
		}
		
		}
		
}