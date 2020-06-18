import java.io.*;
import java.util.Scanner;

public class theFile {
	public static int min(String str) 
	{
		int minNum = 100;
		int num;
		
		for (int i = 0; i < str.length(); i++) 
		{
			if (Character.isDigit(str.charAt(i)))
			{
				num = Character.getNumericValue(str.charAt(i));
				while (i < (str.length()-1) && str.charAt(i+1) != ',') {
					i++;
					num = (num*10) + Character.getNumericValue(str.charAt(i));
				}
				minNum = Math.min(minNum, num);
			}
		}
		
		return minNum;
	}
	
	public static int max(String str) 
	{
		int maxNum = 0;
		int num;
		
		for (int i = 0; i < str.length(); i++) 
		{
			if (Character.isDigit(str.charAt(i)))
			{
				num = Character.getNumericValue(str.charAt(i));
				while (i < (str.length()-1) && str.charAt(i+1) != ',') {
					i++;
					num = (num*10) + Character.getNumericValue(str.charAt(i));
				}
				maxNum = Math.max(maxNum, num);
			}
		}	
		
		return maxNum;
	}
	
	public static int avg(String str) 
	{
		int count = 0;
		int sum = 0;
		int num;
		
		for (int i = 0; i < str.length(); i++) 
		{
			if (Character.isDigit(str.charAt(i)))
			{
				num = Character.getNumericValue(str.charAt(i));
				while (i < (str.length()-1) && str.charAt(i+1) != ',') {
					i++;
					num = (num*10) + Character.getNumericValue(str.charAt(i));
				}
				sum += num;
				count++;
			}
		}
		
		return sum/count;
	}



	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File tfile = new File("in.txt");
		Scanner sc = new Scanner(tfile);
		String str;
		int min;
		int max;
		int avg;
		
		while (sc.hasNextLine())
		{
			str = sc.nextLine();
			switch (str.substring(0,3)) {
			case "Min":
				min = min(str);
				System.out.println("The min of ["+ str.substring(5)+"] is "+ min);
				break;
			case "Max":
				max = max(str);
				System.out.println("The max of ["+ str.substring(5)+"] is "+ max);
				break;
			case "Avg":
				avg = avg(str);
				System.out.println("The avg of ["+ str.substring(5)+"] is "+ avg);
				break;
			default:
				System.out.println(str);
				break;
			}
		}
		
	}
}
