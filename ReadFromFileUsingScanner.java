//Java Program to illustrate reading from Text File 
//using Scanner Class 

import java.io.File; 
import java.util.Scanner; 

public class ReadFromFileUsingScanner {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// pass the path to the file as a parameter
		
		File tfile = new File("test.txt");
		Scanner sc = new Scanner(tfile);
		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
	}

}