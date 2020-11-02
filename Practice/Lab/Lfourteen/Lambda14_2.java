package Lfourteen;

interface Dumm{
public String space(String s);

}
public class Lambda14_2{
public void sol()
{
	Dumm d1=(s)->s.replaceAll(".","$0 ");
	System.out.println(d1.space("CAPGEMINI"));
}
public static void main(String[] args)
{
	Lambda14_2 la=new Lambda14_2();
  la.sol();
}
}