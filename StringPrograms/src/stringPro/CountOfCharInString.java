package stringPro;

public class CountOfCharInString {
	public static void main(String[] args) {
		String info = "javaTpoint is the best learning website";  
		//converting into uppercase
		String s =info.toUpperCase();
        //Converting string to character array  
        char str[] = s.toCharArray();  
        //Calculating length of the character array  
        int len = s.length();   
	    int count=0;
        for(char j='A';j<='Z';j++)
        {
        	for(int i=0;i<len;i++)
        	{
        		if(j==str[i])
        		{
        			count++;
        		}
        	}
        	if(count>0)
        	{
        		System.out.println("char = "+j+" count ="+count);
        		count=0;
        	}
        }
	
	}
}
