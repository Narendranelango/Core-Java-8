package Lfourteen;
@FunctionalInterface
interface Dummy{
	public int power(int a,int b);
}
public class Lambda14_1 {
	public void test() {
		
		Dummy d=( x,y)->(int) Math.pow(x,y);
		System.out.println(d.power(2, 2));
	}
  public static void main(String[] args)
  {
	  Lambda14_1 l=new Lambda14_1();
	  l. test();
  }
}