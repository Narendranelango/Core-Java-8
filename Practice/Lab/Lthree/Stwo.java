package Lthree;

public class Stwo {
public static void main(String[] args) {
	String str="COmXxxvxmnh";
	char[] te=str.toCharArray();
	String res="";
	String dummy="";
	for(int i=0;i<te.length-1;i++) {
		if(te[i]=='x') {
			res+='x';
		}
		else if(!(te[i]=='x')) {
			dummy+=te[i];
		}
	}
	System.out.println(dummy+res);
}
}
