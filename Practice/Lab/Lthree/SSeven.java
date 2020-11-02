package Lthree;
//My method

public class SSeven {
	public static void main(String[] args) {
	String test="abcde";
	   String ress="";
	   char[] c=test.toCharArray();
	   for(int i=0;i<c.length;i++)
	   {
		   ress+=(char)(c[i]+1);
	 
}
	   System.out.println(ress);
	}
}





//String test="abcde";
//String ress="";
//for(char c:test.toCharArray())
//	   ress+=(char)(c+1);
//System.out.println(ress)