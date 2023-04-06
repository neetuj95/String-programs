package stringPro;

public class UppercaseOfEachWord {
 public static void main(String args[])
 {
		String s = "this is program for swap first letter with the last letter of word";
        
		String[] word=s.split(" ");
		String value =" ";
	
		for(int i=0;i<word.length;i++)
		{
		     value=word[i];
		     char[] chararray=value.toCharArray();
		    chararray[0]=Character.toUpperCase(chararray[0]);
		     
		   System.out.print(String.valueOf(chararray)+" ");
		}  
	   
 }
}
