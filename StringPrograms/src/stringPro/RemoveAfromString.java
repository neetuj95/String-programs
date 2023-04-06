package stringPro;

public class RemoveAfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="aabbbscsa";
		int count=s.length();
		int countremovea=s.replace("a","").length();
		int total= count-countremovea;
		System.out.println(total);;

	}

}
