package stringPro;

import java.util.Arrays;

public class RemoveChar {

	public static void main(String[] args) {
		String str ="this program for remove character";
		char[] mystr=str.toCharArray();
		int n = str.length();
		int index =0;
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(mystr[i] == mystr[j])
				{
					break;
				}
			}
			if(j==i)
			{
				mystr[index++]=mystr[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(mystr, index)));
    }
}
