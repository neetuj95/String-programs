package stringPro;

public class SwapFirstSecond {

	public static void main(String[] args) {
		String str = "this is program for swap first letter with the last letter of word";
        
		String[] word=str.split(" ");
		String value =" ";
		
		for(int i=0;i<word.length;i++)
		{
		     value=word[i];
		    char[] chararray=value.toCharArray();
		 
			char temp=chararray[0];
		    chararray[0]=chararray[1];
		    chararray[1]=temp;
		    System.out.print(String.valueOf(chararray)+" ");
		}

	}

}
