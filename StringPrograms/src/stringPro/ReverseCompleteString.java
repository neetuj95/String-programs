package stringPro;

public class ReverseCompleteString {

	public static void main(String[] args) {
		String str = "i am neetu";
	     str = str + " " ;
		String word="";
		String rev ="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
			word = word+ch;	
			
			}
			else
			{
				rev = word+" "+rev;
				word="";
			}
			
		}
		System.out.println(rev);

	}

}
