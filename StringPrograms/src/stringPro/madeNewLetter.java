 package stringPro;

public class madeNewLetter {

	public static void main(String[] args) {
		String s ="this is a program for finding vowels";
		String sentence= s.toLowerCase();
		String[] word=sentence.split(" ");
		String value =" ";
		String newword=" ";
		for(int i=0;i<word.length;i++)
		{
		     value=word[i];
		     char ch =value.charAt(0);
		   newword =newword+ch;
		  }
		 System.out.println(newword);
	}
}
