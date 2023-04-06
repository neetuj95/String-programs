
package stringPro;

public class findVowel {

	public static void main(String[] args) {
		String s ="this is a program for finding vowels";
		String sentence= s.toLowerCase();
		String[] word=sentence.split(" ");
		String value =" "; 
		for(int i=0;i<word.length;i++)
		{
		     value=word[i];
		     char ch = value.charAt(0);
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			 {
				 System.out.println("letter start with a vowel " +ch);
			 }
			 else
			 {
				 System.out.println("letter start with a consonant "+ch);
			 }
		}
	}

}
