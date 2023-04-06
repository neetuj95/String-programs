package stringPro;
import java.io.File;
public class FileNameAndExtension {
	//14.Java program to print file name and extension of file from given url
	
	
	public static void main(String[] args)
	{
	File file = new File("D:\\velocity_data\\zipFiles\\stringPrograms\\RevSentance1.java");
	String fileName = file.getName();
	System.out.println("File Name is = "+fileName);
	int index = fileName.lastIndexOf('.');
	//System.out.println(index);
	if(index > 0)
	{
	String extension = fileName.substring(index + 1);
	System.out.println("File extension is = " + extension);
	}
	}
	}

