package stringPro;

public class Methods2 {
	 public static void main(String[] args) {
			
	    	 // String x = new String();
	    	  String s1 ="hellojava java";
	    	  String s2= " world";
	          System.out.println(s1.concat(s2));//merge the string
	          System.out.println(s1.contains("hello"));//value in true or false //check the availability of content in original string
	          System.out.println(s2.contentEquals(" world"));//value in true or false//string should be equals to given original string
	          System.out.println(s1.endsWith("html"));//value in true or false//string end with the given original string or not
	          System.out.println(s1.endsWith("java"));
	          System.out.println(s1.indexOf('l'));//give index of given character
	          System.out.println(s1.indexOf("java"));//give index of given string
	          System.out.println(s1.indexOf('a',8));////give index of given character after that given index
	          System.out.println(s1.lastIndexOf('l'));//give index of given character from last 
	          System.out.println(s1.repeat(2));//repeat the whole string by given count
	          System.out.println(s1.replace("java","html"));//replace old string to new string
	          System.out.println(s1.replaceAll("hellojava java","hi"));//replaceall old string to new string
	          System.out.println(s1.replaceFirst("java","world"));//replace old string word  to new word
	         String b[]=s1.split("j");//split the given string array from the given character 
	         int c =b.length;
	         for(int i=0;i<c;i++)
	         {
	        	 System.out.println(b[i]);
	         }
	         System.out.println(s1.substring(2));//sub string from the given string index 
	         System.out.println(s1.substring(5));//sub string from the given string index
	         System.out.println(s1.substring(5,9));///sub string from the given string start index to end index
	 }
}
