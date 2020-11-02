package Lthree;

import java.util.Scanner;
public class Strings {
	public static String concat(String str)
	{
		String res= str+str;
		return res;
	}//concat
	public static String oddHash(String str)
	{
		for(int i=0;i<=str.length();i++)
		{
			if(i%2!=0)
			{
				str = str.substring(0,i-1) + "#" + str.substring(i, str.length());
			}
		}
		return str;
	}//oddHash
	
	public static String duplicate(String str)
	{
		String res="";
		
		for(int i=0; i<str.length();i++)
		{
			if(i+1<str.length() && str.charAt(i)!=str.charAt(i+1))
			{
				res=res+str.charAt(i);
			}
			if(i+1==str.length())
			{
				res=res+str.charAt(i);
			}
		}

		return res;
	}//duplicate
	
	public static String oddUpper(String str)
	{
		str=str.toLowerCase();
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				res=res+Character.toLowerCase(str.toCharArray()[i]);
			}
			else
			{
				res=res+Character.toUpperCase(str.toCharArray()[i]);
			}
		}
		return res;
	}//oddUpper
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String: ");
		String str= sc.nextLine();
		
		System.out.println("Enter operation to perform:");
		System.out.println("\n1. Add string to itself\n2. Replace odd positions with #");
		System.out.println("3. Remove duplicate characters in the String\n4. Change odd characters to upper case");
		
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1: 
			System.out.println(concat(str));
		break;
		case 2: System.out.println(oddHash(str));
		break;
		case 3: System.out.println(duplicate(str));
		break;	
		case 4: System.out.println(oddUpper(str));
		break;
		}//switch
	}

}