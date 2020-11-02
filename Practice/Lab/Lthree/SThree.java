package Lthree;
public class SThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		char[] a=str.toCharArray();
		char temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
	System.out.println(a);
		
	}

}
