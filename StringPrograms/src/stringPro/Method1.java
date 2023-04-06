package stringPro;

public class Method1 {
       
      public static void main(String[] args) {
		// TODO Auto-generated method stub
    	//  String x = new String();
    	  String s1 ="hello";
          String s2= "world";
         int a = s1.length();
         System.out.println(a);
         //boolean b=s1.equals(s2);
         System.out.println(s1.equals(s2));  
         String s3= "WORLD";
        // boolean c=s2.equalsIgnoreCase(s3);
         System.out.println(s2.equalsIgnoreCase(s3));  
         String s4= "   WORLD    ";
         int y = s4.length();
         System.out.println(y);
         System.out.println(s4);
        String z=s4.trim();
        System.out.println(z);
        int y1= z.length();
        System.out.println(y1); 
        String s5= "      ";
        System.out.println(s5.isBlank());

        System.out.println(s5.isEmpty());
        
        
	}

}
