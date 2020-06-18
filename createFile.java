import java.io.*; 

public class createFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Creates File
		String str = "Make Libby Murphy real";
		
		FileWriter fw = new FileWriter("output.txt");
		
		for (int i = 0; i < str.length(); i++) 
			fw.write(str.charAt(i));
		
		System.out.println("Writing successful");
		fw.close();			
		
		//Reads File
		int ch;
		
		FileReader fr = null;
		try	{
			fr = new FileReader("output.txt");
		}
		catch (FileNotFoundException fe) {
			System.out.println("File not found");
		}
		
		while ((ch = fr.read()) != -1)
			System.out.print((char)ch);
		
		fr.close();
	}
}
