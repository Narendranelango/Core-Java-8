package Lthree;
public class Sone {
	public static void main(String[] args) {
		String str="computer";
		String res="";
		char[] k=str.toCharArray();
		
		for(int i=k.length-1;i>=0;i--) {
			if(i==0) { 
				res=res+k[i];
			break;
			}
			else
			res=res+k[i]+"-";
		
		}
		System.out.print(res);
	}

}
