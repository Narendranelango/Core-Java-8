package Lfourteen;


//@FunctionalInterface
//interface Dummy{
//	public int power(int a,int b);
//}
//public class Lambda1 {
//	public void test() {
//		
//		Dummy d=( x,y)->(int) Math.pow(x,y);
//		System.out.println(d.power(2, 2));
//	}
//  public static void main(String[] args)
//  {
//	  Lambda1 l=new Lambda1();
//	  l. test();
//  }
//}







//interface Dummy{
//	public String space(String s);
//	
//}
//public class Lambda1{
//	public void sol()
//	{
//		Dummy d1=(s)->s.replaceAll(".","$0 ");
//		System.out.println(d1.space("CAPGEMINI"));
//	}
//	public static void main(String[] args)
//	{
//	  Lambda1 la=new Lambda1();
//	  la.sol();
//	}
//}


//import java.io.*;
//public class Lambda1{
//	public static void main(String[] args) throws IOException
//	{
//		FileInputStream fis=null;
//		BufferedReader br=null;
//		BufferedWriter fw=null;
//		StringBuilder sb=null;
//		String line=null;
//		try {
//			br=new BufferedReader(new FileReader("C:\\Java8\\abc.txt"));
//			fw=new BufferedWriter(new FileWriter("C:\\Java8\\abcd.txt"));
//		}
//		catch(FileNotFoundException e) 
//		{
//			System.out.println("FileNotFound");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		while((line=br.readLine())!=null) {
//			sb=new StringBuilder(line).reverse();
//			String res=sb.toString();
//			fw.write(res);
//		}
//		try {
//		br.close();
//		fw.close();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//	}
//}


//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class Lambda1 {
//
//	public static void main(String[] args) {
//		File file = new File("C:\\Java8\\Naren.txt");
//		Scanner sc;
//		try {
//			sc = new Scanner(file);
//
//			while (sc.hasNextLine()) {
//				String numbers = sc.nextLine();
//				String[] nums = numbers.split(",");
//				for (String digit : nums) {
//					if (Integer.parseInt(digit) % 2 == 0)
//						System.out.println(digit);
//				}
//			}
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		}
//
//	}
//
//}



//public class Lambda1{
//	public static void main(String[] args)
//	{
//		String emp="";
//		String str="Naren";
//		char[] n=str.toCharArray();
//		for(int i=n.length-1;i>=0;--i) {
//			
//			if(i==0)
//			{
//				emp=emp+n[i];
//				break;
//			}
//			else
//				emp=emp+n[i]+"-";
//		}
//		System.out.println(emp);
//	}
//}
//@FunctionalInterface
// interface Service{
//	boolean isnill(String n,String p);
//}
//
//class Lambda implements Service{
// public void doing() {
//	 Service s=(n,p)->{
//			if(n.equals(null) || p.equals(null)) 
//				return false;
//				else 
//				return true;
//			
//		};
//		System.out.println(isnill("Hii","Na"));
// }
//
//@Override
//public boolean isnill(String n, String p) {
//	// TODO Auto-generated method stub
//	return false;
//}
//}
// public class Lambda1{
//	public static void main(String[] args) {
//		Lambda l=new Lambda();
//		l.doing();
//	}
//
//}





//public class Lambda1{
//	public static void main(String[] args) {
//		String str="Hello World";
//		char[] c=str.toCharArray();
//		int len=c.length-1;
//		char t=c[0];
//		c[0]=c[len];
//		c[len]=t;
//		System.out.println(c);
//	}
//}



//import java.util.*;
//public class Lambda1 {
//	public static void main(String[] args) {
////	    Scanner sc=new Scanner(System.in);
//		String n = "Cognizant Technologies Solution";
//		String[] d = n.split(" ");
//		int len = d.length;
//		for (int i = 0; i < len; i++) {
//			String n1 = d[i];
//			String n4 = n1.substring(0, 1);
//			System.out.println(n4);
//
//		}
//
//	}
//
//}


public class Lambda1{
	public static void main(String[] args)
	{
		String str="Hi selfvde How are you Girafee";
		String[] arr=str.split(" ");
		int len=arr.length;
		String a;
		String maxi=arr[0];
		for(int i=0;i<len-1;i++) {
			if(arr[i].length()<arr[i+1].length()) {
				maxi=arr[i+1];
				}
			}
		System.out.println(maxi);		
	}	
}